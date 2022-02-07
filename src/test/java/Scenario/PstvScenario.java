package Scenario;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class PstvScenario {

	public static void main(String[] args) {

		//		POST Call
/*		Response res1= given().log().all()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"ABC\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}")
				.when().post("https://reqres.in/api/users")
				.then().log().all().statusCode(201).extract().response(); 
		
    //		GET Call API
		Response res= given().log().all()
				.queryParam("page", "2")
				.header("Content-Type","application/json")
				.when().get("https://reqres.in/api/users?page=2")
				.then().log().all().statusCode(200).extract().response();  */
		
	

			//put API
			
				Response res2 = (Response)given().log().all()
						.queryParam(" ", "2")
						.header("Content-Type","application/json")
						.body("{\r\n"
								+ "    \"name\": \"morpheus\",\r\n"
								+ "    \"job\": \"zion resident\"\r\n"
								+ "}")
						.when().put("https://reqres.in/api/users/2")
						.then().assertThat().log().all().statusCode(200).extract().response();
	}

	
}
