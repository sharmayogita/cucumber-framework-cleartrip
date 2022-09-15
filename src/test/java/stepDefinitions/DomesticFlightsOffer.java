package stepDefinitions;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.DomesticFlightsOfferPages;

public class DomesticFlightsOffer {

	public static WebDriver driver;
	public String coupon;
	public static DomesticFlightsOfferPages df;
	// DomesticFlightsOfferPages df = PageFactory.initElsements(driver,
	// DomesticFlightsOfferPages.class);

	@Given("^i open browser$")
	public void i_open_browser() throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.get("https://www.cleartrip.com");

	}

	@When("^i click popup$")
	public void i_click_popup() throws Throwable {
		// DomesticFlightsOfferPages df = PageFactory.initElements(driver,
		// DomesticFlightsOfferPages.class);
		df = new DomesticFlightsOfferPages(driver);
		//Thread.sleep(3000);
		try {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[name()='svg'][@class=' c-pointer c-neutral-900'][1]")));
		//{
			df.clickPopup();
			System.out.println("closing the popup");
		} catch (Exception e) {

			Thread.sleep(1000);
		}
		//}
	}

	@When("^i go to top offers$")
	public void i_go_to_top_offers() throws Throwable {
		// DomesticFlightsPages df = PageFactory.initElements(driver,
		// DomesticFlightsPages.class);
		df.ClickTopoffers();

		// driver.findElement(By.xpath("//div[text()='Top Offers']")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Object[] allwindows = windows.toArray();
		String window1 = allwindows[0].toString();
		String window2 = allwindows[1].toString();

		driver.switchTo().window(window2);
		Thread.sleep(3000);
	}

	@When("^i click domestic flights$")
	public void i_click_domestic_flights() throws Throwable {
		// DomesticFlightsPages df = PageFactory.initElements(driver,
		// DomesticFlightsPages.class);
		df.clickondomesticflights();

	//	driver.findElement(By.xpath("//*[@id=\"IconNavList\"]/li[1]/a")).click();
		// {
		//
		// System.out.println("system displayed domestic flight offers");
		// }
		//
//		driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/div[1]/div[2]")).click();
		Thread.sleep(3000);
	}

	@When("^i click know more option$")
	public void i_click_know_more_option() throws Throwable {
		// DomesticFlightsPages df = PageFactory.initElements(driver,
		// DomesticFlightsPages.class);
		df.clickknowmoreoption();

		Thread.sleep(3000);

		// driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/div[1]/div[2]/div[5]/span/a")).click();
	}

	@When("^i copy  coupon code$")
	public void i_copy_coupon_code() throws Throwable {
		// DomesticFlightsPages df = PageFactory.initElements(driver,
		// DomesticFlightsPages.class);
		df.copycouponcode();

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"main-content\"]")).click();

		Thread.sleep(3000);
		// WebElement table =
		// driver.findElement(By.xpath("//div/div[1]/div/div/table[1]/tbody"));
		// List<WebElement> row = table.findElements(By.tagName("tr"));
		// List<WebElement> col = row.get(1).findElements(By.tagName("td"));
		// coupon = col.get(1).getText();
		System.out.println(coupon);

	}

	@Then("^i click book now$")
	public void i_click_book_now_() throws Throwable {
		// DomesticFlightsPages df = PageFactory.initElements(driver,
		// DomesticFlightsPages.class);
		df.ClickonBookknow();

		// driver.findElement(By.xpath("//a[@href='//cleartrip.com/']//img")).click();
		System.out.println("system displayed search flights");
	}

}
