package StepDefinition1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class Scenario1SD {
	
	RequestSpecification request;
	@Given("The user is on request page")
	public void the_user_is_on_request_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("the_user_is_on_request_page");
	   RestAssured.baseURI = "https://reqres.in/";
	   RequestSpecification request = RestAssured.given().log().all();
	   request.header("Content-Type","application/json");
	}

	@When("clicking on request url")
	public void clicking_on_request_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("clicking_on_request_url");
		RequestSpecification request1 = RestAssured.given().log().all();
	    request1.when().get("https://reqres.in/api/users?page=2");
	}

	@Then("navigate to details")
	public void navigate_to_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("navigate_to_details");
		RequestSpecification request2 = RestAssured.given().log().all();
		request2.then().log().all();
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		int statusCode= response.getStatusCode();
		System.out.println("status code is"+statusCode);
		Assert.assertEquals(200, statusCode);
		  
	}

}
