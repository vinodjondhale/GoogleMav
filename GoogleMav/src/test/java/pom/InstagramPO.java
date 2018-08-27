package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class InstagramPO extends BasePage {
public InstagramPO(WebDriver driver) {
super(driver);
}

@FindBy(xpath="//a")
private List<WebElement> AllLnks;
public int AllLnks()
{
return 	AllLnks.size();
}

@FindBy(xpath="//a[text()='Instagram']")
private WebElement InstagramLink;
public WebElement InstagramLink() 
{
return InstagramLink;	
}
}
