Math definition check

Narrative:
As a user
I want to store matrix, numbers and arrays in DB

Scenario: user enters numbers and expected get them back

Given Empty storage
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|1|1.0|
|-1|-1.0|
|-1.234|-1.234|
|-1e+4|-10000.0|
|+23e-4|0.0023|

Scenario: user enters array definition
Given Empty storage
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|{11}|[11.0]|
|{44.2,-44.2}|[44.2, -44.2]|
|{33+22,1}|[55.0, 1.0]|
|{}|ERROR. Array definition is empty|
|{11,{1.4e3}}|ERROR. Array can only contain doubles|


Scenario: user enters matrix definition
Given Empty storage
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|[1]|Matrix 1x1\n[1.0]|
|[]|ERROR. Matrix definition is empty|
|[{}]|ERROR. Array definition is empty|
|[{1},{2.3}]|Matrix 2x1\n[1.0]\n[2.3]
|[{2,3,4e3}]|Matrix 1x3\n[2.0, 3.0, 4000.0]|
|[{1},2]|ERROR. Matrix definition includes non-identical members|


Scenario: user defines new variable, that will be assigned to different values

Given Empty storage
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|A_=11.3|11.3|
|A2=-2|-2.0|
|Ac=44e-4|0.0044|
|_=44e+4|440000.0|
|A=[12]|Matrix 1x1\n[12.0]|
|A={33,44}|[33.0, 44.0]|
|BC={}|ERROR. Array definition is empty|
|D12={11,{1.4e3}}|ERROR. Array can only contain doubles|
|12A=23|ERROR. mismatched input 'A' expecting {END, '^', '+', '-', '*', '/'}|

Scenario: user wants to get value from storage

Given Storage with result of commands:
|instruction|
|A=1|
|B={1.3,4.5}|
|M=[12,33]|
|X=-12+3|
When I execute instruction <command>
Then I receive <result>

Examples:
|command|result|
|_|-9.0|
|A|1.0|
|B|[1.3, 4.5]|
|X|-9.0|
|U|ERROR. Variable 'U' is undefined|
|M|Matrix 1x2\n[12.0, 33.0]|
|M=[1]|Matrix 1x1\n[1.0]|
|M=[B,{12,-1}]|Matrix 2x2\n[1.3, 4.5]\n[12.0, -1.0]|
|M=[{1.3,4.5},{12,-A}]|Matrix 2x2\n[1.3, 4.5]\n[12.0, -1.0]|