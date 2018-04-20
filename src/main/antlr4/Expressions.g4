grammar Expressions;
@header {
    package zulus.lab3.grammar;
}

assign
    :   VARIABLE ASSIGN expression
    ;
expression
    :   term ((PLUS | MINUS) term)*
    ;
term
    :   signedAtom ((TIMES|DIV) signedAtom)*
    ;

signedAtom
    :   PLUS signedAtom
    |   MINUS signedAtom
    |   atom
    ;

atom
    :   VARIABLE
    |   NUMBER
    |   matrix
    ;
matrix
    :   LBRACKET RBRACKET
    |   LBRACKET expression (COMMA expression)* RBRACKET
    ;

VARIABLE
   :    VALID_ID_START VALID_ID_CHAR*   
	;
fragment VALID_ID_START
   :    ('a' .. 'z') | ('A' .. 'Z') | '_'
	;
fragment VALID_ID_CHAR
   :    VALID_ID_START | ('0' .. '9')
	;
 NUMBER
   :   INT('.'INT)?
	;
fragment INT
    :   '0' .. '9'+
    ;
fragment SIGN
   :    ('+' | '-')
	;
COMMA
    :   ','
    ;
LBRACKET
    :   '['
    ;
RBRACKET
    :   ']'
    ;
LPAREN
   :    '('
	;
RPAREN
   :    ')'
	;
PLUS
   :    '+'
	;
MINUS
    :   '-'
	;
TIMES
    :   '*'
	;
DIV
    :   '/'
	;
ASSIGN
    :   '='
	;
NEWLINE
    :    '\r'?'\n'
	;

WS
    :   [ \t\r\n]+ -> skip
	;