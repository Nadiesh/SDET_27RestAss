package practiceCRUDwithoutBDD;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjects {
	
	@Test
	public void getAllProjects() {
		
		//step1 
		int expstatus = 200 ;
		Response resp = RestAssured.get("http://localhost:8084/projects");
		
		//step2 
		System.out.println(resp.prettyPeek());
		int accstatus = resp.getStatusCode();
		Assert.assertEquals(expstatus, accstatus);
			
	}

}
