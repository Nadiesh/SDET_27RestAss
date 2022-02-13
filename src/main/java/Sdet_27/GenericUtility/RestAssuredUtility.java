package Sdet_27.GenericUtility;

import io.restassured.response.Response;

/**
 * this class contains generic method specific to rest assured
 * @author 91917
 *
 */

public class RestAssuredUtility {
	/**
	 * this method will return the json data for the json path specified
	 * @param resp
	 * @param jsonPath
	 * @return
	 */
	public String getJsonData(Response resp,String jsonPath) {
		String JsonData=resp.jsonPath().get(jsonPath);
		return JsonData;
	}

}
