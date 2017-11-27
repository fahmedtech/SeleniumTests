package seleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownDemo {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
	
		driver = new ChromeDriver();

		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//SelectDropDownValues();
		//checkingIndexValues();
		getAllDropDownValues();
	}
	
	public static void SelectDropDownValues() throws InterruptedException {
		
		WebElement monthDD = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		
		Select selMonth = new Select(monthDD);
		selMonth.selectByIndex(11); //November
		Thread.sleep(3000);
		
		WebElement dayDD = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		Select selDay = new Select(dayDD);
		selDay.selectByValue("9");
		Thread.sleep(3000);
		
		WebElement yearDD = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		Select selYear = new Select(yearDD);
		selYear.selectByVisibleText("1995");
	}

	public static void checkingIndexValues() throws InterruptedException {
		
		//Month dropdown on fb.com
		WebElement eleM = driver.findElement(By.xpath("//select[@id='month']"));
		Select selM = new Select(eleM);
		
		WebElement eleM2 = selM.getFirstSelectedOption();
		System.out.println("First Selected Option: " + eleM2.getText());
		
		selM.selectByIndex(3);
		
		WebElement ele3 = selM.getFirstSelectedOption();
		System.out.println("After Selection Option: " + ele3.getText());
	}
	
	public static void getAllDropDownValues() {
		
		WebElement wMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select sMonth = new Select(wMonth);
		
		List<WebElement> listMonth = sMonth.getOptions();
		
		for(WebElement x : listMonth) {
			System.out.println(x.getText());
		}
	}
}
