package DataDrivenFrameDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*Using TestNG*/

public class OrangeLogin {

	WebDriver driver;
	
	@Test(dataProvider="loginData")
	public void loginOrangeSite(String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Title: " + driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@DataProvider(name="loginData")
	public Object[][] passData(){
		
		//3 rows 2 columns
		Object[][] dataArr = new Object[3][2];
		
		dataArr[0][0] = "Admin";
		dataArr[0][1] = "admin";
		
		dataArr[1][0] = "Admin1";
		dataArr[1][1] = "admin1";
		
		dataArr[2][0] = "Admin2";
		dataArr[2][1] = "admin2";
		
		return dataArr;
	}
	
}
