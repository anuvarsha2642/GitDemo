package openHrmManagement;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import  static org.hamcrest.Matchers.*;

public class restassuredPractice {

	
	@Test
	public void addAPI()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(payload.addPlace()).when().post("maps/api/place/add/json").then()
		.assertThat().statusCode(200).header("Server","Apache/2.4.18 (Ubuntu)")
		.extract().response().asString();
		System.out.println("the response stored is "+response);
	}
}
