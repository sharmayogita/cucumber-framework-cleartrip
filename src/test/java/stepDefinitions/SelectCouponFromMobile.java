package stepDefinitions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import pageObjects.MobilePages;

public class SelectCouponFromMobile {
	public static WebDriver driver;
	public String code;
	public static MobilePages mp;
	//MobilePages mp = PageFactory.initElements(driver, MobilePages.class);

	@Given("I open browser with the url")
	public void I_open_browser_with_the_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");

	}

	@When("I click popup")
	public void i_click_popup() throws InterruptedException {
		 mp = new MobilePages(driver);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(mp.SelectPopup());

			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
					By.xpath("//*[name()='svg'][@class=' c-pointer c-neutral-900'][1]")));
			mp.clickPopup();
			// driver.findElement(By.xpath("//*[name()='svg'][@class=' c-pointer
			// c-neutral-900']")).click();

		} catch (Exception e) {

			Thread.sleep(1000);
		}
	}

	@And("I click on Topoffers")
	public void i_click_on_topoffers() throws InterruptedException {
		//MobilePages mp = PageFactory.initElements(driver, MobilePages.class);
		Thread.sleep(3000);
		mp.ClickTopoffers();
	}

	@And("I click on Mobile")
	public void i_click_on_mobile() throws InterruptedException {
		//MobilePages mp = PageFactory.initElements(driver, MobilePages.class);
		Set<String> windows = driver.getWindowHandles();
		Object[] allwindows = windows.toArray();
		String window2 = allwindows[1].toString();
		driver.switchTo().window(window2);
		Thread.sleep(3000);
		mp.clickOnMobile();

	}

	@And("I Select a offer")
	public void i_select_a_offer() throws InterruptedException {
	//	MobilePages mp = PageFactory.initElements(driver, MobilePages.class);
		Thread.sleep(2000);
		mp.Selectoffer();

	}

	@When("I Copy the coupon code")
	public void i_copy_the_coupon_code() throws InterruptedException {
		//MobilePages mp = PageFactory.initElements(driver, MobilePages.class);

		String coupon = mp.getCouponcode();
		Thread.sleep(2000);
		System.out.println(coupon);
	}

	@When("I click on Book now")
	public void i_click_on_book_now() throws InterruptedException {
		//MobilePages mp = PageFactory.initElements(driver, MobilePages.class);
		Thread.sleep(3000);
		mp.ClickOnBooknow();

	}

	@Then("I should see Search flights")
	public void i_should_see_search_flights() {
		//MobilePages mp = PageFactory.initElements(driver, MobilePages.class);

		mp.logoisDisplayed();

	}

}
