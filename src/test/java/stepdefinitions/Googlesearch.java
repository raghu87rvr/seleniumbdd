package stepdefinitions;

import io.cucumber.java.en.*;

public class Googlesearch {

	@Given("Browser is opened")
	public void browser_is_opened() {
		System.out.println("Inside Browser is opened");
	}

	@Given("User is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside ");
	}

	@When("User enters text in the search box")
	public void user_enters_text_in_the_search_box() {
		System.out.println("Inside ");
	}

	@When("Clicks on search button or enter")
	public void clicks_on_search_button_or_enter() {
		System.out.println("Inside ");
	}

	@Then("User landed on searched results")
	public void user_landed_on_searched_results() {
		System.out.println("Inside ");
	}

}
