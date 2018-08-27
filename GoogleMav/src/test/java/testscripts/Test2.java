package testscripts;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePO;
import pom.TwitterPO;

public class Test2  extends BaseTest{
	@Test
	public void test()
	{
	try {
		GooglePO googlePO= new GooglePO(driver);
		googlePO.SrchText("Twitter");
		TwitterPO twitterPO= new TwitterPO(driver);
		Reporter.log("Total no of links are:"+twitterPO.AllLnks(),true);
		twitterPO.TwitterLink().click();
		String aTitle=driver.getTitle();
		String eTitle="Login on Twitter";
		twitterPO.CheckTitle(eTitle);
		Assert.assertEquals(aTitle, eTitle);
	} catch (TimeoutException e) {
		Assert.fail();
	}
	}
}
