Feature: loading banking site page

Scenario: User is able to load and navigate to estimation page

Given user is opening the browser
When user enter's the correct URL'
Then user is able to navigate to expected page


Scenario: User is able to view the borrowing capacity by entering by filling the form and able to clear it.

Given user is in calculator page
When  a person is single 
When  person has 0 dependants, 
When  person is	buying a home to live in, 
When  person with income of $80,000, 
When  person has other income $10,000, 
When  person's living expenses $500, 
When  person's current home loan repayments $0,
When  person's other loan repayments $100, 
When  person's other commitments $0 
When  person's total credit card limits $10,000 
Then person's borrowing capacity would be $479,000.


Given start over button is visible and active
When user clicks start over button
Then form fields values get cleared


Scenario: Application displays the expected warning message when user fails to enter the expected details.
Given user is in borrow calculator page
When user enter's '$1' in the living expense field.
When user leves other field value as zero.
When user click's Work out how much I could borrow button
Then user is able to view the expected message in application
     







