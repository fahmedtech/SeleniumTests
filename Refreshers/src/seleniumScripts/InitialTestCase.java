package seleniumScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InitialTestCase {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		//opening website on browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//performing tests on elements
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Zara");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test Lname");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Test@Email.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Test@Email.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("TestPASSWORD");
		
		WebElement drpMonth = driver.findElement(By.xpath(".//*[@id='month']"));
		WebElement drpDate = driver.findElement(By.xpath(".//*[@id='day']"));
		WebElement drpYear = driver.findElement(By.xpath(".//*[@id='year']"));
	
		Select selMonth = new Select(drpMonth);
		selMonth.selectByIndex(11);
		
		Select selDate = new Select(drpDate);
		selDate.selectByValue("9");
		
		Select selYear = new Select(drpYear);
		selYear.selectByVisibleText("1995");
		
		Thread.sleep(3000);
		
		WebElement butCreateAcc = driver.findElement(By.xpath("//button[@name='websubmit']"));
		butCreateAcc.click();
		
		Thread.sleep(3000);

		driver.quit();
		System.out.println("Test Complete");
	}	
}
