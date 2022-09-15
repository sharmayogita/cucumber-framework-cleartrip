package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.*;
import pageObjects.InternationalFlightsOfferPage;

public class InternationalFlightsTopOffers {
	private BaseClass baseclass;
	// public static WebDriver driver;
	public static InternationalFlightsOfferPage internationalflightpage;
	public static Properties prop;

	public InternationalFlightsTopOffers(BaseClass baseclass) {
		this.baseclass = baseclass;
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Given("^User Opens browser$")
	public void user_Opens_browser() throws Throwable {
		WebDriver driver = baseclass.getDriver();
		internationalflightpage = new InternationalFlightsOfferPage(driver);
		internationalflightpage.clickOnLoginPopupAvailable();
	}

	@When("^User click on Top offers$")
	public void user_click_on_Top_offers() throws Throwable {
		WebDriver driver = baseclass.getDriver();
		internationalflightpage.clickOntopOffers();
		Thread.sleep(1000);
		Set<String> windowshandles = driver.getWindowHandles();
		System.out.println(windowshandles);
		List<String> windowHandleList = new ArrayList<String>(windowshandles);
		driver.switchTo().window(windowHandleList.get(1));

	}

	@Then("^User click on International Flights$")
	public void user_click_on_International_Flights() throws Throwable {
		internationalflightpage.clickOnInternationalFlightsoffer();
	}

	@Then("^User should see International flights offer page$")
	public void user_should_see_International_flights_offer_page() throws Throwable {
		String pgtitle = internationalflightpage.getInternationalFlightPageTitle();
		if (pgtitle.equalsIgnoreCase(prop.getProperty("internationalFlightsOffers"))) {
			System.out.println(prop.getProperty("internationalFlightSuccessMsg"));
		}
	}

	@When("^user copy the coupen code$")
	public void user_copy_the_coupen_code() throws Throwable {
		String coupenCode = internationalflightpage.getCoupenCode();
		System.out.println(prop.getProperty("internationalFlightCoupenCode") + coupenCode);
	}

	@Then("^User Select available Offer$")
	public void user_Select_available_Offer() throws Throwable {
		internationalflightpage.clickOfferKnowMorebtn();
	}

	@When("^User click on Book Now option$")
	public void user_click_on_Book_Now_option() throws Throwable {
		WebDriver driver = baseclass.getDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement booknow = internationalflightpage.clickBooknowbtn();
		js.executeScript("arguments[0].scrollIntoView(true)", booknow);
		booknow.click();
		Thread.sleep(1000);

	}

	@Then("^User see Search Flights Page$")
	public void user_see_Search_Flights_Page() throws Throwable {
	WebDriver driver = baseclass.getDriver();
		Set<String> windowshandle = driver.getWindowHandles();
		System.out.println(windowshandle);
		List<String> windowHandleList = new ArrayList<String>(windowshandle);
		driver.switchTo().window(windowHandleList.get(2));
		if (driver.getPageSource().contains(prop.getProperty("loginpageTitle"))) {
			internationalflightpage.clickOnLoginPopupAvailable();

		} else {
			driver.getPageSource().contains(prop.getProperty("searchFlightTitle"));
		}
		System.out.println(prop.getProperty("searchFlightSuccessMsg"));

	}

	// @When("^User search flight from source to destination$")
	// public void user_search_flight_from_source_to_destination() throws
	// Throwable {
	// //WebDriver driver = baseclass.getDriver();
	// Thread.sleep(2000);
	// internationalflightpage.clickSourceTxtBox();
	// internationalflightpage.clickDestinationTxtBox();
	// internationalflightpage.clickSelectDate();
	// internationalflightpage.clickSearchFlightBtn();
	//
	// }
	//
	// @Then("^User booking flight$")
	// public void user_booking_flight() throws Throwable {
	// WebDriver driver = baseclass.getDriver();
	// }
	//
	// @Then("^User enter Coupen code and click continue button$")
	// public void user_enter_Coupen_code_and_click_continue_button() throws
	// Throwable {
	// WebDriver driver = baseclass.getDriver();
	// }

}
