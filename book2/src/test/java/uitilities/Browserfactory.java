package uitilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Browserfactory {
	
public static WebDriver starapplicatin(WebDriver driver,String browsername,String appurl){
if(browsername.equals("Chrome")){
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
driver=new ChromeDriver();
}

else{
	System.out.println("browser is not valided");
}
driver.get(appurl);
driver.manage().window().maximize();
return driver;
	
}
	
public static void endbrowser(WebDriver driver){
	driver.quit();
}
	
	

	
}


