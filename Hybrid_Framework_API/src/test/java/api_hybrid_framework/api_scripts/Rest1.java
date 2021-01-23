package api_hybrid_framework.api_scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import api_hybrid_framework.generic.Spec_Builder_API;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Rest1 
{
	public static void main(String[] args) throws IOException 
	{
			Response res1 = given().spec(Spec_Builder_API.request_spec_builder()).when().get("/api/users?page=2").then().spec(Spec_Builder_API.response_spec_builder(200)).extract().response();
			System.out.println(res1.asString());
	}
}
