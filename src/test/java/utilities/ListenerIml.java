package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerIml implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test script is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		Reporter.log("Test case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

}

