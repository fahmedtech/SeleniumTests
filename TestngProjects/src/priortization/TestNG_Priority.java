package priortization;

import org.testng.annotations.Test;

public class TestNG_Priority {
	
  @Test (priority = 2)
  public void testMethod1 () {
	  System.out.println("\ntestMethod1() executed!"); 
  }
  
  @Test (enabled = false) //unlike in jUnit we use Ignore Annotation
  public void testMethod2 () {
	  System.out.println("testMethod2() executed!"); 
  }
  
  @Test (dependsOnMethods={"testMethod4"}) //testMethod3 depends on testMethod4
  public void testMethod3() {
	  System.out.println("testMethod3() executed!"); 
  }
  
  @Test (priority = 1, timeOut = 400)
  public void testMethod4() throws Exception {
	  System.out.println("testMethod4() executed!\n");
	  
	  //Thread.sleep() should not exceed the timeOut - else it fails
	  Thread.sleep(300);
  }
	
}//end of class