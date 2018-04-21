Math operations check

Scenario: process strings with valid commands

Given a strings with [command] and exprected output [result]
When I execute command [command]
Then I have next result [result]

Examples:
|command|result|
|12+45.5|57.5|
|0.45-12|-11.55|

