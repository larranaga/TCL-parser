grammar TclV3;

tcl                 :   subRoutine* instructionBlock EOF;

instructionBlock    :   instruction*;

subRoutine          :   ;

instruction         :   declaration TOKEN_PYC
                    |   execute TOKEN_PYC
                    |   readInput TOKEN_PYC
                    |   writeOutput TOKEN_PYC
                    |   ifBlock
                    |   whileBlock
                    |   forBlock
                    |   switchBlock
                    ;

declaration

execute             :   ;

readInput           :   ;

writeOutput         :   ;

ifBlock             :   ;

whileBlock          :   ;

forBlock            :   ;

switchBlock         :   ;



id                  :   ID (TOKEN_PAR_IZQ expression TOKEN_PAR_DER)? ;

callID              :   TOKEN_DOLLAR id;

expression          :   value=(INTEGERVALUE | DOUBLEVALUE | STRINGVALUE)
                    |   execute
                    |   callID
                    |   TOKEN_PAR_IZQ expression TOKEN_PAR_DER
                    |   op=(TOKEN_MENOS | TOKEN_NOT ) expression
                    |   expression TOKEN_POT expression
                    |   expression op=(TOKEN_DIV | TOKEN_MUL | TOKEN_MOD) expression
                    |   expression op=(TOKEN_MAS | TOKEN_MENOS) expression
                    |   expression op=(TOKEN_MENOR | TOKEN_MENOR_IGUAL | TOKEN_MAYOR | TOKEN_MAYOR_IGUAL) expression
                    |   expression op=(TOKEN_IGUAL_NUM | TOKEN_IGUAL_STR | TOKEN_DIFF_NUM | TOKEN_DIFF_STR) expression
                    |   expression TOKEN_AND expression
                    |   expression TOKEN_OR expression
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


//lexems
STRINGVALUE         :   '"'(~[\r\n])*'"';

INTEGERVALUE        :   [0-9][0-9]*;

DOUBLEVALUE         :   [0-9]+'.'[0-9]+;

//Tokens
TOKEN_LLAVE_IZQ     :   '{';
TOKEN_LLAVE_DER     :   '}';
TOKEN_DOLLAR        :   '$';
TOKEN_PYC           :   ';';
TOKEN_COR_IZQ       :   '[';
TOKEN_COR_DER       :   ']';
TOKEN_PAR_IZQ       :   '(';
TOKEN_PAR_DER       :   ')';
TOKEN_MAYOR         :   '>';
TOKEN_MENOR         :   '<';
TOKEN_MAYOR_IGUAL   :   '>=';
TOKEN_MENOR_IGUAL   :   '<=';
TOKEN_IGUAL_STR     :   'eq';
TOKEN_IGUAL_NUM     :   '==';
TOKEN_DIFF_STR      :   'ne';
TOKEN_DIFF_NUM      :   '!=';
TOKEN_NOT           :   '!';
TOKEN_AND           :   '&&';
TOKEN_OR            :   '||';
TOKEN_MAS           :   '+';
TOKEN_MENOS         :   '-';
TOKEN_MUL           :   '*';
TOKEN_POT           :   '**';
TOKEN_DIV           :   '/';
TOKEN_MOD           :   '%';


ID                  : [a-zA-Z_][a-zA-Z0-9_]*;
WS                  : [ \n\t\r]+ -> skip ;
COMMENT             : '#' ~[\r\n]* -> skip;
ERRORCHARACTER      : . ;