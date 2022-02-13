package DifferentwaysToPostrequest;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreatesourceUsingJavaObjectTEst {
	@Test
	public void createresource() {
		Random ran = new Random();
	      int randomNumber = ran.nextInt(500);
	     
	      JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "Nadesh");
			jobj.put("projectName","APTYss"+ randomNumber);
			jobj.put("status","created");
			jobj.put("teamSize",201);
			
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
