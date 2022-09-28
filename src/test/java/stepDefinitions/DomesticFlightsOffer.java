package stepDefinitions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.DomesticFlightsOfferPages;

public class DomesticFlightsOffer {

	public static WebDriver driver;
	public String coupon;
	public static DomesticFlightsOfferPages df;
	

	@Given("^i open browser$")
	public void i_open_browser() throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.get("https://www.cleartrip.com");

	}

	@When("^i click popup$")
	public void i_click_popup() throws Throwable {
		df = new DomesticFlightsOfferPages(driver);
		try {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[name()='svg'][@class=' c-pointer c-neutral-900'][1]")));
			df.clickPopup();
			System.out.println("closing the popup");
		} catch (Exception e) {

			Thread.sleep(1000);
		}
	}

	@When("^i go to top offers$")
	public void i_go_to_top_offers() throws Throwable {
		
		df.ClickTopoffers();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Object[] allwindows = windows.toArray();
		String window1 = allwindows[0].toString();
		String window2 = allwindows[1].toString();

		driver.switchTo().window(window2);
		Thread.sleep(3000);
	}

	@When("^i click domestic flights$")
	public void i_click_domestic_flights() throws Throwable {
		
		df.clickondomesticflights();
		Thread.sleep(1000);
	}

	@When("^i click know more option$")
	public void i_click_know_more_option() throws Throwable {
		
		df.clickknowmoreoption();

		Thread.sleep(1000);

	}

	@When("^i copy  coupon code$")
	public void i_copy_coupon_code() throws Throwable {
		
		String coupencode = df.copycouponcode();
		System.out.println(coupencode);

	}

	@Then("^i click book now$")
	public void i_click_book_now_() throws Throwable {
		df.ClickonBookknow();
		System.out.println("system displayed search flights");
	}

}
