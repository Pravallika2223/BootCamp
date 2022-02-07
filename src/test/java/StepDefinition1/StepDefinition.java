package StepDefinition1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("user_is_on_login_page");
	}

	@When("Valid login id and Password")
	public void valid_login_id_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("valid_login_id_and_password");
	}

	@Then("Navigate to Instagram home page")
	public void navigate_to_instagram_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("navigate_to_instagram_home_page");
	}

	@Given("Player is in Login page")
	public void player_is_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("navigate_to_instagram_home_page");
	}

	@When("Valid login Id {string} and valid password {string} are provided")
	public void valid_login_id_and_valid_password_are_provided(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("valid_login_id_and_valid_password_are_provided");
	}

	@Then("Main Lobby appears")
	public void main_lobby_appears() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("main_lobby_appears");
	}

	
}
