package utils;

import java.util.Properties;
import java.io.*;

public class ConfigReader {
	
	
	
	public static Properties initializePropertoes()  {
		
		Properties prop = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
		
		try {
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return prop;
	}

}

//src\test\resources\config\config.properties