package DifferentwaysToPostrequest;

import static io.restassured.RestAssured.given;

import PojoLibrary.PojoClass;
import io.restassured.http.ContentType;

public class CreateResourceusingPojo {
	public void create() {
		PojoClass pojo  =new PojoClass("nadesh", "testyantra","testyantra project", 1234);
		String file;
		given()
		.body(pojo)
		.contentType(ContentType.JSON)
		
.when()
 		.post("http://localhost:8084/addProject")
.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
	}
	}


