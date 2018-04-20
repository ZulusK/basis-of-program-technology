grammar Matrixes;
@header {
    package zulus.lab3.grammar;
}
start
    :   expr NEWLINE
    |   ID '=' expr NEWLINE
    |   NEWLINE
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
ID  : [A-Za-z]+;
NEWLINE:    '\r'?'\n';
WS  :       [\t]+->skip;
