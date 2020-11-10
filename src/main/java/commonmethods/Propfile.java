package commonmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class Propfile {
	
	static Properties prop = new Properties();
	
	public static String getpropvalue(String key) throws Exception {
		
		//String pfpath = "C:\\Users\\Vinay Dabhi\\eclipse-workspace\\com.abc\\src\\javapack\\advshopp\\src\\test\\resources\\config.properties" ;
		String pfpath= System.getProperty("user.dir") +"\\src\\test\\resources\\config.properties";
	    FileInputStream fis = new FileInputStream(pfpath);
	    prop.load(fis);
	    //read file
	    String value = prop.get(key).toString();
	    
	    if(StringUtils.isEmpty(value)) {
	    	
	    	throw new Exception ("value is not available");
	    }
	    
	    return value;
	    
	
	}

}
