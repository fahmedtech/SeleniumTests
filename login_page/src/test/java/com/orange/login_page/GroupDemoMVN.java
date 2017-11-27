package com.orange.login_page;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupDemoMVN {
	
	@BeforeMethod (alwaysRun = true)
	public void setUp () {
		System.out.println("Before Method() executed!");
	}
	
	@Test (groups = {"Cars", "SUV"})
	public void hondaTest() {
		System.out.println("honda Tested!");
	}
	
	@Test (groups = {"Cars", "Sedan"})
	public void mitsubishiTest() {
		System.out.println("mitsubishi Tested!");
	}
	
	@Test (groups = {"Bikes"})
	public void yamahaTest() {
		System.out.println("yamaha Tested!");
	}
	
	@Test (groups = {"Bikes"})
	public void harleyTest() {
		System.out.println("harley Tested!");
	}

	@AfterMethod (alwaysRun = true)
	public void tearDown () {
		System.out.println("After Method() executed!"); 
	}
	
}