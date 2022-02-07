package StepDefinition1;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ForeignExchange {
	RequestSpecification request;
	Response response;

	@Given("API for Foreign Exchange")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"name\": \"ABC\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}");
	}

	@When("Posted with correct information")
	public void posted_with_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		String path="api/users";
		response=request.post(path).then().log().all().extract().response();
	}

	@Then("validate positive response code recieved")
	public void validate_positive_response_code_recieved() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		System.out.println("response status code : "+response.getStatusCode()); 
		System.out.println("response status line : "+response.getStatusLine());
		Assert.assertEquals("HTTP/1.1 201 Created", response.getStatusLine());
		Assert.assertEquals(201, response.getStatusCode());
	}
	
	
}
