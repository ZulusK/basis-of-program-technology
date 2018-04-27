Math operations check

Narrative:
As a user
I want to store matrix in DB

Scenario: user defines new variable, that will be assigned to different values

Given String with variable definition
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|A_=11.3|11.3|
|A2=-2|-2.0|
|Ac=44e-4|0.0044|
|_=44e+4|440000.0|
|{11}|[11.0]|
|{44.2,-44.2}|[44.2, -44.2]|
|{}|ERROR. Array definition is empty|
|[1]|Matrix 1x1\n[1.0]|
|[]|ERROR. Matrix definition is empty|
|[{1},{2.3}]|Matrix 2x1\n[1.0]\n[2.3]
|[{2,3,4e3}]|Matrix 1x3\n[2.0, 3.0, 4000.0]|
|[{}]|ERROR. Array definition is empty|
