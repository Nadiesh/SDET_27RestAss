package parameters;

import static io.restassured.RestAssured.*;

public class QueryParameterTest {
	public void param() {
		given()
		.queryParam("page", "10")
		.when()
		.get("https://reqres.in/api/users")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
