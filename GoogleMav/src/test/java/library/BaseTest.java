package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements Constants {
public WebDriver driver;
@BeforeMethod
@Parameters("myBrowser")
public void before(String myBrowser) 
{
	if(myBrowser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if (myBrowser.equalsIgnoreCase("chrome")) {
		System.setProperty(CHROME_DRIVER, CHROME_PATH);
		driver= new ChromeDriver();	
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
}
@AfterMethod
public void close()
{
driver.close();	
}
}
