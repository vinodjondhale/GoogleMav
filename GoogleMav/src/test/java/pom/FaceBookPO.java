package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class FaceBookPO extends BasePage {
public FaceBookPO(WebDriver driver) {
super(driver);
}

@FindBy(xpath="//a")
private List<WebElement> AllLnks;
public int AllLnks()
{
return 	AllLnks.size();
}

@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
private WebElement FBLink;
public WebElement FBLink() 
{
return FBLink;	
}


}
