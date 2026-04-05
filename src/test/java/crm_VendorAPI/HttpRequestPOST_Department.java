package crm_VendorAPI;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpRequestPOST_Department {
	String baseURI="https://genericcrm.api.kgetechnologies.com/";
	Map<String, Object> requestBody = new HashMap<>();
	@Test
	public  void postDepartment() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("name", "string");
		requestBody.put("code", "string");
		requestBody.put("description", "string");
		requestBody.put("parentDepartmentId", 0);
		requestBody.put("departmentHeadId", 0);
		requestBody.put("costCenter", "string");
		requestBody.put("allocatedBudget", 0);
		


		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/department")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
			

	}
//	@Test
	public  void putDepartmentID() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("name", "Chennai District");		
		requestBody.put("description", "District under Tamil Nadu");		
		requestBody.put("departmentHeadId", 4);	
		requestBody.put("allocatedBudget", 500000);
		requestBody.put("status", 2);
		


		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)	
			    .param("id", 5)
			    .body(requestBody)
			.when()
			    .put("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/department/5")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
			

	}
	
	

}
