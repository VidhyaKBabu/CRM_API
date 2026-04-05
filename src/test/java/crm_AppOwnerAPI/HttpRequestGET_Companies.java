package crm_AppOwnerAPI;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import java.util.HashMap;

public class HttpRequestGET_Companies {
	String baseURI="https://genericcrm.api.kgetechnologies.com/";
	
	@Test
	public void usageSummary() {
		
		given()
		    .baseUri(baseURI).accept(ContentType.JSON)
		.when()
		    .get("/api/v1/AppOwner/Companies/00000000-0000-0000-0000-000000000002/usage-summary")
		.then()
		     .statusCode(200)
		     .log().all();
		System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");

	}
	
	
	
	

}
