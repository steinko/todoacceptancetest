Feature: Manage Todos
  Test of the sceanarios that manage the Todo
  Scenario Outline: Get Todos
    Given Todos Exists In the System
    When I activate the get todos command
    Then I get todo details  id: <id> 
    And user name: <username> 
    And description <description> 
    And target date <date>
    And if the task is done <isDone>
Examples: 
  |id |username |description |date       |isDone |
  |1  |Stein    |Fix mutter  |2020-01-01 |false  |
  |2  |Oddmund  |Fix kjak    |2020-01-01 |false  |