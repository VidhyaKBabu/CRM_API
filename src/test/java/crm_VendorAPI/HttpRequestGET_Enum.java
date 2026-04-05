package crm_VendorAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class HttpRequestGET_Enum {
String baseURI="https://genericcrm.api.kgetechnologies.com/";
	
	@Test
	public void getDashboards() {
		given()
	    .baseUri(baseURI).accept(ContentType.JSON)
	    .headers("X-CompanyId", "00000000-0000-0000-0000-000000000002")
	.when()
	    .get("/api/v1/VendorClient/Enums/all")
	.then()
	     .statusCode(200)
	     .log().all();
	System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

}

	@Test
	public void getDashboards2() {	
		given()
		    .baseUri(baseURI).accept(ContentType.JSON)
		.when()
		    .get("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/manufacturing-site/by-factory/1")
		.then()
		     .statusCode(200)
		     .log().all();
		System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

	}



}
