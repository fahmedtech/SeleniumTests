package testNGscripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependencyDemo {
	
	@BeforeClass
	public void startBrowser() {
		System.out.println("Start Browser");
	}
	
	@Test 
	public void startApp() {
		System.out.println("Start Website");
		
		//this should fail test and other dependent methods will be skipped
		Assert.assertEquals(12, 10); 
	}
	
	@Test (dependsOnMethods="startApp")
	public void loginPage() {
		System.out.println("Login Website");
	}
	
	@Test (dependsOnMethods="loginPage")
	public void closeApp() {
		System.out.println("Close Website");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
}
