grammar MathLang;
@header {
    package zulus.lab3.grammar;
}

init
    :   VARIABLE ASSIGN expression NEWLINE?  #assign
    |   expression NEWLINE?                  #print
    ;
expression
    :   signedAtom                      #PlainSignedAtom
    |   expression PLUS expression      #ExpressionPlus
    |   expression MINUS expression     #ExpressionSubtract
    |   expression DIV expression       #ExpressionDiv
    |   expression MUL expression       #ExpressionMul
    ;

signedAtom
    :   PLUS signedAtom                 #PlainValue
    |   MINUS signedAtom                #InvertSign
    |   atom                            #PlainValue
    ;

atom
    :   VARIABLE
    |   NUMBER
    |   matrix
    |   array
    ;
matrix
    :   LBRACKET RBRACKET
    |   LBRACKET expression (COMMA expression)* RBRACKET
    |   LBRACKET array (COMMA array)* RBRACKET
    ;
array
    :   LFIGURE RFIGURE
    |   LFIGURE expression (COMMA expression)* RFIGURE
    ;
NUMBER
   :  INT+('.'INT+)?
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
fragment SIGN
   :    ('+' | '-')
	;
INT
    :   [0-9]+
    ;
COMMA
    :   ','
    ;
LFIGURE
    :   '{'
    ;
RFIGURE
    :   '}'
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
MUL
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