package api_hybrid_framework.generic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_extract 
{
	public static JSONArray Nest_Json() throws FileNotFoundException, IOException, ParseException
	{
		JSONParser jp = new JSONParser();
		Object a1 = jp.parse(new FileReader("./src/test/java/api_hybrid_framework/utils/TestData.json"));
		JSONObject j1=(JSONObject) a1;
		JSONArray  j2=(JSONArray) j1.get("dataTest");
		return j2;
	}
}
