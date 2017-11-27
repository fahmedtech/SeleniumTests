package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//testing methods
		System.out.println(verifyTitle());
		
		driver.quit();
	}
	
	public static boolean verifyTitle() {
		
		String websiteTitle = driver.getTitle();
		
		return websiteTitle.equals("Facebook - Log In or Sign Up");
		
		/*can also use JUnit for Assert.assertEquals(actual, expected result); */
	}
	
}
