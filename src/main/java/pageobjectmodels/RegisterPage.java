package pageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='input-firstname']" )
	private WebElement fname;
	

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lname;
	

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;
	

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement pwd;
	

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement cpwd;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement privacyPolicy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement contn;
	
	
	public void firstName(String fnametext) {
		
		fname.sendKeys(fnametext);
	}
	
	public void lastName(String lnametext) {
		
		lname.sendKeys(lnametext);
	}

	public void email(String mail) {
	
	email.sendKeys(mail);
	}

	public void telephone(String PhoneNo) {
	
	telephone.sendKeys(PhoneNo);
	}

	public void pass(String paswd) {
	
	pwd.sendKeys(paswd);
	}

	public void cpass(String cpaswd) {
	
	cpwd.sendKeys(cpaswd);
	}
	
	public void privacySelect() {
		privacyPolicy.click();
	}
	
	public AccSucessfullPage contBtn() {
		contn.click();
		return new AccSucessfullPage(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
