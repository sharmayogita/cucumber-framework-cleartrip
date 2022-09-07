package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.PageObjectClass;

public class ClearTripLibrary extends BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	static PageObjectClass pom;

	@Given("^I open the browser with the url$")
	public void i_open_the_browser_with_the_url() throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.cleartrip.com/hotels");
		Thread.sleep(3000);

	}

	@When("^I close the pop up window$")
	public void i_close_the_pop_up_window() throws Throwable {

		pom = new PageObjectClass(driver);
		pom.Popup();

	}

	@Then("^I should see search bar$")
	public void i_should_see_search_bar() throws Throwable {

		pom.VerifyPage();

	}

	@When("^I click on hotels$")
	public void i_click_on_hotels() throws Throwable {

		pom.Hotels();
	}

	@When("^i enter destination in where to$")
	public void i_enter_destination_in_where_to() throws Throwable {

		pom.WhereTo();
	}

	@When("^i click on checkin and check-out to select the date$")
	public void i_click_on_checkin_and_check_out_to_select_the_date() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		pom.SelectDate();
	}

	@When("^i select the noof travellers$")
	public void i_select_the_noof_travellers() throws Throwable {

		pom.AddTravellers();
	}

	@When("^i click on search hotels$")
	public void i_click_on_search_hotels() throws Throwable {
		pom.SearchHotels();

	}

	@When("^i should see the next page andcomback to main page$")
	public void i_should_see_the_next_page_andcomback_to_main_page() throws Throwable {

		driver.navigate().back();
		Thread.sleep(5000);

	}

	@When("^i click on view all to see the allthe contents in page$")
	public void i_click_on_view_all_to_see_the_allthe_contents_in_page() throws Throwable {

		pom.ViewAll();

	}

	@When("^i close the child window to see main windowforother operations$")
	public void i_close_the_child_window_to_see_main_windowforother_operations() throws Throwable {

		System.out.println(driver.getTitle());
		System.out.println("driver is parent window");
		ArrayList<String> s = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(s.get(1));

		String expect = "india";
		String actual = driver.getCurrentUrl();

		if (actual.contains(expect)) {
			System.out.println("url:" + expect + " " + actual);
		} else {
			System.out.println("not title");
		}
		driver.close();

	}

	@When("^i get thr driver peration from child window to parent$")
	public void i_get_thr_driver_peration_from_child_window_to_parent() throws Throwable {

		ArrayList<String> s = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(s.get(0));

	}

	@When("^i click on all clear trip deals to check working or not$")
	public void i_click_on_all_clear_trip_deals_to_check_working_or_not() throws Throwable {

		pom.TripDeals();

	}

	@Then("^I verify modify search options$")
	public void i_verify_modify_search_options() throws Throwable {
		System.out.println();
		pom.modifySearchOptions();
		System.out.println();
	}

	@Then("^I verify number of filters options$")
	public void i_verify_number_of_filters_options() throws Throwable {
		pom.filterOptions();
		System.out.println();
	}

	@Then("^I verify number of options for priority$")
	public void i_verify_number_of_options_for_priority() throws Throwable {
		pom.priyority();
		System.out.println();
	}

	@Then("^I verify total price options$")
	public void i_verify_total_price_options() throws Throwable {
		pom.priceOptions();
		System.out.println();
	}

	@Then("^I verify Hotel class options$")
	public void i_verify_Hotel_class_options() throws Throwable {
		pom.hotelClassoptions();
		System.out.println();
	}

	@Then("^I verify Special offers options$")
	public void i_verify_Special_offers_options() throws Throwable {
		pom.specialOffer();
		System.out.println();
	}

	@Then("^I verify TripAdviser rating options$")
	public void i_verify_TripAdviser_rating_options() throws Throwable {
		pom.tripAdvisorOptions();
		System.out.println();
	}

	@Then("^I verify Amenties options$")
	public void i_verify_Amenties_options() throws Throwable {
		pom.amenitiesOptions();
		System.out.println();
	}

	@Then("^I verify Property type options$")
	public void i_verify_Property_type_options() throws Throwable {
		pom.propertyTypeOptions();
	}

	@When("I validate modify search")
	public void i_validate_modify_search() {
		System.out.println("Enter modifiy Search Successfully");
	}
	@When("I validate filter by hotels")
	public void i_validate_filter_by_hotels() {
		System.out.println("Enter Filter hotel Successfully");
	}
	
	
	@When("I validate number of options for priority")
	public void i_validate_number_of_options_for_priority() throws Throwable {
		pom.PriorityFilterValidation();
		
		System.out.println("Priority Filter validation successfully");
	    
	}
	
	@When("I validate total price")
	public void i_validate_total_price() throws Throwable {
		pom.TotalPriceValidation();
		
		System.out.println();
	    
	}
	@When("I validate Hotel class")
	public void i_validate_hotel_class() throws Throwable {
		pom.HotelClassValidation();
	   
	}
	@When("I validate Special offers")
	public void i_validate_special_offers() throws Throwable {
	    pom.SpecialOffersValidation();
	}
	@When("I validate TripAdviser rating")
	public void i_validate_trip_adviser_rating() throws Throwable {
		pom.TripAdvisorValidation();
	    
	}
	@When("I validate Amenties")
	public void i_validate_amenties() throws Throwable {
		pom.AmenitiesValiation();

	   
	}
	@When("I validate Property type")
	public void i_validate_property_type() throws Throwable {
		pom.ProperyTypesValidation();

	    
	}

	@When("^User click View Details button$")
	public void user_click_View_Details_button() throws Throwable {

		pom.view();

	}

	@When("^User Select room$")
	public void user_Select_room() throws Throwable {

		pom.select();

	}

	@When("^User verify Traveller reviews$")
	public void user_verify_Traveller_reviews() throws Throwable {

		pom.travellers();

	}

	@When("^Verify Hotel amenities$")
	public void verify_Hotel_amenities() throws Throwable {

		pom.amenitiesAndinfo();

	}

	@When("^User Click Map view$")
	public void user_Click_Map_view() throws Throwable {

		pom.mapview();

	}

	@When("^User click book button$")
	public void user_click_book_button() throws Throwable {

		pom.room();

	}

	@When("^Click View all button and verify title$")
	public void click_View_all_button_and_verify_title() throws Throwable {

		pom.VerifyTitile();

	}

	@When("^User click continue$")
	public void user_click_continue() throws Throwable {

		pom.Continue1();

	}

	@When("^Add contact details$")
	public void add_contact_details() throws Throwable {

		pom.ContDetails();

	}

	@When("^click continue$")
	public void click_continue() throws Throwable {

		pom.Continue2();
	}

	@When("^user Add travellers details$")
	public void user_Add_travellers_details() throws Throwable {

		pom.AddTraveller();
	}

	@When("^click continueto payment$")
	public void click_continueto_payment() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		pom.Continue3();
		System.out.println("Payment page open");

	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		Thread.sleep(5000);
		System.out.println("I close browser");
		driver.quit();

	}

}
