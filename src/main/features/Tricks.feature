Feature: A sample Trick to learn annotations in cucumber 

Scenario Outline: How to use Data table
	Given User navigates to the <app> Application
	And User prompts the credentials in the Login page
		|user_name		|DemoSalesManager	|
		|password		|crmsfa				|
	When user clicks on the login button
	Then user should be able to navigate to Home page
	
	Examples:
	|app		|
	|leaftaps	|
	|Zomato		|