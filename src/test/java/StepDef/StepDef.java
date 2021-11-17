package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDef {

    @Given("^User will navigate to the website$")
    public void user_will_navigate_to_the_website() throws Throwable {
        throw new PendingException();
    }

    @When("^User login in to application with username and password$")
    public void user_login_in_to_application_with_username_and_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^Dashboard will$")
    public void dashboard_will() throws Throwable {
        throw new PendingException();
    }

    @And("^User will see something$")
    public void user_will_see_something() throws Throwable {
        throw new PendingException();
    }

}