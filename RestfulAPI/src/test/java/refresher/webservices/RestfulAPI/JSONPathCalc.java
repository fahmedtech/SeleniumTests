package refresher.webservices.RestfulAPI;

import static io.restassured.RestAssured.given;

import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JSONPathCalc {
	
	@Test
	public void test01() throws URISyntaxException {
		
		URI uri = new URI("http://samples.openweathermap.org/data/2.5/weather");
		
		Response resp = given().param("q", "London")
							   .param("appid", "b1b15e88fa797225412429c1c50c122a1")
							   .when()
							   .get(uri);
		
		String weatherReport =  resp.then()
							   .contentType(ContentType.JSON)
							   .extract()
							   .path("weather[0].description");
		System.out.println("Report: " + weatherReport);
		
		if(weatherReport.equalsIgnoreCase("light intensity drizzle")) {
			System.out.println("Test case passed!");
		}
		else {
			System.out.println("Test case failed!");
		}
	}

}
