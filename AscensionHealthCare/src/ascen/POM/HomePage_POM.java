package ascen.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ascen.pages.AscenHomePage;

public class HomePage_POM {

	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		driver =new ChromeDriver() ;
		driver.get("https://healthcare.ascension.org");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(3000);
	}

	@Test
	public void clickingLinks() throws Exception {
		AscenHomePage.goToAscenOrg(driver).click();
		Thread.sleep(3000);

		AscenHomePage.navBack(driver);
		Thread.sleep(3000);

		AscenHomePage.billPay(driver).click();
		Thread.sleep(3000);

		AscenHomePage.navBack(driver);
		Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
