Feature: Login into the application

Scenario Outline: validating a positive test
Given Initilize the driver with chrome
And Navigate to "qaclickacademy" site
And Click on the login link to go to the sign in page
When User enters in his <username> and <password> and clicks login
Then Verify that Login was successful
And Close Browsers


Examples:

|username           |password |
|test99@gmail.com   |123456   |
|test212@gmail.com  |123456789|