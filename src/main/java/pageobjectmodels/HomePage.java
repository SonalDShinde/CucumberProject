package pageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement MyAcc;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	private WebElement loginOption;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement regs;
	
	public void clickMyAcc() {
		
		MyAcc.click();
	}
	
	public LoginPage selectLogin() {
		
		loginOption.click();
		return new LoginPage(driver);
		
	}
	
	public RegisterPage registerAcc() {
		regs.click();
		return new RegisterPage(driver);
	}

}
