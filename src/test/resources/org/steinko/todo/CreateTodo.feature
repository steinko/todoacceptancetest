Feature: Create a todo
   Scenario: shooud sucessfully create a todo
     Given I am loged in as user "Stein"
     And following todos exist:
         |description|rargetDate  |isCompleted|
         |Fix mutter |2020-01-01  |false      |
         |Fix kjakk  |2020-01-01  |false      |
     When I enter a description "Learn React"
     And  I eneter target date 23-07-2020
     And I activate the create todo command 
     Then following details is displayed for the todos
       |description |targetDate |isDone |
       |Fix mutter  |2020-01-01 |false  |
       |Fix kjakk   |2020-01-01 |false  |
       |Learn React |2020-07-23 |false  |