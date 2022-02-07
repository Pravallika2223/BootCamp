package stepDefination;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;

import static org.hamcrest.Matcher.*;
import org.hamcrest.Matcher.*;

public class stepDefination {

	RequestSpecification request;
	Response response;
 //Home page default login
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"name\": \"ABC\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}");
	}
	@When("User loging into app using credentials")
	public void user_loging_into_app_using_credentials() {
		System.out.println("When");
		String path="api/users";
		response=request.post(path).then().log().all().extract().response();
	}
	@Then("Home is poppulated")
	public void home_is_poppulated() {
		System.out.println("Then");
		System.out.println("response status code : "+response.getStatusCode()); 
		System.out.println("response status line : "+response.getStatusLine());
		Assert.assertEquals("HTTP/1.1 201 Created", response.getStatusLine());
		Assert.assertEquals(201, response.getStatusCode());
	}
	
	
	//Post Operation - Registration
	RequestSpecification request2;
	Response response2;
	@Given("User is on Register Page")
	public void user_is_on_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given");
	    RestAssured.baseURI="https://reqres.in";
	    request2=given().header("Content-Type","application/json").
	    		body("{\r\n"
	    				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
	    				+ "    \"password\": \"pistol\"\r\n"
	    				+ "}");
	    
	}

	@When("Provided with accurate email and password")
	public void provided_with_accurate_email_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		String path="api/register";
		response2=request2.post(path).then().log().all().extract().response();
	}

	@Then("Register Successful")
	public void register_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		System.out.println("response status code : "+response2.getStatusCode()); 
		System.out.println("response status line : "+response2.getStatusLine());
		Assert.assertEquals("HTTP/1.1 200 OK", response2.getStatusLine());
		Assert.assertEquals(200, response2.getStatusCode());
	}

	
	//Get Operation - List the Users
	RequestSpecification request3;
	Response response3;
	@Given("The user in request page")
	public void the_user_in_request_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given");
		RestAssured.baseURI="https://reqres.in/";
		request3=given().header("Content-Type","application/json");
	}

	@When("clicking on request url")
	public void clicking_on_request_url() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("when");
	    String path="api/users?page=2";
	    response3=request3.get(path).then().log().all().extract().response();
	}

	@Then("List all the users")
	public void list_all_the_users() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("then");
	   System.out.println("response status code : "+response3.getStatusCode());
	   System.out.println("response status line : "+response3.getStatusLine());
	   Assert.assertEquals("HTTP/1.1 200 OK", response3.getStatusLine());
		Assert.assertEquals(200, response3.getStatusCode());
	}

	
	//Get Operation - Single User
	RequestSpecification request4;
	Response response4;
   @Given("User will be in Request page")
	public void user_will_be_in_request_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("given");
	    RestAssured.baseURI="https://reqres.in/";
	    request4=given().header("Content-Type","application/json");
	}

	@When("URL is provided")
	public void url_is_provided() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when");
		String path="api/users/2";
		response4=request4.get(path).then().log().all().extract().response();
	}

	@Then("get the details of the user")
	public void get_the_details_of_the_user() {
	    // Write code here that turns the phrase above into concrete actions
	     System.out.println("then");
	     System.out.println("response status code is :"+response4.getStatusCode());
	     System.out.println("response status line is : "+response4.getStatusLine());
	     Assert.assertEquals(200, response4.getStatusCode());
	     Assert.assertEquals("HTTP/1.1 200 OK", response4.getStatusLine());
	}

	
	//Post Operation - create user details
	RequestSpecification request5;
	Response response5;
	@Given("Api for Foreign Exchane")
	public void api_for_foreign_exchane() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request5=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}"); 
	}

	@When("Posted with correct information")
	public void posted_with_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		String path="api/users";
		response5=request5.post(path).then().log().all().extract().response();
	}

	@Then("validate positive response code recieved")
	public void validate_positive_response_code_recieved() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		System.out.println("response status code : "+response5.getStatusCode()); 
		System.out.println("response status line : "+response5.getStatusLine());
		Assert.assertEquals("HTTP/1.1 201 Created", response5.getStatusLine());
		Assert.assertEquals(201, response5.getStatusCode());
	}

	
	//Delete Operation
	RequestSpecification request6;
	Response response6;
	@Given("user is on Request Page")
	public void user_is_on_request_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request6=given().header("content-type","application/json");
	}
	
	@When("delete operation is initiated")
	public void delete_operation_is_initiated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		String path="api/users/2";
		response6=request6.delete(path).then().log().all().extract().response();
	}

	@Then("details must be deleted")
	public void details_must_be_deleted() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		System.out.println("response status code : "+response6.getStatusCode()); 
		System.out.println("response status line : "+response6.getStatusLine());
		Assert.assertEquals("HTTP/1.1 204 No Content", response6.getStatusLine());
		Assert.assertEquals(204, response6.getStatusCode());
	}
	
	
   //Put Operation - Updating details
	RequestSpecification request7;
	Response response7;
	@Given("the link for user to update")
	public void the_link_for_user_to_update() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request7=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}");
	}

	@When("provided precise details to update")
	public void provided_precise_details_to_update() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		String path="api/users/2";
		response7=request7.put(path).then().log().all().extract().response(); 
	}

	@Then("update operation should be done")
	public void update_operation_should_be_done() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		System.out.println("response status code : "+response7.getStatusCode()); 
		System.out.println("response status line : "+response7.getStatusLine());
		Assert.assertEquals("HTTP/1.1 200 OK", response7.getStatusLine());
		Assert.assertEquals(200, response7.getStatusCode());
	}
	
	
    //Patch Operation
	RequestSpecification request8;
	Response response8;
	@Given("user is on the requested page")
	public void user_is_on_the_requested_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request8=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}");
	}

	@When("valid credentials are provided")
	public void valid_credentials_are_provided() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		String path="api/users/2";
		response8=request8.patch(path).then().log().all().extract().response(); 
	}

	@Then("User details should update")
	public void user_details_should_update() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		System.out.println("response status code : "+response8.getStatusCode()); 
		System.out.println("response status line : "+response8.getStatusLine());
		 Assert.assertEquals(200, response8.getStatusCode());
	     Assert.assertEquals("HTTP/1.1 200 OK", response8.getStatusLine());
	}

	
	//Negative Scenario for Post Operation
	RequestSpecification request9;
	Response response9;
	@Given("ApI for foreign exchange")
        public void ap_i_for_foreign_exchange() {
    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request9=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"email\": \"sydney@fife\"\r\n"
						+ "}");
	}

    @When("invalid username or empty password provided")
        public void invalid_username_or_empty_password_provided() {
    // Write code here that turns the phrase above into concrete actions
    	System.out.println("When");
		String path="api/register";
		response9=request9.post(path).then().log().all().extract().response();
    }

   @Then("Accurate error message should be displayed")
        public void accurate_error_message_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Then");
		System.out.println("response status code : "+response9.getStatusCode()); 
		System.out.println("response status line : "+response9.getStatusLine());
		Assert.assertEquals(400, response9.getStatusCode());
	     Assert.assertEquals("HTTP/1.1 400 Bad Request", response9.getStatusLine());
    }

	
	//Negative Scenario for Get Operation
   RequestSpecification requests;
	Response responses;
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		requests=given().header("content-type","application/json");
	}

	@When("unknown resourse is found")
	public void unknown_resourse_is_found() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		String path="api/unknown/23";
		responses=requests.get(path).then().log().all().extract().response();
	}

	@Then("Accurate unknown message should be displayed")
	public void accurate_unknown_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		System.out.println("response status code : "+responses.getStatusCode()); 
		System.out.println("response status line : "+responses.getStatusLine());
		Assert.assertEquals(404, responses.getStatusCode());
	     Assert.assertEquals("HTTP/1.1 404 Not Found", responses.getStatusLine());
	}  

}