package Authentications;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2 {
	@Test
	public void auths() {
		Response response = given()
		.formParam("client_id", "my token")
		.formParam("client_secret", "7efd08219ed01db2636567a29d2972a9")
		.formParam("grant_type","client_credentials" )
		.formParam("redirect_uri", "https://example.com")
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		String token = response.jsonPath().get("access_token");
		
	given()
	.auth().oauth2(token)
	.pathParam("User Id", "2786")
	.when()
	.post("http://coop.apps.symfonycasts.com/api/{User Id}/eggs-count")
	.then()
	.log().all();
		
		
		
		
	}

}
