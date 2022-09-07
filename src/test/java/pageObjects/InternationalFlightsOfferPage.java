package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternationalFlightsOfferPage {
 public WebDriver idriver;
 
 public InternationalFlightsOfferPage(WebDriver driver){
	 idriver = driver;
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath="//*[name()='path' and contains(@d,'M18 6L12 1')]")
 @CacheLookup
 WebElement loginpopupclosebtn;
  
 @FindBy(xpath="//div[contains(text(),'Top Offers')]")
 @CacheLookup
 WebElement topoffersbtn;
 
 @FindBy(xpath="//body/div[@id='page']/div[@id='columns']/div[2]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
 @CacheLookup
 WebElement internationalflightsbtn;
 
 @FindBy(className="page-title")
 @CacheLookup
 WebElement internationalflightofferpagetitle;
 
 @FindBy(xpath="//span[normalize-space()='Use Coupon Code : CTINT']")
 @CacheLookup
 WebElement coupencode;
 
 @FindBy(xpath="//a[@href='/offers/india/intair-ctint'][normalize-space()='Know More']")
 @CacheLookup
 WebElement avalbleofferknowmorebtn;
 
 @FindBy(xpath="//a[@href='//cleartrip.com/']//img")
 @CacheLookup
 WebElement offerbooknowbtn;
 
 @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
 @CacheLookup
 WebElement searchflightfrom;
 
 @FindBy(xpath="//div[@class='col-13 homeba h-fc']//li[2]//p[1]")
 @CacheLookup
 WebElement searchflightfromdropdown;

 @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
 @CacheLookup
 WebElement searchflightto;
 
 @FindBy(xpath="//div[@class='col-13 homeba h-fc']//li[1]")
 @CacheLookup
 WebElement searchflighttodropdown;
 
 @FindBy(xpath="//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']//*[name()='svg']")
 @CacheLookup
 WebElement departondateinputbox;
 
 @FindBy(xpath="//div[@aria-label='Tue Oct 11 2022']//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top'][normalize-space()='11']")
 @CacheLookup
 WebElement picdatefromcalender;
 
 @FindBy(xpath="//button[@class='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
 @CacheLookup
 WebElement searchflightbtn;
 
 public void clickOnLoginPopupAvailable(){
	 loginpopupclosebtn.click();
 }
 
 public void clickOntopOffers(){
	 topoffersbtn.click();
 }

 public void clickOnInternationalFlightsoffer(){
	 internationalflightsbtn.click();
 }
 
 public String getInternationalFlightPageTitle(){
	String title = internationalflightofferpagetitle.getText();
	return title;
 }
 
 public String getCoupenCode(){
	 String coupenCode = coupencode.getText();
	 return coupenCode;
 }
 
 public void clickOfferKnowMorebtn(){
	 avalbleofferknowmorebtn.click();
 }
 
 public WebElement clickBooknowbtn(){
	 WebElement booknow = offerbooknowbtn;
	 booknow.click();
	 return booknow;
 }
 
 public void clickSourceTxtBox(){
	 searchflightfrom.click();
	 searchflightfromdropdown.sendKeys("london");
 }
 
 public void clickDestinationTxtBox(){
	 searchflightto.click();
	 searchflighttodropdown.sendKeys("paris");
 }
 
 public void clickSelectDate(){
	 departondateinputbox.click();
	 picdatefromcalender.click();
 }
 
 public void clickSearchFlightBtn(){
	 searchflightbtn.click();
 }
}
