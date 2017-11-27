package testNGscripts;

import org.testng.annotations.Test;

public class IntroTestNG {
	
	/*for reports refresh the project folder and look under --> test-output folder for results*/

	@Test (priority=2, description="this test is opening browser")
	public void test1() {
		System.out.println("test1() performed");
	}
	
	@Test (priority=1)
	public void test2() {
		System.out.println("test2() performed");
	}
	
	@Test (priority=-1)
	public void test3() {
		System.out.println("test3() performed");
	}
}
