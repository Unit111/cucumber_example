package com.unit1.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

    public class StepDefinitions {

        @Given("the user sets {string}")
        public void the_user_sets(String string) {
            System.out.println("In this step the user sets " + string);
        }

        @When("the user executes some action")
        public void the_user_executes_some_action() {
            System.out.println("In this step the user executes something");
        }

        @Then("the action should be executed")
        public void the_action_should_be_executed() {
            System.out.println("In this step the user verifies something");
        }
}
