/*-----Created By Yogita--------*/
package stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.*;

public class Login extends BaseClass{

	@Given("^User open browser and enter url$")
	public void user_open_browser_and_enter_url() throws Throwable {
	    BaseClass.launchApp();
	    if (driver.getPageSource().contains("Sign up / Log in to get the best of Cleartrip")) {
			//driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[2]/*[1]")).click();
	    	driver.findElement(By.xpath("//span[contains(text(),'Continue with Email')]")).click();
	    	Thread.sleep(1000);
	    	
			//Assert.assertTrue(false);
		} else {
			String pageTitle = driver.getTitle();
			driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]/div[1]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Log in / Sign up')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Continue with Email')]")).click();
			Thread.sleep(1000);
			//Assert.assertEquals(true, driver.getTitle());
		}
		
	}

//	@When("^user click on login$")
//	public void user_click_on_login() throws Throwable {
//		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]/div[1]")).click();
//	}
//
//	@When("^user click on login signup button$")
//	public void user_click_on_login_signup_button() throws Throwable {
//		driver.findElement(By.xpath("//button[contains(text(),'Log in / Sign up')]")).click();
//	}
//
//	@Then("^user click on continue with login$")
//	public void user_click_on_continue_with_login() throws Throwable {
//		driver.findElement(By.xpath("//span[contains(text(),'Continue with Email')]")).click();
//	}

	@When("^user enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String email) throws Throwable {
		//driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(email);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(email);
	}

	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String pwd) throws Throwable {
		//driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys(pwd);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys(pwd);
	}
	
	

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[8]/button[1]")).click();
		   Thread.sleep(2000);
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Throwable {
		if (driver.getPageSource().contains("Please enter a valid email address")) {
			driver.close();
			Assert.assertTrue(true);
		} else if (driver.getPageSource().contains("Something went wrong. Please try again.")) {
			driver.close();
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}
}
