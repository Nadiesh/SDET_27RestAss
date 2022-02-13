package practiceCRUDwithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class getResources {
	@Test
	public void getresource() {
		when()
    	.get("http://localhost:8084/projects")
    .then()
    	 .assertThat().contentType(ContentType.JSON)
    	 .statusCode(200)
    	 .log().all();
		
		
	}
	

}
