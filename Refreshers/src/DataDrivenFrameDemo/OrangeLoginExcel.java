package DataDrivenFrameDemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ApachePOIExcelDemos.ExcelLibConfig;

/*Using TestNG*/

public class OrangeLoginExcel {

	WebDriver driver;
	
	@Test(dataProvider="loginData")
	public void loginOrangeSite(String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Title: " + driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@DataProvider(name="loginData")
	public Object[][] passData() throws FileNotFoundException, IOException{
		
		//using file from ApachePOIExcelDemos Package
		ExcelLibConfig excelObj = new ExcelLibConfig("C:\\Users\\sadaf\\Desktop\\testfile.xlsx");
		
		int rows = excelObj.getRowCount(1); //Sheet2
		
		Object[][] dataArr = new Object[rows][2];
		
		for(int i=0; i < rows; i++) {
			
			dataArr[i][0] = excelObj.getData(1, i, 0); //username
			dataArr[i][1] = excelObj.getData(1, i, 1); //password
		}
		
		return dataArr;
	}
	
}
