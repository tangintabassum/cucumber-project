package com.dk.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    @Before
    public void beforeHooks() {
        System.out.println("This is before hook");
    }

    @After
    public void afterHooks() {
        System.out.println("This is after hook");
    }

    @Given("User open desired browser")
    public void user_open_desired_browser() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User enter his email address$")
    public void user_enter_his_email_address() throws Throwable {
        System.out.println("user enter his email address");
    }

    @Then("^User click on login button$")
    public void user_click_on_login_button() throws Throwable {
        System.out.println("user click on login button");
    }

    @And("^User go to facebook login page$")
    public void user_go_to_facebook_login_page() throws Throwable {
        System.out.println("user go to facebook login page");
    }

    @And("^User enter his password$")
    public void user_enter_his_password() throws Throwable {
        System.out.println("user enter his password");
    }

    @And("^User go to twitter login page$")
    public void user_go_to_twitter_login_page() throws Throwable {
        System.out.println("User go to twitter login page");
    }
}

