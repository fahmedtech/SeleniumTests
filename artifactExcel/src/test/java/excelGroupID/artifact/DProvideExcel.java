package excelGroupID.artifact;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvideExcel {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openExcel() {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@DataProvider (name = "TestData")
	public String[][] getExcelData (String fileName, String sheetName) throws IOException{
		
		String[][] arrayExcelData = null;
		
		FileInputStream file = new FileInputStream("C:\\Users\\sadaf\\OneDrive\\Documents\\" + 
				"QAWorkspace\\artifactExcel\\src\\test\\java\\" +
				"excelGroupID\\artifact\\" + fileName);
		
		ExcelUtils.setExcelFile("D://ToolsQA//OnlineStore//src//testData//TestData.xlsx","Sheet1");
		 
	 	sTestCaseName = this.toString();
	 	
	 	
	}
	
	@Test (dataProvider = "TestData")
	public void logIn (String username , String password) throws InterruptedException{
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
