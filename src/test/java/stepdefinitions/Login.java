package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {


	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside User is on login page ");
	}

	@When("Enters the username and password")
	public void enters_the_username_and_password() {
		System.out.println("Inside Enters the username and password ");
	}

	@And("Clicks the login button")
	public void clicks_the_login_button() {
		System.out.println("Inside Clicks the login button ");
	}

	@Then("User navigates to home page")
	public void user_navigates_to_home_page() {
		System.out.println("Inside User navigates to home page ");
	}

}
