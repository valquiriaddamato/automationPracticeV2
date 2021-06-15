Feature: Checkout

  Background:
    Given that I access the Automation practice page
    And I click in Sign In Link
    And I login with the email datumqatest@soprock.com and password datum2021
    And I search by item Blouse
    And I click Image View More to see the item information
    And I select the quantity 1, size M and color Black
    And I add to cart

  Scenario: Complete an order successfully
    And I click in Proceed to checkout Link
    And should I view the cart page SHOPPING-CART SUMMARY
    When I completed the order with pay by bank wire
      | address         | Endereço da DATUM         |
      | commentDelivery | Note: Comment on my order |
    Then should I view the confirm order page with the following message Your order on My Store is complete.

  Scenario: Complete an order with more item
    And I click in Continue Shopping
    And I search by item Faded Short Sleeve T-shirts
    And I click Image View More to see the item information
    And I select the quantity 1, size M and color Blue
    And I add to cart
    And I click in Proceed to checkout Link
    And should I view the cart page SHOPPING-CART SUMMARY
    When I completed the order with pay by bank wire
      | address         | Endereço da DATUM         |
      | commentDelivery | Note: Comment on my order |
    Then should I view the confirm order page with the following message Your order on My Store is complete.