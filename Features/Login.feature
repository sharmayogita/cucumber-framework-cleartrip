
@tag
Feature: Login
  I want to use this template for Login 

  @tag1
  Scenario: Login with valid Credential
    Given User launch browser and open url
    When user click on LoginIn button
    And click login/signin button
    And click continue with login button
    Then Enter email addresss as "sharmayogita166@gmail.com"
    And Enter password as "123@kamlesh"
    And click Login
    Then page title should be "Sign up / Log in"

  
 