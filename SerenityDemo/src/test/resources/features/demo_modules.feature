##Author: carlos.hincapie.qa@gmail.com

  Feature: Use the demo modules in serenitydemo
    Me as a user
    I want to use the SerenityDemo page and will try Demo Modules
    To verify functioning of the page

  Background: Login in SerenityDemo
    Given "accountAdmin" logs in SerenityDemo

  Scenario: Create a new product
    When selects the product page
    When clicks on create product and fills the form with the information "productA"
    Then searches the product and should see the product name


  Scenario: Modify a new product
    When selects the product page
    When searches the new product and try to modify "productModify" "productA"
    Then searches the product and should see the product name

