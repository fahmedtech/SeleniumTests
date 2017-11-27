package testNGscripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases started and details are " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	//implemented code
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and details are " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
