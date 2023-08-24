package testcase;

import org.testng.annotations.Test;

public class VerifyPageTitleAfterNavToDropOption extends BaseTest{
	
	HomePage homepage;

	@Test (priority=1, groups= {"sanity"},description="This if title verification")
	public void verifyPageTitleOfFlipkart()
	{
		homepage=new HomePage(driver);
		
	}
}
