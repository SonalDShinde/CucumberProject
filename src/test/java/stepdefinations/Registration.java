package stepdefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodels.AccSucessfullPage;
import pageobjectmodels.HomePage;
import pageobjectmodels.RegisterPage;

public class Registration {
	
	WebDriver driver;
	private HomePage hp;
	private RegisterPage registerpage;
	private AccSucessfullPage accsuccespage;
	
	@Given("User navigate to register account page")
	public void user_navigate_to_register_account_page() {
		driver = DriverFactory.getDriver();
		hp=new HomePage(driver);
		hp.clickMyAcc();
		registerpage = hp.registerAcc();
				
	}

	@When("User enters the below details feild")
	public void user_enters_the_below_details_feild(DataTable dataTable) {
		
	    Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
	    registerpage.firstName(dataMap.get("FirstName"));
	    registerpage.lastName(dataMap.get("LastName"));
	    registerpage.email(dataMap.get("email"));
	    registerpage.telephone(dataMap.get("telephone"));
	    registerpage.pass(dataMap.get("password"));
	    registerpage.cpass(dataMap.get("password"));
	}

	@When("User select privacy policy")
	public void user_select_privacy_policy() {
	    //driver.findElement(By.xpath("//input[@name='agree']")).click();
		registerpage.privacySelect();
	
	}

	@When("User clicks on continou button")
	public void user_clicks_on_continou_button() {
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		accsuccespage = registerpage.contBtn();
	}

	@Then("User account gets created succesfully")
	public void user_account_gets_created_succesfully() {
//		 String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
//		 Assert.assertEquals(text, true);
		 
		// Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/h1")).isDisplayed());
		//accsuccespage = new AccSucessfullPage(driver);
//		asp.accountCreationMsg();
	
		Assert.assertTrue(accsuccespage.accountCreationMsg());
		
	}


}
