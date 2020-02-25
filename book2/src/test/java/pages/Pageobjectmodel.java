package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobjectmodel {
	
	
	
	
	
WebDriver driver;
public Pageobjectmodel(WebDriver driver){
	this.driver=driver;
}
@FindBy(name="username") WebElement user;
@FindBy(name="password") WebElement pwd;
@FindBy(id="tdb1") WebElement button;
public  void startapplication(String uname,String upass){
	user.sendKeys(uname);
	pwd.sendKeys(upass);
	button.click();
}
}
