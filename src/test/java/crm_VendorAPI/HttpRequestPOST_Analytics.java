package crm_VendorAPI;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.HashMap;
import java.util.Map;
public class HttpRequestPOST_Analytics {
	String baseURI="https://genericcrm.api.kgetechnologies.com/";
	Map<String, Object> requestBody = new HashMap<>();
	
@Test
	public  void postDashboard() {
	Response response;
	String requestBody2 = "{\n" +
            "  \"name\": \"test\",\n" +
            "  \"description\": \"testDesc\",\n" +
            "  \"dashboardType\": 0,\n" +
            "  \"isPublic\": true,\n" +
            "  \"refreshIntervalSeconds\": 0,\n" +
            "  \"configuration\": \"config\"\n" +
            "}";

        String custCode=RandomStringUtils.randomAlphabetic(8);
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("customerCode", custCode);
		requestBody.put("customerType", 0);
		requestBody.put("companyName", "string");
		requestBody.put("contactPerson", "string");
		requestBody.put("email", "string");
		requestBody.put("phone", "string");
		requestBody.put("billingAddress1", "string");
		requestBody.put("billingCity", "string");
		requestBody.put("billingCountry", "string");
		requestBody.put("taxId", "string");
		requestBody.put("creditLimit", 0);
		requestBody.put("paymentTerms", 0);
		requestBody.put("currency", "string");
		requestBody.put("parentCustomerId", "cdab4699-c393-4d87-b6a0-97921a90df23");
	
		

		response =	given()
	    .contentType(ContentType.JSON)		
	    .baseUri(baseURI)
	    .body(requestBody)
	.when()
	    .post("api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Customers/create")
	.then()
	     .statusCode(200)
	     .log().all()
	    .extract().response() ;
		System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
	


}
		
@Test
public  void postKpis() {

	Map<String, Object> requestBody = new HashMap<>();
	requestBody.put("name", "testName");
	requestBody.put("code", "testCode");
	requestBody.put("description", "testDesc");
	requestBody.put("category", 0);
	requestBody.put("metricType",0);
	requestBody.put("unit","");
	requestBody.put("targetValue",0);
	requestBody.put("warningThreshold",0);
	requestBody.put("criticalThreshold",0);
	requestBody.put("aggregationType",0);
	requestBody.put("aggregationPeriod",0);
	requestBody.put("dashboardId","3fa85f64-5717-4562-b3fc-2c963f66afa6");

	Response response =	given()
		    .contentType(ContentType.JSON)		
		    .baseUri(baseURI)
		    .body(requestBody)
		.when()
		    .post("api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/kpis")
		.then()
		     .statusCode(201)
		     .log().all()
		    .extract().response() ;
			System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
		

}
	

@Test
public  void postProduction() {
//	Map<String, Object> requestBody = new HashMap<>();
	requestBody.put("orderLineId", 1);
	requestBody.put("targetQuantity", 1);
	requestBody.put("actualQuantity", 1);
	requestBody.put("wastageQuantity", 1);
	requestBody.put("defectQuantity", 1);
	requestBody.put("plannedHours", 1000);
	requestBody.put("actualHours", 1000);
	requestBody.put("performanceStatus", 1);
	
	Response response =	given()
		    .contentType(ContentType.JSON)		
		    .baseUri(baseURI)
		    .body(requestBody)
		.when()
		    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/production")
		.then()
		     .statusCode(200)
		     .log().all()
		    .extract().response() ;
			System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
		
}

@Test
public  void postQuality() {
	
//	Map<String, Object> requestBody = new HashMap<>();
	requestBody.put("orderLineId", "1");
	requestBody.put("totalInspected", "0");
	requestBody.put("defectsFound", "0");
	requestBody.put("rejectedUnits", "0");
	requestBody.put("topDefectCategory", "0");
	requestBody.put("topDefectCount", "0");
	
	Response response =	given()
		    .contentType(ContentType.JSON)		
		    .baseUri(baseURI)
		    .body(requestBody)
		.when()
		    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/quality")
		.then()
		     .statusCode(200)
		     .log().all()
		    .extract().response() ;
		System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
		
}


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
		    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/cost")
		.then()
		     .statusCode(200)
		     .log().all()
		    .extract().response() ;
			System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
		

}


}
