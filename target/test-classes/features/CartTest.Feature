Feature: Cart

  Background:
    Given that I access the Automation practice page
    And I click in Sign In Link
    And I login with the email datumqatest@soprock.com and password datum2021

  Scenario: Add item to cart successfully
    And I search by item Blouse
    And I click Image View More to see the item information
    When I select the quantity 1, size M and color Black
    And I add to cart
    Then should I view the confirm page with a icon

  Scenario: Add more item to cart successfully
    And I search by item Blouse
    And I click Image View More to see the item information
    When I select the quantity 1, size M and color Black
    And I add to cart
    And I click in Continue Shopping
    And I search by item Faded Short Sleeve T-shirts
    And I click Image View More to see the item information
    And I select the quantity 1, size M and color Blue
    And I add to cart
    Then should I view the confirm page with a icon

  Scenario: Check add item in cart
    And I search by item Blouse
    And I click Image View More to see the item information
    When I select the quantity 1, size M and color Black
    And I add to cart
    And I click in Proceed to checkout Link
    Then should I view the cart page SHOPPING-CART SUMMARY