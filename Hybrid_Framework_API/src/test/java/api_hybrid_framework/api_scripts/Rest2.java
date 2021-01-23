package api_hybrid_framework.api_scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import api_hybrid_framework.generic.Json_extract;
import api_hybrid_framework.generic.Spec_Builder_API;
import io.restassured.response.Response;

public class Rest2 {

	public static void main(String[] args) throws IOException, ParseException 
	{
		JSONArray a1 = Json_extract.Nest_Json();
		for(int i=0;i<a1.size();i++)
		{
			Response res = given().spec(Spec_Builder_API.request_spec_builder()).body(a1.get(i)).
					when().post("/api/users").then().spec(Spec_Builder_API.response_spec_builder(201)).extract().response();
			System.out.println(res.asString());
		}

	}

}
