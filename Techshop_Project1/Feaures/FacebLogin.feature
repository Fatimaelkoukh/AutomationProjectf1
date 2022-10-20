Feature: Testing the login functionality and verifying the username
  

  
  Scenario: User can log in to facebook using the correct email or phone number and password
    Given : user open the browser
    And : User navigates to " www.facebook.com " 
    When : User enter the correct email or phonenumber
    And : User enter the correct password
    And : User click on the log in button 
    Then : User is successefully logged in and  the username is diplayed
    And : User is able to navigate in the home page  

 
