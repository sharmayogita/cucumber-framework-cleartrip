package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver idriver;

	public LoginPage(WebDriver driver) {
		idriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//*[name()='svg'][@class=' c-pointer c-neutral-900'])[1]")
	@CacheLookup
	WebElement loginpopupclosebtn;
	
	@FindBy(xpath = "//p[contains(text(),'Log in')]")
	@CacheLookup
	WebElement loginbtn;
	
	@FindBy(xpath = "//button[contains(text(),'Log in / Sign up')]")
	@CacheLookup
	WebElement loginsignupbtn;
	
	@FindBy(xpath = "//span[contains(@class,'fs-3 fw-500 ml-2')]")
	@CacheLookup
	WebElement continuewithemailbtn;
	
	@FindBy(xpath = "//body/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement emailtxtbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter password']")
	@CacheLookup
	WebElement passwordtextbox;
	
	@FindBy(xpath = "//body/div[4]/div[1]/div[2]/div[1]/div[2]/div[9]/button[1]")
	@CacheLookup
	WebElement loginsubmitbtn;
	
	
	public void clickOnLoginPopupAvailable() throws InterruptedException {
		try {
			if (loginpopupclosebtn.isDisplayed()) {
				continuewithemailbtn.click();
			}
			else{
				loginbtn.click();
				loginsignupbtn.click();
				continuewithemailbtn.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
	}
	
	public void enterEmail(String email) throws InterruptedException{
		emailtxtbox.sendKeys(email);
		Thread.sleep(1000);
	}
	
	public void enterPassword(String pwd){
		passwordtextbox.sendKeys(pwd);
	}
	
	public void clickLoginSubmit(){
		loginsubmitbtn.click();
	}
}
