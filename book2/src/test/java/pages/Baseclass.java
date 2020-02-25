package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import uitilities.Browserfactory;
import uitilities.Exceldataprovider;

public class Baseclass {
	
	
	
	
public  WebDriver driver;
public Exceldataprovider excel;
@BeforeSuite
public void beforesuite(){
excel=new Exceldataprovider();

}

@BeforeClass
public void setup(){
driver=Browserfactory.starapplicatin(driver, "Chrome","http://www.gcrit.com/build3/admin/login.php" );

	
}
@AfterClass
public void shountbrowser(){
Browserfactory.endbrowser(driver);
}

}
