package crm_VendorAPI;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpRequestPOST_Manufacture {

	String baseURI="https://genericcrm.api.kgetechnologies.com/";
	Map<String, Object> requestBody = new HashMap<>();
	@Test
	public  void postCost() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("name", "North Logistics Hub6");
		requestBody.put("code", "NLH-006");
		requestBody.put("siteTypeEnum", 1);
		requestBody.put("factoryId", 1);
		requestBody.put("latitude", 35.05);
		requestBody.put("longitude", 119.24);
		requestBody.put("phoneNumber", "+1-555-0198");
		requestBody.put("emailAddress","ops.northlog@factorycorp.com");
		requestBody.put("siteManagerId",1);
		requestBody.put("siteCapacity",5000);
		
	
		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/manufacturing-site")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
			

	}
		
	
	
}
