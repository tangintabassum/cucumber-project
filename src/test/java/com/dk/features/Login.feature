Feature: Login Test Feature for Facebook Login page
  Description: In this feature we are going to test facebook
  login page

  Background:
    Given User open desired browser

  @facebook
  Scenario: Login Test Scenario
    And User go to facebook login page
    When User enter his email address
    And User enter his password
    Then User click on login button

  @twitter
  Scenario:
    And User go to twitter login page
