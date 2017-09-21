grammar TclV2;

tcl                 :   subRoutineBlock instructionBlock EOF;

instructionBlock    :   instruction instructionBlock
                    |
                    ;


instruction         :   declaration ';'
                    |   ifBlock
                    |   whileBlock
                    |   forBlock
                    |   switchBlock
                    |   readInput ';'
                    |   writeOutput ';'
                    |   execution ';'
                    ;

/*********************************************expressions**************************************************************/
expression          :   value binary_expression
                    |   unary_expression
                    |   '(' expression ')' binary_expression
                    |   single_id binary_expression
                    |   execution binary_expression
                    ;

binary_expression   :   binary_operator expression
                    |
                    ;

unary_expression    :   unary_operator expression;

binary_operator     :   '+' | '-' | '*' | '/' | '**' | '%' | '||' | '&&' | '==' | '!=' | '<' | '>' | '<=' | '>=' | 'ne' | 'eq';
unary_operator      :   '!' | '-';
single_id           :   '$' ID array;




/*********************************************subroutines**************************************************************/
subRoutineBlock     :   subRoutineDeclaration subRoutineBlock
                    |
                    ;

subRoutineDeclaration   :   'proc' ID '{' subRoutineArgumentListDeclaration '}' '{' instructionBlockSubroutine '}';


subRoutineArgumentListDeclaration   :   subRoutineArgumentDeclaration subRoutineArgumentListDeclaration
                                    |
                                    ;

subRoutineArgumentDeclaration       :   '{' ID '}';

instructionBlockSubroutine          :   subRoutineInstruction instructionBlockSubroutine
                                    |
                                    ;
subRoutineInstruction               :   declaration ';'
                                    |   ifBlock
                                    |   whileBlock
                                    |   forBlock
                                    |   switchBlock
                                    |   readInput ';'
                                    |   writeOutput ';'
                                    |   execution ';'
                                    |   returnStatement ';'
                                    ;

returnStatement                     :   'return' returnArguments;

returnArguments                     :   single_id
                                    |   execution
                                    |
                                    ;




/*********************************************declaration *************************************************************/

declaration         :   'set' ID array value_to_assign;

value_to_assign     :   value
                    |   execution
                    |   single_id
                    ;

array               :   '(' array_index')'
                    |
                    ;

array_index         :   execution
                    |   value
                    ;


/*********************************************input-output*************************************************************/
readInput           :   'gets' 'stdin';

writeOutput         :   'puts' outputArgument;

outputArgument      :   execution
                    |   value
                    |   single_id
                    ;

/*********************************************execution****************************************************************/

subRoutineArgumentListCall      :   subRoutineArgumentCall subRoutineArgumentListCall
                        |
                        ;

subRoutineArgumentCall          :   '{' subRoutineArgumentFormat '}';

subRoutineArgumentFormat        :   execution
                                |   'expr' '{' expression '}'
                                |   single_id
                                |   value
                                ;


arrayCallArguments          :   'size' ID
                            |   'exists' ID
                            ;

execution           :   '[' executionBody ']';

executionBody       :   'expr' '{' expression '}'
                    |   ID subRoutineArgumentListCall
                    |   'array' arrayCallArguments
                    |   readInput
                    ;

/******************************************** control structures*******************************************************/

//if
ifBlock             :   'if' '{' expression '}' 'then' '{' instructionBlock '}' elseifBlock elseBlock;
elseifBlock         :   elseif elseifBlock
                    |
                    ;
elseif              :   'elseif' '{' expression '}' 'then' '{' instructionBlock '}';
elseBlock           :   elseSubBlock elseBlock
                    |
                    ;
elseSubBlock        :   'else' '{' instructionBlock '}';

//for
forBlock            :   'for' '{' 'set' ID INTEGERVALUE '}' '{' expression '}' '{' 'incr' ID incrArgument '}' '{' instructionBlockCycle '}';

incrArgument        :   INTEGERVALUE
                    |
                    ;

whileBlock          :   'while' '{' expression '}' '{' instructionBlockCycle  '}';

instructionBlockCycle    :   cycleInstruction instructionBlockCycle
                    |
                    ;

cycleInstruction    :   declaration ';'
                    |   ifBlock
                    |   whileBlock
                    |   forBlock
                    |   switchBlock
                    |   readInput ';'
                    |   writeOutput ';'
                    |   execution ';'
                    |   'break' ';'
                    |   'continue' ';'
                    ;

switchBlock         :   'switch' '$' ID '{' caseBlock defaultBlock '}';

caseBlock           :   caseSubBlock caseBlock
                    |
                    ;

caseSubBlock        :   'case' INTEGERVALUE '{' instructionBlockCycle '}';

defaultBlock        :   defaultSubBlock
                    |
                    ;
defaultSubBlock     :   'default' '{' instructionBlockCycle '}';


/************************************************* HELPERS ************************************************************/

value               :   STRINGVALUE
                    |   INTEGERVALUE
                    |   DOUBLEVALUE
                    ;

//lexemas
STRINGVALUE         :   '"'(~[\r\n])*'"';

INTEGERVALUE        :   [0-9][0-9]*;

DOUBLEVALUE         :   [0-9]+'.'[0-9]+;


ID                  : [a-zA-Z_][a-zA-Z0-9_]*;
WS                  : [ \n\t\r]+ -> skip ;
COMMENT             : '#' ~[\r\n]* -> skip;