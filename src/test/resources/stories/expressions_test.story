Math definition check

Narrative:
As a user
I want to execute expressions, using MathLang

Scenario: user defines matrix and gets it's determinant

Given Empty storage
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|det([1])|1.0|
|det([{2,0},{0,2}])|4.0|
|det([{3,0,0},{3,3,0},{3,0,3}])|27.0|
|det(1)|ERROR. Cannot calculate determinant of not a matrix member|
|det({1,2})|ERROR. Cannot calculate determinant of not a matrix member|

Scenario: user uses defined matrix and gets it's determinant

Given Storage with result of commands:
      |instruction|
      |M=[12,33]|
      |M2=[{3,1},{4,3}]|
      |A={2,3}|
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|det(M)|ERROR. Matrix is not square|
|det(M2)|5.0|
|det([A,A])|0.0|
|det(A)|ERROR. Cannot calculate determinant of not a matrix member|



Scenario: user execute DIV, MULT, POW, SUBTRACT, SUM fro numbers

Given Empty storage
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|1+3e2|301.0|
|4+(4*2)|12.0|
|12-3^2|3.0|
|5^2|25.0|
|100^0|1.0|
|-33^0.5|NaN|
|10/0|Infinity|
|12/4|3.0|

Scenario: user execute DIV, MULT, POW, SUBTRACT, SUM for matrixes

Given Storage with result of commands:
|instruction|
|M1x1=[1]|
|Array={12,33}|
|M2x2=[{1,2},{3,4}]|
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|M1x1+M1x1|Matrix 1x1\n[2.0]|
|M1x1+3|ERROR. SUM cannot be applied to operands of type Matrix and Double|
|M2x2+M2x2|Matrix 2x2\n[2.0, 4.0]\n[6.0, 8.0]|
|M2x2+Array|ERROR. SUM cannot be applied to operands of type Matrix and ArrayList|
|M1x1*2|Matrix 1x1\n[2.0]|
|M1x1*M1x1|ERROR. Multiplication of matrix is not supported yet|
|M2x2*4|Matrix 2x2\n[4.0, 8.0]\n[12.0, 16.0]|
|M2x2^2|ERROR. POW cannot be applied to object of types Matrix and Double|
|M1x1-M1x1|Matrix 1x1\n[0.0]|
|M2x2-[Array,Array]|Matrix 2x2\n[-11.0, -31.0]\n[-9.0, -29.0]|
|M1x1/2|Matrix 1x1\n[0.5]|
|M2x2/5|Matrix 2x2\n[0.2, 0.4]\n[0.6000000000000001, 0.8]|
|M2x2/M1x1|ERROR. Division of matrix is not supported|
|M2x2/Array|ERROR. DIV cannot be applied to operands of type Matrix and ArrayList|

Scenario: user execute DIV, MULT, POW, SUBTRACT, SUM for lists

Given Storage with result of commands:
|instruction|
|Matrix=[{12,33}]|
|A3={1,2,3}|
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|A3+2|ERROR. SUM cannot be applied to operands of type ArrayList and Double|
|A3+Matrix|ERROR. SUM cannot be applied to operands of type ArrayList and Matrix|
|A3+A3|ERROR. SUM cannot be applied to operands of type ArrayList and ArrayList|
|A3-2|ERROR. SUBTRACT cannot be applied to operands of type ArrayList and Double|
|A3-Matrix|ERROR. SUBTRACT cannot be applied to operands of type ArrayList and Matrix|
|A3-A3|ERROR. SUBTRACT cannot be applied to operands of type ArrayList and ArrayList|
|A3*3|[3.0, 6.0, 9.0]|
|A3*A3|ERROR. Multiplication of arrays is not supported yet|
|A3*Matrix|ERROR. MULT cannot be applied to operands of type Matrix and ArrayList|
|A3/5|[0.2, 0.4, 0.6000000000000001]|
|A3/A3|ERROR. Division of arrays is not allowed|
|A3/Matrix|ERROR. DIV cannot be applied to operands of type ArrayList and Matrix|



Scenario: user execute Module

Given Storage with result of commands:
|instruction|
|M1x1=[-1]|
|Array={-12,33}|
|M2x2=[{-1,-2},{3,4}]|
When I execute instruction <command>
Then I receive <result>

Examples:
{valueSeparator=!, headerSeparator=!}
!command!result!
!|M1x1|!Matrix 1x1\n[1.0]!
!|M2x2|!Matrix 2x2\n[1.0, 2.0]\n[3.0, 4.0]!
!|Array|!ERROR. MODULE cannot be applied to object of type ArrayList!
!|-4|!4.0!