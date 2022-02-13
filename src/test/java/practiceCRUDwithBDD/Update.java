package practiceCRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class Update {
	@Test
	public void update() {
		Random ran = new Random();
	      int randomNumber = ran.nextInt(500);
	     
	      JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "Nadesh");
			jobj.put("projectName","Testyantra"+ randomNumber);
			jobj.put("status","completed");
			jobj.put("teamSize",2023);
			
			given()
					.body(jobj)
					.contentType(ContentType.JSON)
					
			.when()
			 		.put("http://localhost:8084/projects/TY_PROJ_403")
			.then()
					.assertThat().statusCode(200)
					.contentType(ContentType.JSON)
					.log().all();
		
		
	}
	

}
