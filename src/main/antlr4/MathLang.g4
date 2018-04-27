grammar MathLang;
@header {
    package zulus.lab3.grammar;
}

END
   :    EOF
   |    '\n'
   ;
fragment DOUBLE
   :    ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;
SCIENTIFIC_NUMBER
    :   DOUBLE (E (PLUS|MINUS)? ('0'..'9')+)?
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
    :   '\n'
    ;

POW
    :   '^'
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
MODULE
    :   '|'
    ;
pi
    : PI
    ;
scientific
    :   SCIENTIFIC_NUMBER
    ;

variable
    :   VAR
    ;
array
    :   LFIGURE expression  (',' expression)* RFIGURE
    ;
matrix
    :   LBRACKET expression (',' expression)* RBRACKET
    ;
atom
    :   scientific
    |   variable
    |   LPAREN expression RPAREN
    |   matrix
    |   array
    |   pi
    ;

signedAtom
   :   PLUS signedAtom      # PlainAtom
   |   MINUS signedAtom     # InvertSignedAtom
   |   atom                 # PlainAtom
   ;

factor
    :   signedAtom (POW signedAtom)?
    ;
expression
    :   expression PLUS expression      # SumExpression
    |   expression MINUS expression     # SubtractExpression
    |   expression DIV expression       # DivExpression
    |   expression MULT expression      # MultExpression
    |   'det('expression')'             # DeterminantExpression
    |   factor                          # PlainFactor
    ;
assign
    :   VAR EQUAL expression
    ;
print
    :    expression END
    |    assign END
    ;
init
    :   print
    ;





