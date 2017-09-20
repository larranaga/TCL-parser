grammar TclV2;

tcl                 :   instructionBlock EOF;

instructionBlock    :   instruction instructionBlock
                    |
                    ;

instruction         :   declaration TOKEN_PYC
                    |   ifBlock TOKEN_PYC
                    |   whileBlock TOKEN_PYC
                    |   forBlock TOKEN_PYC
                    |   switchBlock TOKEN_PYC
                    |   readInput TOKEN_PYC
                    |   writeOutput TOKEN_PYC
                    |   execution TOKEN_PYC
                    ;


/***********************************************************declaration ***********************************************/

declaration         :   SET ID array value_to_assign;

value_to_assign     :   value
                    |   execution
                    ;

array               :   TOKEN_PAR_IZQ execution TOKEN_PAR_DER
                    |
                    ;

/******************************************** control structures*******************************************************/

//if
ifBlock             :   IF TOKEN_LLAVE_IZQ expression TOKEN_LLAVE_DER THEN TOKEN_LLAVE_IZQ instructionBlock TOKEN_LLAVE_DER elseifBlock elseBlock;
elseifBlock         :   elseif elseifBlock
                    |
                    ;
elseif              :   ELSEIF TOKEN_LLAVE_IZQ expression TOKEN_LLAVE_DER THEN TOKEN_LLAVE_IZQ instructionBlock TOKEN_LLAVE_DER;
elseBlock           :   else elseBlock
                    |
                    ;
else                :   ELSE TOKEN_LLAVE_IZQ instructionBlock TOKEN_LLAVE_DER
                    |
                    ;

//for
forBlock            :   FOR;
/********************************************** execution block *******************************************************/


/************************************************* HELPERS ************************************************************/

value               :   STRINGVALUE
                    |   INTEGERVALUE
                    |   DOUBLEVALUE
                    ;


/************************************************* TOKENS *************************************************************/

//palabras clave
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


//lexemas
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