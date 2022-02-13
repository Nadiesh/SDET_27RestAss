package responseValidation;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

public class VerifyResponseTime {
	public void verify() {
		when()
		     .get("http://localhost:8084/projects")
		 .then()
		      .assertThat().time(Matchers.lessThan(500L),TimeUnit.MILLISECONDS)
		      .log().all();
		
	}

}
