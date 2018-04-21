grammar MathLang;
@header {
    package zulus.lab3.grammar;
}

fragment DOUBLE
   :    ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;
SCIENTIFIC_NUMBER
    :   DOUBLE (E SIGN? ('0'..'9')+)?
    ;

PI
    :   'pi'
    ;
E
    :   'e'
    ;
WS
    :   [ \t\r]+ -> skip
    ;
VAR
    :   [a-zA-Z_][a-zA-Z_0-9]*
    ;
NEWLINE
    :   '\r?\n'
    ;

POW
    :   '^'
    ;
SIGN
    :   ('+' | '-')
    ;
PLUS
    :   '+'
    ;
EQUAL
    :   '='
    ;
MINUS
    :   '-'
    ;
MULT
    :   '*'
    ;
DIV
    :   '/'
    ;
LPAREN
    :   '('
    ;
RPAREN
    :   ')'
    ;
LBRACKET
    :   '['
    ;
RBRACKET
    :   ']'
    ;
LFIGURE
    :   '{'
    ;
RFIGURE
    :   '}'
    ;

scientific
    :   SCIENTIFIC_NUMBER
    ;

variable
    :   VAR
    ;
matrix
    :   LBRACKET RBRACKET
    |   LBRACKET expression (',' expression)? RBRACKET
    ;
atom
    :   scientific | variable | LPAREN expression RPAREN| matrix
    ;

signedAtom
   :   PLUS signedAtom      # plainSignedAtom
   |   MINUS signedAtom     # invertSignedAtom
   |   atom                 # plainAtom
   ;

factor
    :   signedAtom POW signedAtom
    ;
expression
    :   expression PLUS expression      # SumExpression
    |   expression MINUS expression     # SubtractExpression
    |   expression DIV expression       # DivExpression
    |   expression MULT expression      # MulTExpression
    |   factor                          # PlainFactor
    ;
assign
    :   VAR EQUAL expression
    ;
print
    :    expression NEWLINE
    |    assign NEWLINE
    ;
init
    :   print
    ;





