Feature: User Login

  @tag1
  Scenario: User succes login
    When User go to web toolsqa
    And User enter username password
    And User click button login
    Then User validated
