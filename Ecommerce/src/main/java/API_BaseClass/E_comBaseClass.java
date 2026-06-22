package API_BaseClass;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import API_Utiity.FileUtility;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class E_comBaseClass 
{
	public FileUtility fu=new FileUtility();
	public RequestSpecification reqspec;
	public ResponseSpecification resspec;
	public String Token="";
	public String ProductId="";
	public int ShopperId;
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("============connecting to DB=============");
		RequestSpecBuilder reqbuilder=new RequestSpecBuilder();
		reqbuilder.setContentType(ContentType.JSON);
		reqbuilder.setBaseUri(fu.readDataFromProperty("BaseURL"));
		reqbuilder.setRelaxedHTTPSValidation();
		reqspec=reqbuilder.build();
		
		
		ResponseSpecBuilder resbuilder=new ResponseSpecBuilder();
		resbuilder.expectResponseTime(Matchers.lessThan(5000L));
		resbuilder.expectContentType(ContentType.JSON);
		resspec=resbuilder.build();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("DB connection close");
	}
}
