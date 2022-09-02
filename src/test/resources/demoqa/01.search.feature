Feature: User Shopping

  @tag1
  Scenario: User choose clothes
    When User go to web shoptools
    And User click button search
    And User enter type of clothes1
    And User click clothess
    And User choose colour
    And User choose size
    And User click add to cart
    Then User success select

