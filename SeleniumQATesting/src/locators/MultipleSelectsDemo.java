package locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectsDemo {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//working with multiple select element
		WebElement mulSel = driver.findElement(By.xpath(".//*[@id='multiple-select-example']"));
		
		Select selOptions = new Select(mulSel);
		
		selOptions.selectByIndex(0);
		selOptions.selectByIndex(1);
		Thread.sleep(3000);
		selOptions.selectByIndex(2);
		selOptions.deselectByVisibleText("Apple");
		Thread.sleep(3000);
		selOptions.deselectAll();
		Thread.sleep(2000);
		
		//using List<WE> to print & select all multiple select elements
		List<WebElement> mulList = selOptions.getOptions();
		
		for(int i=0; i < mulList.size(); i++) {
			System.out.print(mulList.get(i).getText() + " ");
			
			selOptions.selectByIndex(i);
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}//end of class
