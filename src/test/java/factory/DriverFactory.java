package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public static WebDriver initializeBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equals("edge")) {
			
			driver=new EdgeDriver();
		}else {
			
			System.out.println("No Driver Selected");
		}
		return driver;
		
		
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
