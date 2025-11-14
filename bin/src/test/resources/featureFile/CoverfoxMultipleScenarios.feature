Feature: Coverfox Health Insurance Test

  Scenario: TC01: Validate Coverfox Health Insurance Plan for single person
    Given I am on  home page
    When I  click on get started button
    And I click on next button
    And I provide age as "24" and click on next button
    And I provide pincode as "412207", mobNumber as "8989898989" and click on continue button
    Then matching Health Insurance Plans should be displayed as "48"

  Scenario: TC02: Validate Coverfox Car Insurance
    Given I am on  home page
    When I click on car insurance button
    And I provide valid details and click on view quotes button
    Then I should get the plan details

  Scenario: TC03: Validate Coverfox Bike Insurance
    Given I am on  home page
    When I click on bike insurance button
    And I provide valid RTO number and click view quotes button
    And I provide valid details and click on view quotes button
    Then I should get the plan details
