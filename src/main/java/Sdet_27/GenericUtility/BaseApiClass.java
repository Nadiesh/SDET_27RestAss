package Sdet_27.GenericUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseApiClass {
	public DataBaseUtility dLib = new DataBaseUtility();
	public javaUtility jlib =  new javaUtility();
	public RestAssuredUtility rLib = new RestAssuredUtility();
	
	@BeforeSuite
	public void bsconfig() throws Throwable 
	{
		
		  baseURI = "http://localhost";
			port = 8084;
			
			dLib.connectDb();
			System.out.println("------database connection established----");
	}
	@AfterSuite
	public void asconfig() throws Throwable
	{
		dLib.closeDb();
		System.out.println("--------database connection closed");
	}

}
