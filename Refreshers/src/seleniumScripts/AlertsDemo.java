package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsDemo {

	static WebDriver driver;
	
	//using TestNG
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void handleAlerts() throws InterruptedException {
		String alertMsg = "";
		String expectedAlert = "Do you really want to delete this Customer?";
		
		WebElement butDelCustomer = driver.findElement(By.xpath("//input[@value='Submit']"));
		butDelCustomer.click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		alertMsg = alt.getText();
		System.out.println(alertMsg);
		
		alt.accept();
		
		Thread.sleep(3000);
		
		alt.accept(); //accepting the second alert msg
		
		Assert.assertEquals(alertMsg, expectedAlert);
		
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
