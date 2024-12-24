package pageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='input-password']" )
	private WebElement pass;
	
	@FindBy(xpath ="//input[@value='Login']" )
	private WebElement clickButton;
	
	@FindBy(linkText  = "Edit your account information")
	private WebElement sucessfullMsg;
	
	public void emailEnter(String emailText) {
		
		email.sendKeys(emailText);
	}
	
	public void passEnter(String password) {
		pass.sendKeys(password);
		
	}
	
	public AccountPage clickButton() {
		clickButton.click();
		return new AccountPage(driver);
		
	}
	
	public boolean getWarrningMsg() {
		
		return sucessfullMsg.isDisplayed();
	}



}
