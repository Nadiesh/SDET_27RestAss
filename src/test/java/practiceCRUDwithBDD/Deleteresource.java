package practiceCRUDwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Deleteresource {
	@Test
	public void deleteresource() {
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_403")
		
.then()
		.assertThat().statusCode(204)
		.log().all();
		
		
	}

}
