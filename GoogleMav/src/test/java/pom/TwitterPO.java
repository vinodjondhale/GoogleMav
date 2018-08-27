package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class TwitterPO extends BasePage {
public TwitterPO(WebDriver driver) {
super(driver);
}

@FindBy(xpath="//a")
private List<WebElement> AllLnks;
public int AllLnks()
{
return 	AllLnks.size();
}

@FindBy(xpath="//a[text()='Login on Twitter']")
private WebElement TwitterLink;
public WebElement TwitterLink() 
{
return TwitterLink;	
}
}
