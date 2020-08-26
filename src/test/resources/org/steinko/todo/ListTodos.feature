Feature: List Todos
  Scenario: List Todos
    Given I am loged in as user "Stein"
    When I activate the get todos command
    Then following todos is displayed:
   |description | targetDate  |IsCompleted |
   |Fix mutter  |01-01-2020   |false       |
   |Fix kjakk   |01-01-2020   | false      |

