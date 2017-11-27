package seleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/calendar/monthly.html?year=2017&month=1&country=1");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//code implementation
		List<WebElement> daysList = driver.findElements(By.xpath("//table[@id='mct1']//tr[@class='cl']"));
		System.out.println(daysList.size());
		
		for(int i=0; i < daysList.size(); i++) {
			String days = daysList.get(i).getText();
			System.out.println("Days " + days);
		}
		
		driver.quit();
	}
	
}
