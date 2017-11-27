package testNGscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	public void test1() {
		
		Assert.assertEquals("hello", "hello");
		Assert.assertEquals(12, 12);
		
		String x = "hello world";
		Assert.assertTrue(x.contains("world"));
	}
	
	@Test
	public void test2() {

		Assert.assertEquals("hello", "bye", "check with developer");
		Assert.assertEquals(12, 13);
		
		String x = "hello world";
		Assert.assertTrue(x.contains("null"));
	}
	
}