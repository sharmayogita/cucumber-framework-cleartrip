package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePages {
	public WebDriver idriver;

	public MobilePages(WebDriver driver) {

		idriver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[name()='svg'][@class=' c-pointer c-neutral-900'][1]")
	@CacheLookup
	WebElement selectpopup;

	@FindBy(xpath = "//*[name()='svg'][@class=' c-pointer c-neutral-900']")
	@CacheLookup
	WebElement clickpopup;

	@FindBy(linkText = "Top Offers")
	@CacheLookup
	WebElement clicktopoffers;

	@FindBy(linkText = "Mobile")
	@CacheLookup
	WebElement ClickonMobile;

	@FindBy(xpath = "//*[@id=\"block-system-main\"]/div/div[1]/div[4]")
	@CacheLookup
	WebElement Selectoffer;

	@FindBy(xpath = "//*[@id=\"node-4747\"]/div/div[1]/div/div/table[1]/tbody/tr[2]/td[2]/strong/span/span")
	@CacheLookup
	WebElement CopyCouponCode;

	@FindBy(xpath = "//*[@id=\"node-4747\"]/div/div[1]/div/div/p[7]/a/img")
	@CacheLookup
	WebElement ClickonBooknow;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/header/div/div/div/div/div/div[1]")
	@CacheLookup
	WebElement Cleartriplogo;

	public void SelectPopup() {
		selectpopup.click();

	}

	public void clickPopup() {
		clickpopup.click();
	}

	public void ClickTopoffers() {
		clicktopoffers.click();
	}

	public void clickOnMobile() {
		ClickonMobile.click();
	}

	public void Selectoffer() {
		Selectoffer.click();
	}

	public String getCouponcode() {
		String coupon = CopyCouponCode.getText();
		return coupon;
	}

	public void ClickOnBooknow() {
		ClickonBooknow.click();
	}

	public void logoisDisplayed() {

		Cleartriplogo.isDisplayed();

	}

}
