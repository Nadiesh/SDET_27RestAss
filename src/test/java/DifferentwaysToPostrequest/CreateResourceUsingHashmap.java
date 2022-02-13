package DifferentwaysToPostrequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.http.ContentType;

public class CreateResourceUsingHashmap {
	public void create() {
		HashMap map = new HashMap();
		map.put("createdBy", "nadesh11");
		map.put("projectname", "Aptyyss");
		map.put("status", "created");
		map.put("team", 1233);
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
.when()
 		.post("http://localhost:8084/addProject")
.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
		
	}

}
