Feature: Delete Todo
Should delete a todo for a spesific user
   Scenario: Successful deleting a todo
     Given I am loged in in as user "Stein"
     And the description for the todos in the application for user "Stein" is displayed as:
         |description |
         |Fix mutter  |
         |Fix kjak    |
         |Learn React |
     And I select the todo with description "Learn React"
     When Delete Tod is actiavted
     Then description for the todos display:
       |description |
       |Fix mutter  |
       |Fix kjak    |