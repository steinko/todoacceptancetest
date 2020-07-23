Feature: List Todos
  Scenario Outline: List Todos
    Given user "Stein"
    When I activate the get todos command
    Then description <Description> 
    And target date <Target Date>
    And if the task is done <isCompleted>
Examples: 
   |Description | Target Date  |IsCompleted |
   |Fix mutter  |01-01-2020   |false       |
   |Fix kjakkk  |01-01-2020   |false       |

