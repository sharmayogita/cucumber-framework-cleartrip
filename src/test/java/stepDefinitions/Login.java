package stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.api.java.en.*;


public class Login extends BaseClass {
	
	
	@Given("^User launch browser and open url$")
	public void user_launch_browser_and_open_url() throws Throwable {
	    BaseClass.launchApp();
	    Thread.sleep(2000);
	   
	}

	@When("^user click on LoginIn button$")
	public void user_click_on_LoginIn_button() throws Throwable {
		
	}

	@And("^click login/signin button$")
	public void click_login_signin_button() throws Throwable {

	}

	@And("^click continue with login button$")
	public void click_continue_with_login_button() throws Throwable {
		
		
	   
	}

	@Then("^Enter email addresss as \"([^\"]*)\"$")
	public void enter_email_addresss_as(String email) throws Throwable {
		
	   
	}

	@And("^Enter password as \"([^\"]*)\"$")
	public void enter_password_as(String pwd) throws Throwable {
		
	}

	@And("^click Login$")
	public void click_Login() throws Throwable {
		
	   
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Throwable {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//
//	@Given("^User launch browser and open url$")
//	public void user_launch_browser_and_open_url() throws Throwable {
//		BaseClass.launchApp();
//	
//	}
//
//	@When("^user click on LoginIn button$")
//	public void user_click_on_LoginIn_button() throws Throwable {
//		lp.clickLoginBtn();
//		Thread.sleep(2000);
//	}
//
//	@Then("^click login/signin button$")
//	public void click_login_signin_button() throws Throwable {
//		lp.clickLoginSignupBtn();
//		Thread.sleep(1000);
//	}
//
//	@When("^click continue with login button$")
//	public void click_continue_with_login_button() throws Throwable {
//		lp.clickContWithLogin();
//		Thread.sleep(1000);
//	}
//
//	@Then("^Enter email addresss as \"([^\"]*)\"$")
//	public void enter_email_addresss_as(String email) throws Throwable {
//		lp.setUserName(email);
//	}
//
//	@Then("^Enter password as \"([^\"]*)\"$")
//	public void enter_password_as(String pwd) throws Throwable {
//		lp.setPassword(pwd);
//	}
//
//	@Then("^click Login$")
//	public void click_Login() throws Throwable {
//		lp.clickLogin();
//		Thread.sleep(1000);
//	}
//
//	@Then("^page title should be \"([^\"]*)\"$")
//	public void page_title_should_be(String title) throws Throwable {
//		if (driver.getPageSource().contains("Please enter a valid email address")) {
//			driver.close();
//			Assert.assertTrue(false);
//		} else if (driver.getPageSource().contains("Something went wrong. Please try again.")) {
//			driver.close();
//			Assert.assertTrue(false);
//		} else {
//			Assert.assertEquals(title, driver.getTitle());
//		}
//}

}
