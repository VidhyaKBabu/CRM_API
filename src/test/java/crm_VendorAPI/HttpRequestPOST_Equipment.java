package crm_VendorAPI;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpRequestPOST_Equipment {

	String baseURI="https://genericcrm.api.kgetechnologies.com/";
	Map<String, Object> requestBody = new HashMap<>();
	@Test
	public  void postEquipment() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("name","Industrial Compressor v7");
		requestBody.put("code", "COMP-SLH-007");
		requestBody.put("equipmentTypeEnum", 13);
		requestBody.put("category", "Pneumatics");
		requestBody.put("manufacturer", "Atlas Copco");
		requestBody.put("serialNumber", "AC-2026-X97");
		requestBody.put("model","string");
		requestBody.put("purchaseDate","2026-03-11T08:30:00+00:00");
		requestBody.put("purchaseCost",12500);
		requestBody.put("warrantyExpiryDate","2026-03-11T08:30:00+00:00");
		requestBody.put("manufacturingSiteId",1);
		requestBody.put("floorId",1);
		requestBody.put("description","Indusrial Compressor");
		

		Response response =	given()
			    .contentType(ContentType.JSON)		
			    .baseUri(baseURI)
			    .body(requestBody)
			.when()
			    .post("/api/v1/VendorClient/00000000-0000-0000-0000-000000000002/equipment")
			.then()
			     .statusCode(200)
			     .log().all()
			    .extract().response() ;
				System.out.println("\n\n<<<-------------------------------------------------------------------------------------------------->>>\n\n");		
			

	}
		
	
	
}
