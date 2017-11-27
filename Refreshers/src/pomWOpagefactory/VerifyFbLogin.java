package pomWOpagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyFbLogin {
	
	/*Testing in TestNG*/
	
	@Test
	public void verifyValidLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//code implementation
		FbLoginPage login = new FbLoginPage(driver);
		
		login.enterUsername("abc123@gmail.com");
		login.enterPassword();
		Thread.sleep(3000);
		
		login.clickLoginButton();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
