Feature: Test Twitter smoke scenario

Scenario: Test login with valid creadentials
 Given Open the Google and start application
 When I enter valid username and valid password
 Then user should be able to login successfully