package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants {
public WebDriver driver;
@BeforeMethod
public void before() 
{
System.setProperty(CHROME_DRIVER, CHROME_PATH);
driver= new ChromeDriver();
driver.get(URL);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterMethod
public void close()
{
driver.close();	
}
}
