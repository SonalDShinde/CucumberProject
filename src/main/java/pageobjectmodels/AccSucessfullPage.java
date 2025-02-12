package pageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccSucessfullPage {
	
	WebDriver driver;
	
	public AccSucessfullPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement accCreationMsg;
	
	public boolean accountCreationMsg() {
		
		 return accCreationMsg.isDisplayed();
	}
}
