Feature: User search clothes

  Scenario: User pick the clothes
    When User go to web toolsqa
    And User click button search
    And User enter type of clothes
    And User pick and click clothes1
    And User choose colour and size1
    And User click add to cart
    And User pick and click another one clothes
    And User choose colour and size2
    And User click add to cart2
    Then User success select
