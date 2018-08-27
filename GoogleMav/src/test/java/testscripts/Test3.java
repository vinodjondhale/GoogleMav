package testscripts;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePO;
import pom.InstagramPO;

public class Test3 extends BaseTest{
	@Test
	public void test()
	{
	try {
		GooglePO googlePO= new GooglePO(driver);
		googlePO.SrchText("Instagram");
		InstagramPO instagramPO= new InstagramPO(driver);
		Reporter.log("Total no of links are:"+instagramPO.AllLnks(),true);
		instagramPO.InstagramLink().click();
		String aTitle=driver.getTitle();
		String eTitle="Instagram";
		instagramPO.CheckTitle(eTitle);
		Assert.assertEquals(aTitle, eTitle);
	} catch (TimeoutException e) {
		Assert.fail();
	}
	}
}
