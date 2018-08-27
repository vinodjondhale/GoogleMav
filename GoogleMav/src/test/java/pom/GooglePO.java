package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.BasePage;

public class GooglePO extends BasePage{
public GooglePO(WebDriver driver) {
	super(driver);
}

@FindBy(name="q")
private WebElement SrchTxtBx;
public WebElement SrchTxtBx()
{
return 	SrchTxtBx;
}


public void SrchText(String value)
{
	SrchTxtBx.sendKeys(value);
	SrchTxtBx.sendKeys(Keys.ENTER);
}
}
