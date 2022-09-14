package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.WebEleRepo;

public class stepLibrary {
	WebDriver driver;
	WebEleRepo repo;

	@Given("^user navigates clearTrip url$")
	public void user_navigates_clearTrip_url() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

	@When("^user click on Flights and user click on roundTrip radio button$")
	public void user_click_on_Flights_and_user_click_on_roundTrip_radio_button() throws Throwable {

		repo = new WebEleRepo(driver);
		repo.rButton();
		Thread.sleep(2000);

	}

	@When("^user click on From dropdown$")
	public void user_click_on_From_dropdown() throws Throwable {

		repo.FDrp();

	}

	@When("^user click on To drp$")
	public void user_click_on_To_drp() throws Throwable {
		repo.TDrp();

	}

	@When("^user click on Depart on  and Retrun on$")
	public void user_click_on_Depart_on_and_Retrun_on() throws Throwable {

		repo.Dpon();

	}

	@When("^user click on adults , childrens , infants$")
	public void user_click_on_adults_childrens_infants() throws Throwable {
		repo.adchin();
	}

	@Then("^user click on search Filghts$")
	public void user_click_on_search_Filghts() throws Throwable {

		repo.Sflights();

	}

	@When("^user click on stops filter$")
	public void user_click_on_stops_filter() throws Throwable {

		repo.StpF();

	}

	@When("^user click on Depature time from HYD$")
	public void user_click_on_Depature_time_from_HYD() throws Throwable {

		repo.DepartFHyd();

	}

	@When("^user click on Depature time from BLR$")
	public void user_click_on_Depature_time_from_BLR() throws Throwable {

		repo.DepartFBlr();

	}

	@Then("^user select flights$")
	public void user_select_flights() throws Throwable {

		repo.SeFlight();

	}

	@Then("^user click on BookNow$")
	public void user_click_on_BookNow() throws Throwable {

		repo.bookNow();

	}

	@When("^user click on Flights and click on onewayTrip button$")
	public void user_click_on_Flights_and_click_on_onewayTrip_button() throws Throwable {

		repo = new WebEleRepo(driver);

		repo.rButton2();
		Thread.sleep(2000);
	}

	@When("^user click on Depart on$")
	public void user_click_on_Depart_on() throws Throwable {
		repo.departon2();

	}

	@When("^user click on Depature time$")
	public void user_click_on_Depature_time() throws Throwable {
		repo.departon2();
		
	}

	@When("^user click on Book$")
	public void user_click_on_Book() throws Throwable {
		repo.booking2(); 
	}

}
