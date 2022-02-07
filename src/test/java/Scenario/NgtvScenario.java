package Scenario;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class NgtvScenario {

	public static void main(String[] args) {

		//		POST Call
	/*	Response res1= given().log().all()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"Sweety\",\r\n"
						+ "    \"job\": \"System Engineer\"\r\n"
						+ "}")
				.when().post("https://reqres.in/api")
				.then().log().all().statusCode(201).extract().response(); */
		
		//put API
		Response res2 = (Response)given().log().all()
				.queryParam(" ", "2")
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \" \",\r\n"
						+ "}")
				.when().put("https://reqres.in/api/users/2")
				.then().assertThat().log().all().statusCode(200).extract().response();
		
}
}
