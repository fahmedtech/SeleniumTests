Feature: Test Facebook Smoke scenario
	Scenario: Test Login with valid credential
	Given Open chrome/firefox and start application
	When I enter valid user and valid password
	Then user should be able to login successfully
	And have access to his/her account

