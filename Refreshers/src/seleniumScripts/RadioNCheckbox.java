package seleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioNCheckbox {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
			
		driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//testing methods
		selectRadioButton();
		Thread.sleep(3000);
		
		selectCheckboxes();
	}

	public static void selectRadioButton() {
		
		List<WebElement> listRadio = driver.findElements(By.xpath("//input[@name='cars' and @type='radio']"));
		
		for(int i=0; i < listRadio.size(); i++) {
			
			WebElement carsRadio = listRadio.get(i);
			String carVal = carsRadio.getAttribute("value");
			
			System.out.println("Values of Radio Buttons " + carVal);
			
			if(carVal.equals("bmw"))
				carsRadio.click();
		}
	}
	
	public static void selectCheckboxes() {
		List<WebElement> carsCB = driver.findElements(By.xpath("//input[@name='cars'][@type='checkbox']"));
	
		for(int i=0; i < carsCB.size(); i++) {
			WebElement singleCar = carsCB.get(i);
			
			String checkVal = singleCar.getAttribute("value");
			
			System.out.println("Values of CheckBoxes " + checkVal);
			
			if(checkVal.equals("benz") || checkVal.equals("honda")) {
				singleCar.click();
			}
		}
	}
	
}
