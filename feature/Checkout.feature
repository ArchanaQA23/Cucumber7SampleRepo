@Checkout
Feature: Login with credentials

  Background: Logging In of User
    Given user is on the the website "https://www.bbc.co.uk/"
    When user enters login details email "michmagconsult@gmail.com" password "Fiyin@2021"
    And user clicks on SignIn button
    Then home page should be displayed

  Scenario Outline: User can get an actual location
    Given user navigates to weather
    When user searches "<location>"
    And user click on search
    Then location should be displayed

    Examples: 
      | location |
      | London   |

  Scenario: User can add my location
    Given user have searched for weather location "London"
    When user clicked on search
    And user selects preferred location
    And user can adds weather to locations
    Then location should be added
