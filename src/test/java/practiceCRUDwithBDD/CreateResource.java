package practiceCRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateResource{
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