package uitilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuredataprovider {
	
	
	
	
	Properties pro;	
public Configuredataprovider(){
File f=new File("./Config/Config.Properties");
try {
	FileInputStream src=new FileInputStream(f);
	 pro=new Properties();
	 pro.load(src);

} catch (IOException e) {
	System.out.println("conefig file is updated"+e.getMessage());
}
}
public String getstringdata(String KeyToSearch){
	return pro.getProperty(KeyToSearch);
	
}
public String getbrowser(){
	return pro.getProperty("browser");
	
}
public String geturl(){
	return pro.getProperty("appurl");
	
}

}
