package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Baseclass;
import pages.Pageobjectmodel;



public class Gcrit extends Baseclass {
	
	
	
	
	
@Test
public  void launchapplication(){
System.out.println("gcrit application is launched");
Pageobjectmodel login=PageFactory.initElements(driver, Pageobjectmodel.class);
login.startapplication(excel.getStringdata("login", 0, 0), excel.getStringdata("login", 0, 1));
}

}
