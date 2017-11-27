package refresher.webservices.RestfulAPI;

import java.net.URI;
import java.net.URISyntaxException;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class WeatherAPIGetRequests {

	//simple GET request for getting weather request by city name
	//Status Code: 200 (Pass)
	@Test (enabled = true)
	public void Test01() throws URISyntaxException {
		
		URI uri = new URI("http://samples.openweathermap.org/data/2.5/weather?q=London&appid=b1b15e88fa797225412429c1c50c122a1");
		
		Response resp = when().get(uri);
		
		int respCode = resp.getStatusCode();
		Assert.assertEquals(200, respCode);
		
		System.out.println(respCode);
	}
	
	//Status Code: 401 (Client Error)
	@Test
	public void Test02(){
			
		Response resp2 = when().get("http://samples.openweathermap.org/data/2.5/weather");
			
		ResponseBody respCode2 = resp2.body();	
		String x = respCode2.print();
		
		Assert.assertEquals(x.contains("\"cod\":401"), true);
	}
}
