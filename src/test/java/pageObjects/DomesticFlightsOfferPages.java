package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DomesticFlightsOfferPages {
	
	//constractor
	public WebDriver driver;
	
	public DomesticFlightsOfferPages(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//elements:
	@FindBy(xpath = "//*[name()='svg'][@class=' c-pointer c-neutral-900'][1]")
	WebElement selectpopup;

	@FindBy(xpath = "//*[name()='svg'][@class=' c-pointer c-neutral-900']")
	WebElement clickpopup;

	@FindBy(xpath = "//div[text()='Top Offers']")
	WebElement clicktopoffers;

	@FindBy(xpath = "//*[@id=\"IconNavList\"]/li[1]/a")
	WebElement clickondomesticflights;

	@FindBy(xpath = "//a[@href='/offers/india/domair-ctdom']//img[@class='image-style-deal-image']")
	//@FindBy(xpath="//body/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/span[1]/a[1]")
	WebElement  clickknowmoreoption;

	//@FindBy(xpath = "//div/div[1]/div/div/table[1]/tbody")
	@FindBy(xpath="//td[@class='rtecenter']//span//span//span[contains(text(),'CTDOM')]")
	WebElement copycouponcode;

	//@FindBy(xpath = "//*[@id=\"node-4747\"]/div/div[1]/div/div/p[7]/a/img")
	@FindBy(xpath="//a[@href='//cleartrip.com/']//img")
	WebElement ClickonBookknow;

		
	//actions:
	 public void SelectPopup(){
	 selectpopup.click();
	 }
	 
	 public void clickPopup() {
	 clickpopup.click();
	 }
	 
	 public void ClickTopoffers() {
	 clicktopoffers.click();
	 }
	 
	 public void clickondomesticflights() {
	 clickondomesticflights.click();
	 }
	 
	 public void clickknowmoreoption() {
	 clickknowmoreoption.click();
	 }
	 public String copycouponcode() {
	 String coupencode = copycouponcode.getText();
	 return coupencode;
	 }
	 public void ClickonBookknow() {
	 ClickonBookknow.click();
	 }
	


}

	
      


