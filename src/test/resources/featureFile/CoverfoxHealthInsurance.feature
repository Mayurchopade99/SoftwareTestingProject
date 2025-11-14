Feature: Coverfox Health Insurance Test  
Scenario: TC01: Validate Coverfox Health Insurance Plan for single person 
Given I am on  home page
When I  click on get started button 
And I click on next button
And I provide age as "24" and click on next button
And I provide pincode as "412207", mobNumber as "8989898989" and click on continue button
Then matching Health Insurance Plans should be displayed as "48"


Scenario: TC02: Validate CoverFox address details page error messages
Given I am on  home page
When I  click on get started button
And I click on next button
And I provide age as "34" and click on next button
And I click on continue button
Then Validate error messages 

Scenario: TC03: validate travel insurance
Given test
When test
And  test
Then validate travel insurance






