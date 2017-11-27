package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Working with the DropDown on the FaceBook Web site - Birthday*/

public class Dropdown {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//recognizing the web element
		WebElement eleDrop = driver.findElement(By.xpath(".//*[@id='month']"));
		
		//assigning the dropdown to the Select Class in order to select
		Select selMonth = new Select(eleDrop);
		
		//selecting the value from the dropdown
		selMonth.selectByVisibleText("Nov");
			
		/*WORKING WITH THE LIST IN THE DROPDOWN*/
		WebElement eleDrops = driver.findElement(By.xpath(".//*[@id='month']"));
		Select selDrops = new Select(eleDrops);
		
		List<WebElement> listDrops = selDrops.getOptions();
		for(int i=0; i < listDrops.size(); i++) {
			
			System.out.println(listDrops.get(i).getText());
			
			if(listDrops.get(i).getText().equals("Mar")) {
				selDrops.selectByIndex(i);
				break;
			}
		}
		
		/*OTHER WAY OF WRITING FORLOOP*/
		for(WebElement e : listDrops) {
			System.out.print(e.getText() + " ");
		}
		
		//giving explicit time before closing the browser
		Thread.sleep(5000);
		driver.quit();
		
	}//end of main method
}//end of class
