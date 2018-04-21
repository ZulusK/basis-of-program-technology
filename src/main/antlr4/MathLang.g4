grammar MathLang;
@header {
    package zulus.lab3.grammar;
}

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
scientific
    :   SCIENTIFIC_NUMBER
    ;

variable
    :   VAR
    ;
array
    :   LFIGURE RFIGURE
    |   LFIGURE expression  (',' expression)* RFIGURE
    ;
matrix
    :   LBRACKET RBRACKET
    |   LBRACKET expression (',' expression)* RBRACKET
    ;
atom
    :   scientific
    |   variable
    |   LPAREN expression RPAREN
    |   matrix
    |   array
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
    |   MODULE expression MODULE        # ModuleExpression
    |   'det('expression')'             # DeterminantExpression
    |   factor                          # PlainFactor
    ;
assign
    :   VAR EQUAL expression
    ;
print
    :    expression NEWLINE?
    |    assign NEWLINE?
    ;
init
    :   print
    ;





