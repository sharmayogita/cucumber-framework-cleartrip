package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsTopOffersPage {
	
	String coupon;
	
	@FindBy(linkText="Hotels")
	WebElement option_hotel;
	
	@FindBy(className="page-title")
	WebElement pg_title;
	
	@FindBy(xpath="//a[@href = '/offers/india/treebo/offers/cleartrip']")
	WebElement hotel_offer;
	
	@FindBy(xpath="//div/div[1]/div/div/table/tbody/tr[1]/td[4]/a")
	WebElement book_now;
	
	@FindBy(xpath="//div[4]/div[2]/div/div[2]/div[2]/button")
	WebElement select_room;
	
	@FindBy(xpath="//div[5]/div[4]/button")
	WebElement book;	
	
	
	
	
	
	public void clickOnHotel(){
		
		option_hotel.click();
	}
	
	
	
	public String hotelOfferDisplayed() {
		
		String heading = pg_title.getText();
		
		return heading;
	}
	
	
	
	
	public void selectOffer() {
		
		
	    hotel_offer.click();
	}
	
	
		
	
	public void clickBookNow() {
		
		book_now.click();
	}
	
	
	
	
	public void clickSelectRoom() {
		
		select_room.click();
	}
	
	
	
	
	public void clickOnBook() {
		
		book.click();
	}
	
	

}
