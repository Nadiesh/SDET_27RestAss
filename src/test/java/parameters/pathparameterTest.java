package parameters;

import static io.restassured.RestAssured.*;

public class pathparameterTest{
	public void param() {
		String proid = "TY_PROJ_602";
	given()
	   .pathParam("projectId", proid)
	   .when()
	   .delete("http://localhost:8084/addProject/{projectId}")
	   .then()
	   .log().all();
	   
	}
	
}