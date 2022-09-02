Feature: Validate Login Functionality
  I want to use this template for login

  
  Scenario: Login with valid credentials
    Given User open browser and enter url
   #When user click on login
    #And  user click on login signup button
    #Then user click on continue with login
    When user enter username as "sharmayogita166@gmail.com"
    When User enter password as "123@Kamlesh"
    And user click on login button
    Then page title should be "Sign up / Log in"
   