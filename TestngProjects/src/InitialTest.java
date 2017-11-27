import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InitialTest {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\geckodriver.exe");

		//opening website on browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//performing tests on elements
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='u_0_a']"));
		firstName.sendKeys("Hara");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("Zara");
		driver.findElement(By.xpath(".//*[@id='u_0_f']")).sendKeys("tatta@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='u_0_i']")).sendKeys("tatta@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("TestPASSWORD");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).click();
		
		Thread.sleep(3000);
		
		WebElement drpMonth = driver.findElement(By.xpath(".//*[@id='month']"));
		WebElement drpDate = driver.findElement(By.xpath(".//*[@id='day']"));
		WebElement drpYear = driver.findElement(By.xpath(".//*[@id='year']"));
		
		Thread.sleep(3000);

		Select selMonth = new Select(drpMonth);
		selMonth.selectByIndex(11);

		Select selDate = new Select(drpDate);
		selDate.selectByValue("9");

		Select selYear = new Select(drpYear);
		selYear.selectByVisibleText("1995");

		Thread.sleep(3000);

		WebElement butCreateAcc = driver.findElement(By.xpath(".//*[@id='u_0_s']"));
		butCreateAcc.click();

		Thread.sleep(3000);

		//navigating back to the previous page
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.quit();

	}
}
