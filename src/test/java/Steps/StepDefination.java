package Steps;

import java.util.concurrent.TimeUnit;

import Resources.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class StepDefination extends base{
	
	
	
	@Given("^Initilize the driver with chrome$")
	public void initilize_the_driver_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = initilizeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get(prop.getProperty("url"));
	}

	@Given("^Click on the login link to go to the sign in page$")
	public void click_on_the_login_link_to_go_to_the_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l = new LandingPage(driver);
		//System.out.println(l.getTitle().getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		l.noThanks().click();
		l.getLogin().click();
	}

	@When("^User enters in his (.+) and (.+) and clicks login$")
	public void user_enters_in_his_and_and_clicks_login(String email, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   LoginPage lp = new LoginPage(driver);
	   lp.getLogin().sendKeys(email);
	   lp.getpass().sendKeys(pass);
	   lp.button().click();
	}

	@Then("^Verify that Login was successful$")
	public void verify_that_Login_was_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.getCurrentUrl());
	}
	
	@And("^Close Browsers$")
    public void close_browsers() throws Throwable {
        driver.quit();
    }

}
