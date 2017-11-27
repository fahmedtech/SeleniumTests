package testNGscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void testSoftAssert() {
		
		SoftAssert assertObj = new SoftAssert();
		
		System.out.println("testSoft started");
		assertObj.assertEquals(12, 13, "integer doesn't match");
		System.out.println("testSoft complete");
		
		assertObj.assertAll();
	}

	@Test
	public void testHardAssert() {
		System.out.println("testHard started");
		Assert.assertEquals(12, 13);
		System.out.println("testHard complete");
	}
}
