Feature: User Checkout

	@tag1
  Scenario: User checkout
    When User go to web shoptools1
    And User click view cart
    And User click proceed to checkout
    Then User place order
   
