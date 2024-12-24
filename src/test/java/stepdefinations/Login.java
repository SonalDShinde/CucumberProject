package stepdefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodels.AccountPage;
import pageobjectmodels.HomePage;
import pageobjectmodels.LoginPage;

public class Login {
	
	WebDriver driver ;
	HomePage homepage;
	LoginPage loginpage;
	AccountPage accountpage;
	
	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() {
		
		driver=DriverFactory.getDriver();
		homepage = new HomePage(driver);
		homepage.clickMyAcc();
		loginpage = homepage.selectLogin();
	}

	@When("User Enter valid email address {string} into email feild")
	public void user_enter_valid_email_address_into_email_feild(String emailText) {
	    //driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(emailTesxt);
		
		loginpage.emailEnter(emailText);
		
	}

	@When("User has enter valid password {string} into password feild")
	public void user_has_enter_valid_password_into_password_feild(String password) {
	    //driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		loginpage.passEnter(password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		accountpage = loginpage.clickButton();
	}

	@Then("User should get successfully log in")
	public void user_should_get_successfully_log_in() {
		
		Assert.assertTrue(loginpage.getWarrningMsg());
		//loginpage.getWarrningMsg();
		//accountpage.mSG();
		//Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
