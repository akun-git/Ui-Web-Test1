@web
Feature: Web Ui Test

@valid-login
Scenario: Login using valid email and password
  Given user in on login page
  And user input username with "standard_user"
  And user input password with "secret_sauce"
  When user click login button
  Then user is on homepage

@invalid-login
Scenario: Login using invalid email and password
  Given user in on login page
  And user input username with "standard_user"
  And user input password with "invalid"
  When user click login button
  Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

@login-empty-password
Scenario: Login using empty password
  Given user in on login page
  And user input username with "standard_user"
  And user input password with ""
  When user click login button
  Then user able to see error message "Epic sadface: Password is required"

@login-using-locked-user
Scenario: Login using locked user
  Given user in on login page
  And user input username with "locked_out_user"
  And user input password with "secret_sauce"
  When user click login button
  Then user able to see error message "Epic sadface: Sorry, this user has been locked out."

@error-remove-product
Scenario: User can not remove product on the home page
  Given user in on login page
  And user input username with "error_user"
  And user input password with "secret_sauce"
  When user click login button
  Then user click add to cart
  And remove button error