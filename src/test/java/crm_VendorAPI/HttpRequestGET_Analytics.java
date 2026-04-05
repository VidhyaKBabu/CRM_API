package crm_VendorAPI;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import java.util.HashMap;

public class HttpRequestGET_Analytics {
String baseURI="https://genericcrm.api.kgetechnologies.com/";
	
@Test
public void getDashboards() {
	
	given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	.when()
	    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/dashboards")
	.then()
	     .statusCode(200)
	     .log().all();
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

}

@Test
public void getDashboardID() {
	
	given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	.when()
	    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/dashboards/662e1a48-3c3d-4bed-bc67-99e66d865a58")
	.then()
	     .statusCode(200)
	     .log().all();
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

}

@Test
public void getKPIs() {
	
	given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	.when()
	    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/kpis")
	.then()
	     .statusCode(200)
	     .log().all();
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

}
	
@Test
public void getKpiTrends() {
	
	given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	.when()
	    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/kpis/3785d3b3-8175-4b75-8041-8befbb2a2a65/trends")
	.then()
	     .statusCode(200)
	     .log().all();
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

}
	
@Test
public void getProductionOderLine() {
	
	given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	.when()
	    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/production/1")
	.then()
	     .statusCode(200)
	     .log().all();
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

}

@Test
public void getQualityOderLine() {
	
	given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	.when()
	    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/quality/1")
	.then()
	     .statusCode(200)
	     .log().all();
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

}

@Test
public void getCostOderLine() {
	
	given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	.when()
	    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/cost/1")
	.then()
	     .statusCode(200)
	     .log().all();
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

}
	
	
	
@Test
public void getSummary() {
	
	given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	.when()
	    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/Analytics/summary")
	.then()
	     .statusCode(200)
	     .log().all();
	
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");
}
	
		


	
	
	
	
	
	
	
	

}
