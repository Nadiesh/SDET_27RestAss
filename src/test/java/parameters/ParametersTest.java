package parameters;

import static  io.restassured.RestAssured.*;

public class ParametersTest {
	public void param() {
		given()
		.pathParam("username", "Nadiesh")
		.queryParam("sort", "created")
		.queryParam("per_page", "100")
		.when()
		.get("https://github.com/users/{username}/repos")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
