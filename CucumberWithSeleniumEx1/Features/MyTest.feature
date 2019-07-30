Feature: Reset functionality on login page of Application

  Scenario: Verification of Reset button
    Given Open the Firefox and launch the application
    When Enter the Username and Password
    Then Reset the credential

  Scenario: Verification of Login button
    When Enter the Username and Pwd
    Then Login current user
