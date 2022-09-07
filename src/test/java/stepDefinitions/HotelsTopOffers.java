/*-----Created By Amar--------*/
package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelsTopOffers extends BaseClass{
	
	public String coupen;

	@Given("^I open browser$")
	public void i_open_browser() {

		BaseClass.launchApp();
		//driver.navigate().to(prop.getProperty("hoteltopoffersurl"));
		if (driver.getPageSource().contains("Sign up / Log in to get the best of Cleartrip")) {
			driver.findElement(By.xpath("//div[contains(@class,'flex flex-middle nmx-1 pb-1')]//*[name()='svg']")).click();
		} else {
			driver.getPageSource().contains("Search flights");
		}

	}
	
	@When("^I click on Top offers$")
	public void i_click_on_Top_offers() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Top Offers')]")).click();
		Thread.sleep(1000);
		Set<String> windowshandles = driver.getWindowHandles();
		System.out.println(windowshandles);
		List<String> windowHandleList = new ArrayList<String>(windowshandles);
		driver.switchTo().window(windowHandleList.get(1));
		//Thread.sleep(2000);
	}

	@Then("^I click on Hotels$")
	public void i_click_on_Hotels() {

		driver.findElement(By.linkText("Hotels")).click();
	}

	@Then("^I should see hotel offer page$")
	public void i_should_see_hotel_offer_page() {

		String pgtitle = driver.findElement(By.className("page-title")).getText();
		if (pgtitle.equalsIgnoreCase("Hotel Offers")) {
			System.out.println("System display Hotel Offers page");
		}

	}

	@When("^I click any offer$")
	public void i_click_any_offer() {

		driver.findElement(By.xpath("//a[@href = '/offers/india/treebo/offers/cleartrip']")).click();

	}

	@Then("^I should see particular offer page$")
	public void i_should_see_particular_offer_page() {

		if (driver.getTitle().contains("Treebo Hotels")) {
			System.out.println("System display particular offer page");

		}

	}

	@When("^I copy the coupen code$")
	public void i_copy_the_coupen_code() {

		WebElement table = driver.findElement(By.xpath("//div/div[1]/div/div/table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		List<WebElement> col = row.get(1).findElements(By.tagName("td"));
		coupen = col.get(2).getText();
		System.out.println(coupen);

	}

	@When("^I click on the book now$")
	public void i_click_on_the_book_now() throws InterruptedException {

		driver.findElement(By.xpath("//div/div[1]/div/div/table/tbody/tr[1]/td[4]/a")).click();
		Thread.sleep(3000);

	}

	@Then("^I should see search for hotels page$")
	public void i_should_see_search_for_hotels_page() {

		if (driver.getTitle().toLowerCase().contains("cleartrip")) {
			System.out.println("System display search hotel page");
		}

	}

	@When("^I click particular hotel$")
	public void i_click_particular_hotel() throws InterruptedException {

		List<WebElement> hotels = driver.findElements(By.tagName("h2"));
		System.out.println(hotels.size());
		hotels.get(1).click();
		Thread.sleep(3000);
	}

	@Then("^I should see particular hotel booking page$")
	public void i_should_see_particular_hotel_booking_page() {

		if (driver.getCurrentUrl().toLowerCase().contains("emora")) {
			System.out.println("System display particular hotel booking page");
		}

	}

	@When("^I click select room$")
	public void i_click_select_room() throws InterruptedException {

		driver.findElement(By.xpath("//div[4]/div[2]/div/div[2]/div[2]/button")).click();
		Thread.sleep(3000);

	}

	@When("^i click book$")
	public void i_click_book() {

		driver.findElement(By.xpath("//div[5]/div[4]/button")).click();

	}

	@Then("^I should see contine to booking page$")
	public void i_should_see_contine_to_booking_page() {

	}
}
