package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class Login {
	//private  BaseClass baseclass;
	public static WebDriver driver;
	public static LoginPage lp;

	@Given("^User open browser and enter url$")
	public void user_open_browser_and_enter_url() throws Throwable {
		
		//WebDriver driver= baseclass.getDriver();
		//lp = new LoginPage(driver);
		driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		lp = new LoginPage(driver);
		lp.clickOnLoginPopupAvailable();
		Thread.sleep(2000);

	}

	@When("^user enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String email) throws Throwable {
		// driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(email);
		// driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(email);
		lp.enterEmail(email);
	}

	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String pwd) throws Throwable {
		// driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys(pwd);
		// driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys(pwd);
		lp.enterPassword(pwd);
	}

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
//		driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[8]/button[1]")).click();
//		Thread.sleep(2000);
		lp.clickLoginSubmit();
	}

//	@Then("^page title should be \"([^\"]*)\"$")
//	public void page_title_should_be(String title) throws Throwable {
//		if (driver.getPageSource().contains("Please enter a valid email address")) {
//			driver.close();
//			Assert.assertTrue(true);
//		} else if (driver.getPageSource().contains("Something went wrong. Please try again.")) {
//			driver.close();
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertEquals(title, driver.getTitle());
//		}
//	}
}
