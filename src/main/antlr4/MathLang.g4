grammar MathLang;
@header {
    package zulus.lab3.grammar;
}

init
    :   VARIABLE ASSIGN expression NEWLINE?  #assign
    |   expression NEWLINE?                  #print
    ;
expression
    :   expression PLUS expression      #ExpressionPlus
    |   expression MINUS expression     #ExpressionSubtract
    |   expression DIV expression       #ExpressionDiv
    |   expression MUL expression       #ExpressionMul
    |   signedAtom                      #PlainSignedAtom
    ;

signedAtom
    :   PLUS signedAtom                 #PlainValue
    |   MINUS signedAtom                #InvertSign
    |   atom                            #PlainValue
    ;

atom
    :   VARIABLE
    |   scientific
    |   matrix
    |   array
    ;
matrix
    :   LBRACKET RBRACKET
    |   LBRACKET expression (COMMA expression)* RBRACKET
    ;
array
    :   LFIGURE RFIGURE
    |   LFIGURE expression (COMMA expression)* RFIGURE
    ;
scientific
    :   SCIENTIFIC_NUMBER
    ;
VARIABLE
    :    VALID_ID_START VALID_ID_CHAR*
	;
SCIENTIFIC_NUMBER
    :    NUMBER (E SIGN? INT)?
    ;
 fragment NUMBER
    :  INT ('.'INT) ?
	;
 fragment VALID_ID_START
    :    [A-Za-z_]
	;
 fragment VALID_ID_CHAR
    :    VALID_ID_START | INT
	;
fragment SIGN
    :   PLUS | MINUS
	;
 fragment E
    : ('E'|'e')
    ;
 fragment INT
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
    :   [\r\t\n]+ -> skip
	;