package testingSites;

import org.testng.annotations.*;

public class AnnotationsTestNG {

	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("before suite method executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class executed");
	}
	
	@BeforeMethod
	public void beforeM() {
		System.out.println("before method");
	}
	
	@BeforeTest
	public void bTest() {
		System.out.println("before test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@AfterMethod
	public void afterm() {
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterC() {
		System.out.println("Afterclass");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");
	}
}
