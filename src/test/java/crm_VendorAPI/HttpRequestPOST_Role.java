package crm_VendorAPI;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpRequestPOST_Role {

	String baseURI="https://genericcrm.api.kgetechnologies.com/";
	Map<String, Object> requestBody = new HashMap<>();
	@Test
	public  void postCost() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("orderLineId", 1);
		requestBody.put("materialCost", 1);
		requestBody.put("laborCost", 1);
		requestBody.put("overheadCost", 1);
		requestBody.put("targetCostPerUnit", 1);
		requestBody.put("actualQuantity", 1);
		requestBody.put("costStatus",1);
		

		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/{companyId}/Users/list")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
			

	}
		
	
	
}
