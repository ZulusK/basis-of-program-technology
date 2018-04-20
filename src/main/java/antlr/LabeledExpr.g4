grammar LabeledExpr;
stat:       expr NEWLINE            # printtxpr
    |       ID '=' expr NEWLINE     # assign
    |       NEWLINE                 # blank
    ;
expr:       expr op=(MUL|DIV) expr  #MulDiv
    |       expr op=(ADD|SUB) expr  #AddSub
    |       INT                     #int
    |       ID                      #id
    |       '(' expr ')'            #parens
    ;
MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
INT : [0-9]+;
NEWLINE