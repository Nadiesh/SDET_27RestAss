package DifferentwaysToPostrequest;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;

public class CreateResourceUsingJSonFile {
	public void create() {
		File file = new File("./Createdata.json");
		given()
		.body(file)
		.contentType(ContentType.JSON)
		
.when()
 		.post("http://localhost:8084/addProject")
.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
	}

}
