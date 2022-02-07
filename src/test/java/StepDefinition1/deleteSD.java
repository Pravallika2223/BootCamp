package StepDefinition1;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteSD {
	RequestSpecification request;
	Response response;
	@Given("User is on Request Page")
	public void user_is_on_request_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json");
	}

	@When("delete operation is initiated")
	public void delete_operation_is_initiated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		String path="api/users/2";
		response=request.delete(path).then().log().all().extract().response();
	}

	@Then("details must be deleted")
	public void details_must_be_deleted() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		System.out.println("response status code : "+response.getStatusCode()); 
		System.out.println("response status line : "+response.getStatusLine());
	}

}
