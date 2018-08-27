package testscripts;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FaceBookPO;
import pom.GooglePO;

public class Test1 extends BaseTest {
@Test
public void test()
{
try {
	GooglePO googlePO= new GooglePO(driver);
	googlePO.SrchText("Facebook");
	FaceBookPO faceBookPO= new FaceBookPO(driver);
	Reporter.log("Total no of links are:"+faceBookPO.AllLnks(),true);
	faceBookPO.FBLink().click();
	String aTitle=driver.getTitle();
	String eTitle="Facebook – log in or sign up";
	faceBookPO.CheckTitle(eTitle);
	Assert.assertEquals(aTitle, eTitle);
} catch (TimeoutException e) {
	Assert.fail();
}
}
}
