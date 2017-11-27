package testPackageDemo;
import org.testng.annotations.Test;

public class TestDemo {

	//using TestNG - and converting to xml format 
	
	@Test
	public void testStDemo() {
		System.out.println("Jenkins Demo Method tested!");
	}
	
	/*
	 * To run test from cmd
	 * go to project folder - and create a lib folder 
	 * inside lib - copy paste all jar files
	 * then create a batch file "run.bat" --> paste the code (file is there in directory)
	 * create new Item in Jenkins - and then setup the custom workspace directory under Advanced
	 * setup the build to run batch files
	 * specify the name of the batch file
	 * click build now
	 * and check console results
	 */
}
