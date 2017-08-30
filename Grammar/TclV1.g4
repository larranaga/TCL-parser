lexer grammar TclV1;


//palabras clave
SET                 :   'set';
PUTS                :   'puts';
IF                  :   'if';
THEN                :   'then';
ELSEIF              :   'elseif';
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
STRINGVALUE         :   ('"')[.]*('"');

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
TOKEN_AND           :   '&&';
TOKEN_OR            :   '||';
TOKEN_NOT           :   '!';
TOKEN_MAS           :   '+';
TOKEN_MENOS         :   '-';
TOKEN_MUL           :   '*';
TOKEN_DIV           :   '/';
TOKEN_MOD           :   '%';
TOKEN_POT           :   '**';

ID                  : [a-zA-Z_][a-zA-Z0-9_]*;

WS                  : [ \n\t\r]+ -> skip ;

COMMENT             : '#' ~[\r\n]* -> skip;

