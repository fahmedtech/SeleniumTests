package testingSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDataProvider {
	
private WebDriver driver;
	
	@BeforeMethod (alwaysRun = true)
	public void openBrowser () throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
	}
	
	@DataProvider (name = "TestData")
	public Object[][] getData (){
		
		Object [][] data = new Object [3][2];
		
		data [0][0] = "username1";
		data [0][1] = "password1";
		
		data [1][0] = "username2";
		data [1][1] = "password2";
		
		data [2][0] = "username3";
		data [2][1] = "password3";
		
		return data;
	}
	
	@Test (dataProvider = "TestData")
	public void logIn (String username , String password) throws InterruptedException{
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown (){
		driver.quit();
	}

}