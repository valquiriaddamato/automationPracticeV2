Feature: Search

  Background:
    Given that I access the Automation practice page
    And I click in Sign In Link
    And I login with the email datumqatest@soprock.com and password datum2021

  Scenario: Search item successfully
    When I search by item Blouse
    Then should I view the search page with searched Blouse

  Scenario: View details of searched item
    When I search by item Blouse
    And I click Image View More to see the item information
    Then should I view the item page with all the information by item Blouse