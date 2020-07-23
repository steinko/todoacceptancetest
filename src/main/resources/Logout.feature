Feature: Logout
  Scenario: Logou Sucessfully
    Given I am currently logged in
    When I activate Login
    Then I am loggedout