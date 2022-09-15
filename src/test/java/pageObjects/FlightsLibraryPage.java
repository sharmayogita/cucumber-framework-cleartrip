package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsLibraryPage {

	private static final By By = null;

	@FindBy(xpath = "(//div[contains(@class,'ml-2 mr-2')])[1]")
	WebElement Flights;

	@FindBy(xpath = "(//*[name()='svg'][@class=' c-pointer c-neutral-900'])[1]")
	WebElement alert;

	@FindBy(xpath = "(//span[contains(@class,'radio__circle bs-border')])[2]")
	WebElement radioButton;

	@FindBy(xpath = "(//span[contains(@class,'radio__circle bs-border')])[1]")
	WebElement radioButton2;

	@FindBy(xpath = "(//div[@class='p-relative']//input)[1]")
	static WebElement FrmDrp;

	@FindBy(xpath = "(//li[contains(@class,'ls-reset br-4')]//p)")
	static List<WebElement> FrmDrpList;

	@FindBy(xpath = "(//input[contains(@class,'field bw-1')])[2]")
	WebElement ToDrp;

	@FindBy(xpath = "(//li[contains(@class,'ls-reset br-4')]//p)")
	static List<WebElement> ToDrpList;

	@FindBy(xpath = "(//*[name()='path'][@stroke='#FFF'])[1]")
	WebElement DepOn;

	@FindBy(xpath = "(//div[text()='10'])[1]")
	WebElement frmDate;

	@FindBy(xpath = "(//div[text()='15'])[1]")
	WebElement ToDate;

	@FindBy(xpath = "(//select[contains(@class,'default-select bc-neutral-100')])[1]")
	WebElement adlt;

	@FindBy(xpath = "(//select[contains(@class,'default-select bc-neutral-100')])[2]")
	WebElement chidrn;

	@FindBy(xpath = "(//select[contains(@class,'default-select bc-neutral-100')])[3]")
	WebElement infan;

	@FindBy(xpath = "//button[text()='Search flights']")
	WebElement SechFligt;

	@FindBy(xpath = "(//input[@class='checkbox__input o-0']/following-sibling::span)[1]")
	WebElement Stp;

	@FindBy(xpath = "(//input[@class='checkbox__input o-0']/following-sibling::span)[3]")
	WebElement DFrmHyd;

	@FindBy(xpath = "(//span)[18]")
	WebElement DfrmBlr;

	@FindBy(xpath = "(//div[contains(@class,'rt-tuple-new-container__details ms-grid-row-2')])[1]")
	WebElement FrmFligt;

	@FindBy(xpath = "(//div[contains(@class,'rt-tuple-new-container__details ms-grid-row-2')])[3]")
	WebElement ReFligt;

	@FindBy(xpath = "//span[text()='Book now']")
	WebElement Bnow;

	@FindBy(xpath = "(//button[contains(@class,'flex flex-middle')])[3]")
	WebElement Deon2;

	@FindBy(xpath = "(//div[text()='15'])[1]")
	WebElement date2;

	@FindBy(xpath = "(//span[contains(@class,'checkbox__mark bs-border')])[3]")
	WebElement dtime2;

	@FindBy(xpath = "(//button[contains(@class,'h-10 flex-1')])[1]")
	WebElement book2;

	WebDriver driver;

	public FlightsLibraryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void rButton() throws Throwable {

		try {
			if (alert.isDisplayed()) {
				alert.click();

			}

		} catch (Exception e) {

			System.out.println("Not Showing Alert Window");
		}
		Flights.click();
		Thread.sleep(3000);
		radioButton.click();
	}

	public static void FDrp() throws Throwable {
		FrmDrp.click();
		Thread.sleep(3000);

		System.out.println(FrmDrpList.size());

		for (WebElement cityopt : FrmDrpList)

			if (cityopt.getText().contains("Hyderabad")) {
				cityopt.click();
				break;
			}
	}

	public void TDrp() throws Throwable {
		ToDrp.click();
		List<WebElement> optTo = driver.findElements(By.xpath("(//li[contains(@class,'ls-reset br-4')]//p)"));
		for (WebElement cityopt2 : ToDrpList) {

			if (cityopt2.getText().contains("Bangalore")) {
				cityopt2.click();
				break;
			}
		}

	}

	public void Dpon() throws Throwable {
		Actions ac = new Actions(driver);
		ac.moveToElement(DepOn).click().build().perform();
		Thread.sleep(2000);
		ac.moveToElement(frmDate).click().perform();
		ac.moveToElement(ToDate).click().perform();
		Thread.sleep(2000);

	}

	public void adchin() throws Throwable {

		Actions ac = new Actions(driver);
		ac.moveToElement(adlt).click().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).click().perform();
		ac.sendKeys(Keys.ARROW_DOWN.ENTER).click().perform();
		Thread.sleep(1000);

		ac.moveToElement(chidrn).click().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).click().perform();
		ac.sendKeys(Keys.ARROW_DOWN.ENTER).click().perform();

		ac.moveToElement(infan).click().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).click().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN.ENTER).click().perform();

	}

	public void Sflights() throws Throwable {
		SechFligt.click();
		Thread.sleep(9000);
	}

	public void StpF() {
		Stp.click();
	}

	public void DepartFHyd() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,200)");

		DFrmHyd.click();
	}

	public void DepartFBlr() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,300)");
		DfrmBlr.click();
	}

	public void SeFlight() {
		FrmFligt.click();
		ReFligt.click();
	}

	public void bookNow() throws Throwable {
		Bnow.click();
		Thread.sleep(3000);
		driver.quit();
	}

	public void rButton2() {

		try {
			if (alert.isDisplayed()) {
				alert.click();
			}

		} catch (Exception e) {

			System.out.println("Not Showing Alert Window");
		}

		radioButton2.click();
	}

	public void departon2() throws Throwable {
		Actions ac = new Actions(driver);
		ac.moveToElement(Deon2).click().build().perform();
		Thread.sleep(3000);
		ac.moveToElement(date2).click().perform();
	}

	public void depTime2() throws Throwable {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,300)");
		dtime2.click();
		Thread.sleep(2000);
	}

	public void booking2() throws Throwable {

		book2.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
