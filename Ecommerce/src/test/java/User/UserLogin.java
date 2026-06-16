package User;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import API_BaseClass.E_comBaseClass;
import EndPoints.ApiEndpoints;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class UserLogin extends E_comBaseClass
{
@Test
public void userLoginTest()
{
	String BaseURL=fu.readDataFromProperty("BaseURL");
	
	JSONObject json = new JSONObject();
	json.put("email", "jyoti.kamble9828@gmail.com");
	json.put("password", "Test@123");
	json.put("role", "SHOPPER");
	
	Response resp = given().spec(reqspec)
	.body(json)
	.when()
	.post(ApiEndpoints.shopperlogin);
	
	resp.then().log().all();
	Token=resp.jsonPath().get("data.jwtToken");
	ShopperId=resp.jsonPath().getInt("data.userId");
	
	//shopperId=resp.jsonPath().get("data.userId");
	
	resp.then().spec(resspec);
	resp.then().statusCode(200);
	
	long time = resp.time();
	System.out.println("Response Time: " + time);	
	System.out.println(Token);
	System.out.println(ShopperId);
}
}


