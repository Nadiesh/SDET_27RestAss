package PracticeRestAssured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectTest {
	@Test
	public void Create() {
		   JSONObject jobj = new JSONObject();
					jobj.put("designation", "SDET27");
					jobj.put("DOB","12/06/1998");
					jobj.put("email","nadesh7782gmail.com");
					jobj.put("projectName", "deepak_pro-5");
					jobj.put("empname","nadesh");
					jobj.put("project","hdfc1");
					
					given()
							.body(jobj)
							.contentType(ContentType.JSON)
							
					.when()
					 		.post("http://localhost:8084/addProject")
					.then()
							.assertThat().statusCode(201)
							.contentType(ContentType.JSON)
							.log().all();
		
	}
	
	
   
   
	

}
