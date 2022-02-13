package practiceCRUDwithoutBDD;


	import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	import io.restassured.response.ValidatableResponse;
	import io.restassured.specification.RequestSpecification;

	public class UpdateProject {
		
		@Test
		public void updateProject() {
			
			//step1 
			JSONObject jObj = new JSONObject();
			jObj.put("createdBy", "nadesh");
			jObj.put("projectName","Apty" );
			jObj.put("status", "Completed");
			jObj.put("teamSize", 20);
			
			//step2  
			 RequestSpecification req = RestAssured.given();
			req.contentType(ContentType.JSON);
			req.body(jObj);
			
			//step3 
			 Response resp = req.put("http://localhost:8084/projects/TY_PROJ_004");
			  
			//step 4  verify only
			 
			 ValidatableResponse validate = resp.then();
			 validate.assertThat().statusCode(200);
			 validate.log().all();
				
		}

	}


