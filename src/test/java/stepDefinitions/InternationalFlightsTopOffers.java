/*-----Created By Yogita--------*/
package stepDefinitions;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class InternationalFlightsTopOffers extends BaseClass {

	@Given("^User Opens browser$")
	public void user_Opens_browser() throws Throwable {
		BaseClass.launchApp();
		//Thread.sleep(2000);
		if (driver.getPageSource().contains("Sign up / Log in to get the best of Cleartrip")) {
			driver.findElement(By.xpath("//div[contains(@class,'flex flex-middle nmx-1 pb-1')]//*[name()='svg']")).click();
		} else {
			driver.getPageSource().contains("Search flights");
		}
	}


	@When("^User click on Top offers$")
	public void user_click_on_Top_offers() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Top Offers')]")).click();
		Thread.sleep(1000);
		Set<String> windowshandles = driver.getWindowHandles();
		System.out.println(windowshandles);
		List<String> windowHandleList = new ArrayList<String>(windowshandles);
		driver.switchTo().window(windowHandleList.get(1));
		
	}

	@Then("^User click on International Flights$")
	public void user_click_on_International_Flights() throws Throwable {

		driver.findElement(By
				.xpath("//body/div[@id='page']/div[@id='columns']/div[2]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"))
				.click();
		
	}
	
	@Then("^User should see International flights offer page$")
	public void user_should_see_International_flights_offer_page() throws Throwable {
		String pgtitle = driver.findElement(By.className("page-title")).getText();
		if (pgtitle.equalsIgnoreCase("International Flight Offers")) {
			System.out.println("System display International Flight Offers Page");
		}
	}

	@When("^user copy the coupen code$")
	public void user_copy_the_coupen_code() throws Throwable {
	    String coupenCode = driver.findElement(By.xpath("//span[normalize-space()='Use Coupon Code : CTINT']")).getText();
	    System.out.println("International flight coupen code  "+coupenCode);
	}

	@Then("^User Select available Offer$")
	public void user_Select_available_Offer() throws Throwable {
		driver.findElement(By.xpath("//a[@href='/offers/india/intair-ctint'][normalize-space()='Know More']")).click();
	}

	@When("^User click on Book Now option$")
	public void user_click_on_Book_Now_option() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement booknow = driver.findElement(By.xpath("//a[@href='//cleartrip.com/']//img"));
//		WebElement booknow = driver.findElement(By.xpath(
//				"//body/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[1]/section[1]/div[1]/div[2]/article[1]/div[1]/div[1]/div[1]/div[1]/p[7]/a[1]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", booknow);
		booknow.click();
		Thread.sleep(2000);

	}

	@Then("^User see Search Flights Page$")
	public void user_see_Search_Flights_Page() throws Throwable {
		if (driver.getPageSource().toLowerCase().contains("Sign up / Log in to get the best of Cleartrip")) {
			driver.findElement(By.xpath("//div[contains(@class,'flex flex-middle nmx-1 pb-1')]//*[name()='svg']")).click();
		} else {
			driver.getPageSource().toLowerCase().contains("Search flights");
			System.out.println("User displayed Search flights Page");
			
		}
	}
	
	@When("^User search flight from source to destination$")
	public void user_search_flight_from_source_to_destination() throws Throwable {
	    
	}

	@Then("^User booking flight$")
	public void user_booking_flight() throws Throwable {
	    
	}

	@Then("^User enter Coupen code and click continue button$")
	public void user_enter_Coupen_code_and_click_continue_button() throws Throwable {
	   
	}

}
