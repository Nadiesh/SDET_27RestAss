package Authentications;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BarearTokenTest {
	@Test
	public void bearerAuth() {
		given()
		 .auth().oauth2("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")
		 .when()
		 .get("https://api.github.com/user/repos")
		 .then()
		 .assertThat().statusCode(200)
		 .log().all();
		
		
	}

}
