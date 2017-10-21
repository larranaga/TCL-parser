grammar TclV3;

tcl                 :   subRoutine* instructionBlock EOF;

instructionBlock    :   instruction*;

subRoutine          :   PROC ID '{' ('{'ID'}')* '}' '{' subRoutineInstruction* '}';

subRoutineInstruction   :   declaration ';'
                        |   execute ';'
                        |   readInput ';'
                        |   writeOutput ';'
                        |   subRoutineIfBlock
                        |   subRoutineWhileBlock
                        |   subRoutineForBlock
                        |   subRoutineSwitchBlock
                        |   returnBlock ';'
                        ;

subRoutineIfBlock             :   IF '{' expression '}' THEN '{' subRoutineInstruction '}' (ELSEIF '{' expression '}' THEN '{' subRoutineInstruction '}')* (ELSE '{' subRoutineInstruction '}')?;

subRoutineWhileBlock          :   WHILE '{' expression '}' '{' subRoutineCycleInstruction* '}';

subRoutineForBlock            :   FOR '{' SET ID forSetArgument '}' '{' expression '}' '{' INCR ID INTEGERVALUE? '}' '{' subRoutineCycleInstruction* '}';

subRoutineCycleInstruction  :   subRoutineInstruction
                            |   BREAK ';'
                            |   CONTINUE ';'
                            ;

subRoutineSwitchBlock       :   SWITCH '$' ID '{' subRoutineCaseBlock* subRoutineDefaultBlock? '}';

subRoutineCaseBlock         :   CASE INTEGERVALUE '{' subRoutineInstruction* '}';

subRoutineDefaultBlock      :   DEFAULT '{' subRoutineInstruction* '}';


returnBlock                 :   RETURN returnArgument?;

returnArgument              :   callID
                            |   execute
                            |   value=(INTEGERVALUE | STRINGVALUE | DOUBLEVALUE)
                            ;

instruction         :   declaration ';'
                    |   execute ';'
                    |   readInput ';'
                    |   writeOutput ';'
                    |   ifBlock
                    |   whileBlock
                    |   forBlock
                    |   switchBlock
                    ;

declaration         :   SET ID ('(' array_index ')')? value_to_assign;


array_index         :   execute
                    |   value=(INTEGERVALUE | DOUBLEVALUE | STRINGVALUE)
                    ;

value_to_assign     :   value=(INTEGERVALUE | DOUBLEVALUE | STRINGVALUE)
                    |   execute
                    |   callID
                    ;

execute             :   '[' executeBody ']';

executeBody         :   EXPR '{' expression '}'
                    |   ID subroutineArgumentListCall
                    |   ARRAY arrayCallArguments
                    |   readInput
                    ;

subroutineArgumentListCall  :   subRoutineArgumentCall* ;

subRoutineArgumentCall      :   '{' subRoutineArgumentFormat '}' ;

subRoutineArgumentFormat    :   execute
                            |   EXPR '{' expression '}'
                            |   callID
                            |   value=(INTEGERVALUE | DOUBLEVALUE | STRINGVALUE)
                            ;

arrayCallArguments          :   SIZE ID
                            |   EXISTS ID
                            ;

readInput           :   GETS STDIN;

writeOutput         :   PUTS outputArgument;

outputArgument      :   execute
                    |   value=(INTEGERVALUE | STRINGVALUE | DOUBLEVALUE)
                    |   callID
                    ;

ifBlock             :   IF '{' expression '}' THEN '{' instructionBlock '}' (ELSEIF '{' expression '}' THEN '{'instructionBlock '}')* (ELSE '{' instructionBlock '}')?;


whileBlock          :   WHILE '{' expression '}' '{' cycleInstruction* '}';

forBlock            :   FOR '{' SET ID forSetArgument '}' '{' expression '}' '{' INCR ID INTEGERVALUE? '}' '{' cycleInstruction* '}';

forSetArgument      :   INTEGERVALUE
                    |   EXPR '{' expression '}'
                    |   callID
                    ;


cycleInstruction    :   instruction
                    |   BREAK ';'
                    |   CONTINUE ';'
                    ;

switchBlock         :   SWITCH '$' ID '{' caseBlock* defaultBlock? '}';

caseBlock           :   CASE INTEGERVALUE '{' instruction* '}';

defaultBlock        :   DEFAULT '{' instruction* '}';


id                  :   ID ('(' expression ')')? ;

callID              :   '$' id;

expression          :   value=(INTEGERVALUE | DOUBLEVALUE | STRINGVALUE)
                    |   execute
                    |   callID
                    |   '(' expression ')'
                    |   op=('-'| '!') expression
                    |   expression '**' expression
                    |   expression op=('/' | '*' | '%') expression
                    |   expression op=('+' | '-') expression
                    |   expression op=('<' | '<=' | '>' | '>=') expression
                    |   expression op=('==' | 'eq' | '!=' | 'ne') expression
                    |   expression '&&' expression
                    |   expression '||' expression
                    ;

//keywords
SET                 :   'set';
GETS                :   'gets';
STDIN               :   'stdin';
PUTS                :   'puts';
IF                  :   'if';
THEN                :   'then';
ELSEIF              :   'elseif';
ELSE                :   'else';
SWITCH              :   'switch';
DEFAULT             :   'default';
WHILE               :   'while';
EXPR                :   'expr';
CONTINUE            :   'continue';
BREAK               :   'break';
FOR                 :   'for';
INCR                :   'incr';
ARRAY               :   'array';
EXISTS              :   'exists';
SIZE                :   'size';
PROC                :   'proc';
RETURN              :   'return';
CASE                :   'case';


//lexems
STRINGVALUE         :   '"'(~[\r\n])*'"';
INTEGERVALUE        :   [0-9][0-9]*;
DOUBLEVALUE         :   [0-9]+'.'[0-9]+;

ID                  : [a-zA-Z_][a-zA-Z0-9_]*;
WS                  : [ \n\t\r]+ -> skip ;
COMMENT             : '#' ~[\r\n]* -> skip;
ERRORCHARACTER      : . ;