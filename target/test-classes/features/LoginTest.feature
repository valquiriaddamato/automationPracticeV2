Feature: Login

  Scenario: Login successfully
    Given that I access the Automation practice page
    When I click in Sign In Link
    And I login with the email datumqatest@soprock.com and password datum2021
    Then should I view the page name MY ACCOUNT in the My account page
    And should I view the name Datum QA Test in the user logged in