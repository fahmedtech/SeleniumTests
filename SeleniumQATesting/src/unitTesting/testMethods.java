package unitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class testMethods {
	
	/*Can only use one browser for the testing*/
	
	String x,y;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is Before Class");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("This is Set Up");
		
		x = "Hello";
		y = "Hello";
	}
	
	@Test
	public void test0() {
		System.out.println("This is Test 0");
		assertEquals(x,y);
	}
	
	@Ignore //you can use the Ignore annotation for skipping tests
	public void test1() {
		System.out.println("This is Test 1");
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test 2");
		//fail("Not yet implemented");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is Tear Down");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is Tear Down After Class");
	}
}
