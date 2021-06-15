Feature: Register customer

  Scenario: Successfully Register Customer
    Given that I access the Automation practice page
    When I click in Sign In Link
    And I fill in the email and then confirm the start of registration
    And I fill in the requested data of my user and then finish the registration
    | firstName         | Val                 |
    | lastName          | DAmato              |
    | password          | 123456              |
    | day               | 6                   |
    | month             | 12                  |
    | year              | 1990                |
    | firstNameAddress  | Val                 |
    | lastNameAddress   | DAmato              |
    | company           | XPTO                |
    | address           | Times Square, 1020  |
    | city              | New York            |
    | state             | New York            |
    | postalCode        | 10036               |
    | country           | United States       |
    | mobilePhone       | +1543456789         |
    | addressAlias      | Fifth Avenue, 2000  |
    Then should I view the page name MY ACCOUNT in the My account page
    And should I view the name Val DAmato in the user logged in