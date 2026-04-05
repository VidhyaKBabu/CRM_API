package crm_VendorAPI;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpRequestPOST_Users {

	String baseURI="https://genericcrm.api.kgetechnologies.com/";
	Map<String, Object> requestBody = new HashMap<>();
	
	@Test
	public  void postUserList() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("page", 1);
		requestBody.put("pageSize", 10);
		requestBody.put("status", 1);
		requestBody.put("ascending", true);
		
	
		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Users/list")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
	
	}
	
	@Test
	public  void postUserSearch() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("searchTerm", "Mike");
		requestBody.put("department", "Quality Control");
		requestBody.put("employeeType", 0);
		requestBody.put("status", 1);
		requestBody.put("page", 1);
		requestBody.put("pageSize", 10);
	
	
		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Users/search")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
	
	}
	
	@Test
	public  void postUserEditUserID() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("name", "Vikash T");
		requestBody.put("email", "vikash@gmail.com");
		requestBody.put("department", "Warehouse");
		requestBody.put("employeeId", "1954ab1a-5d73-4e96-9fb9-bf05736ab69c");
		requestBody.put("phoneNumber", "+1-555-123-4570");
		requestBody.put("employeeType", 0);
		requestBody.put("status", 1);
		requestBody.put("allowToLogin", true);
		
	
		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .put("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Users/1954ab1a-5d73-4e96-9fb9-bf05736ab69c")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
	
	}
	
	@Test
	public  void postUserCreate() {
		Map<String, Object> requestBody = new HashMap<>();
		String empId= "85e225df-c4c9-4be9-9d8f-"+RandomStringUtils.randomAlphanumeric(12);
		String name="Cam"+RandomStringUtils.randomAlphabetic(5);
		String email=name+"@gmail.com";
		System.out.println(empId);
		requestBody.put("email", email);
		requestBody.put("name", name);
		requestBody.put("active", true);
		requestBody.put("auth0Sub", "string");
		requestBody.put("department", "Warehouse");
		requestBody.put("employeeId", empId);
		requestBody.put("phoneNumber", "+1-555-123-4670");
		requestBody.put("employeeType", 0);	
		requestBody.put("allowToLogin", true);
		
		
		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Users/create")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
	
	}
	
	@Test
	public  void postUserActivate() {
		Map<String, Object> data = new HashMap<>();
		data.put("userId", "");
		data.put("status", 0);
		
		requestBody.put("status", 0);
		requestBody.put("message", "msg");
		requestBody.put("data", data);
		requestBody.put("errorCode", 0);	
		requestBody.put("timestamp", "2026-04-04T16:38:21.000Z");
			
		
		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Users/a825729b-2346-4010-bab4-44691d5ff72e/activate")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
	
	}
	
	@Test
	public  void postUserAssignRole() {

			
		String requestbody="{\r\n"
				+ "  \"roleIds\": [\r\n"
				+ "    0\r\n"
				+ "  ]\r\n"
				+ "}";
		
		
		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Users/eeeeeeee-eeee-eeee-eeee-eeeeeeeeee02/assign-roles")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
	
	}
	
	
//	@Test
	public  void postUserRemoveRole() {

			
		String requestbody="{\r\n"
				+ "  \"roleId\": 0\r\n"
				+ "}";
		
		
		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Users/eeeeeeee-eeee-eeee-eeee-eeeeeeeeee02/remove-role")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
	
	}
	

}
