package Stepdefenition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefenition {
	WebDriver driver;
	String title;
	
	@Given("^Login application should be available$")
	public void login_application_should_be_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=new FirefoxDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^validate login application$")
	public void validate_login_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		title=driver.getTitle();
		System.out.println(title);
	}

	@Then("^login should be successfull$")
	public void login_should_be_successfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("OrangeHRM",title);
		System.out.println("uma");
		
	}

}
