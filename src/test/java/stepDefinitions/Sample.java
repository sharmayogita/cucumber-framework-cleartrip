package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.velocity.runtime.directive.Foreach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void validate(List<WebElement> buttons) throws Throwable {

		// boolean checked = false;
		Thread.sleep(5000);
		List<WebElement> button = buttons;
		for (WebElement radioButton : button) {
			// checked = radioButton.isSelected();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", radioButton);
			if (radioButton.isDisplayed()) {

				wait.until(ExpectedConditions.visibilityOf(radioButton));
				js.executeScript("arguments[0].scrollIntoView(true)", radioButton);
				Thread.sleep(500);
				radioButton.click();
				Thread.sleep(500);
			}
		}
	}

	public static void verify(List<WebElement> data) throws Throwable {
		List<WebElement> fData = data;
		for (WebElement each : fData) {
			System.out.println(each.getText());
		}
	}

	public static void main(String[] args) throws Throwable {

		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// wait = new WebDriverWait(driver, 10);
		// driver.get("https://www.cleartrip.com/");
		// Thread.sleep(3000);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		//
		// try {
		// if (driver.findElement(By.xpath("//div[contains(@class,'px-1
		// plNew')]")).isEnabled()) {
		// driver.findElement(By.xpath("//div[contains(@class,'px-1
		// plNew')]")).click();
		// System.out.println("Login Window is prasent");
		// }
		// } catch (Exception e) {
		// System.out.println("There is no login window prasent");
		// }
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//div[text()='Hotels']")).click();
		// Thread.sleep(5000);
		// WebElement wTo = driver.findElement(By.xpath("//label[text()='Where
		// to?']/following::input"));
		// wTo.sendKeys("Goa");
		// wTo.click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//div[contains(@class,'bg-white
		// br-4')]//li[1]")).click();
		// Thread.sleep(1000);

		// driver.findElement(By.xpath("(//div[contains(@class,'fs-inherit
		// c-inherit')])[3]")).click();
		// Thread.sleep(1000);
		//
		// while (true) {
		// if (driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day
		// DayPicker-Day--start')]"))
		// .isDisplayed()) {
		// break;
		// } else {
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@class='flex-1
		// ta-right']")).click();
		//
		// }
		// }
		// WebElement checkIN = driver
		// .findElement(By.xpath("//div[contains(@class,'DayPicker-Day
		// DayPicker-Day--start')]"));
		// Thread.sleep(1000);
		// WebElement checkOut = driver
		// .findElement(By.xpath("(//div[@class='DayPicker-Day
		// DayPicker-Day--leftEdge'])[1]"));
		// Thread.sleep(1000);
		// WebElement traveller =
		// driver.findElement(By.xpath("//button[@name='travellers']"));
		// Thread.sleep(1000);
		//
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click()", checkIN);
		// Thread.sleep(1000);
		// js.executeScript("arguments[0].click()", checkOut);
		// Thread.sleep(1000);
		// js.executeScript("arguments[0].click()", traveller);
		// Thread.sleep(1000);
		//
		// WebElement addTraveller =
		// driver.findElement(By.xpath("//p[contains(@class,'p-2 fs-3')]"));
		// Thread.sleep(1000);
		// js.executeScript("arguments[0].click()", addTraveller);
		// Thread.sleep(1000);
		//
		// WebElement adult =
		// driver.findElement(By.xpath("(//li[contains(@class,'fs-4
		// mx-5')])[1]"));
		// Thread.sleep(1000);
		// WebElement childrens =
		// driver.findElement(By.xpath("(//li[contains(@class,'fs-4
		// mx-5')])[2]"));
		// Thread.sleep(1000);
		// WebElement addRoom =
		// driver.findElement(By.xpath("//span[contains(@class,'c-pointer
		// flex')]"));
		// Thread.sleep(1000);
		// js.executeScript("arguments[0].click()", adult);
		// Thread.sleep(1000);
		// js.executeScript("arguments[0].click()", childrens);
		// Thread.sleep(1000);
		// js.executeScript("arguments[0].click()", addRoom);
		//
		// Thread.sleep(1000);
		// WebElement sOptions =
		// driver.findElement(By.xpath("//p[contains(@class,'fs-2
		// c-pointer')]"));
		// js.executeScript("arguments[0].click()", sOptions);
		//
		// Thread.sleep(1000);
		// WebElement Options =
		// driver.findElement(By.xpath("(//li[contains(@class,'ls-reset
		// br-4')])[1]"));
		// js.executeScript("arguments[0].click()", Options);

		// Thread.sleep(1000);
		// WebElement sHotels =
		// driver.findElement(By.xpath("//button[contains(@class,'px-7
		// bg-primary-500')]"));
		// js.executeScript("arguments[0].click()", sHotels);
		//
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		// List<WebElement> filters =
		// driver.findElements(By.xpath("(//div[contains(@class,'flex
		// flex-between')])[5]/following-sibling::div/label/div/div "));
		// Thread.sleep(1000);
		// WebElement seemore =
		// driver.findElement(By.xpath("(//div[contains(@class,'c-secondary-500
		// fs-body')])[1]"));
		// Thread.sleep(1000);
		// Actions ac = new Actions(driver);
		// ac.moveToElement(seemore).click().perform();
		// List<WebElement> fHotel =
		// driver.findElements(By.xpath("(//div[contains(@class,'flex
		// flex-between')])[5]/following-sibling::div/label/following-sibling::div/div/label/div[contains(@class,'flex
		// flex-middle flex-between flex-1')]/div"));
		// filters.addAll(fHotel);
		//
		// for (WebElement Element : filters) {
		// seemore.click();
		// System.out.println(Element.getText());
		// }

		// int no_filters = fHotel.size();
		// System.out.println("Total number of filters : " + no_filters);
		//
		// for (WebElement Element : fHotel) {
		// String names = Element.getText();
		// System.out.println(names);
		// }
		// verify(fHotel);

		// validate(fHotel);
		// validate(fHotel);
		//
		// System.out.println();
		// List<WebElement> t_price =
		// driver.findElements(By.xpath("(//input[contains(@class,'bn
		// box-border')])"));
		// driver.findElement(By.xpath("(//input[contains(@class,'bn
		// box-border')])[1]")).clear();
		// driver.findElement(By.xpath("(//input[contains(@class,'bn
		// box-border')])[1]")).sendKeys("500");
		// driver.findElement(By.xpath("(//input[contains(@class,'bn
		// box-border')])[2]")).clear();
		// driver.findElement(By.xpath("(//input[contains(@class,'bn
		// box-border')])[2]")).sendKeys("50000");
		// System.out.println("Total price options : " + t_price.size());
		// for (WebElement Tprice : t_price) {
		// String price = Tprice.getAttribute("value");
		// System.out.println(price);
		// }
		//
		// Thread.sleep(3000);
		// System.out.println();
		// driver.findElement(By.xpath("(//div[contains(@class,'flex flex-wrap
		// col-22')]//div//p)[6]")).click();
		// List<WebElement> priyority =
		// driver.findElements(By.xpath("(//div[@class='mb-2'])"));
		// System.out.println("Pripority options : " + priyority.size());
		//// for (WebElement pri : priyority) {
		//// Thread.sleep(200);
		//// System.out.println(pri.getText());
		//// }
		// verify(priyority);
		//
		// // validate(priyority);
		// Thread.sleep(2000);
		// System.out.println();
		// System.out.println();
		// List<WebElement> rating =
		// driver.findElements(By.xpath("(//label[contains(@class,'radio
		// w-100p')])"));
		// System.out.println("Rating options : " + rating.size());
		//// for (WebElement Trating : rating) {
		//// System.out.println(Trating.getText());
		//// }
		//// Thread.sleep(5000);
		// verify(rating);
		//
		// WebElement view = driver.findElement(By.xpath("(//button[text()='View
		// details'])[1]"));
		// js.executeScript("arguments[0].click()", view);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Select
		// room'])[2]")));
		// Thread.sleep(2000);
		//
		// WebElement selectRoom = driver
		// .findElement(By.xpath("(//button[contains(@class,'bg-primary-500
		// hover:bg-primary-600')])[1]"));
		// js.executeScript("arguments[0].click()", selectRoom);
		//
		// Thread.sleep(2000);
		//
		// WebElement book =
		// driver.findElement(By.xpath("(//button[contains(@class,'ml-6
		// room_rate_btn')])[1]"));
		// js.executeScript("arguments[0].scrollIntoView(true)", book);
		// js.executeScript("arguments[0].click()", book);
		// Thread.sleep(2000);
		// //driver.quit();

		// ======================================================================//

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			if (driver.findElement(By.xpath("//div[contains(@class,'px-1 plNew')]")).isEnabled()) {
				driver.findElement(By.xpath("//div[contains(@class,'px-1 plNew')]")).click();
				System.out.println("Window is prasent");
			}
		} catch (Exception e) {
			System.out.println("There is no window prasent");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Hotels']")).click();
		Thread.sleep(5000);
		WebElement wTo1 = driver.findElement(By.xpath("//label[text()='Where to?']/following::input"));
		wTo1.sendKeys("Hyderabad");
		wTo1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'bg-white br-4')]//li[1]")).click();
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//button[text()='Search Hotels']"));
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("arguments[0].click()", search);
		System.out.println();
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//button[text()='Modify search']")).isDisplayed()) {
			System.out.println("Url page open");
		} else {
			System.out.println("Enter Valid Url");
		}
		System.out.println();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='row nmx-1']/div[4]")));
		List<WebElement> modify = driver.findElements(By.xpath("//div[@class='row nmx-1']/div"));
		System.out.println("Number of modify options");
		verify(modify);

		System.out.println();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='pt-8']//p)")));
		List<WebElement> filters1 = driver.findElements(By.xpath("(//div[@class='pt-8']//p)"));
		List<WebElement> fHotel1 = driver.findElements(By.xpath("//div[text()='Filter by hotel']"));
		fHotel1.addAll(filters1);
		int no_filters1 = fHotel1.size();
		System.out.println("Total number of filters : " + no_filters1);
		verify(fHotel1);
		System.out.println();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'flex flex-wrap col-22')]//div//p)[6]")));
		driver.findElement(By.xpath("(//div[contains(@class,'flex flex-wrap col-22')]//div//p)[6]")).click();
		List<WebElement> priyority1 = driver.findElements(By.xpath("(//div[@class='mb-2'])"));
		System.out.println("Pripority options : " + priyority1.size());
		verify(priyority1);
		
		System.out.println();
		wait = new WebDriverWait(driver, 10);
		WebElement Fhotels = driver.findElement(By.xpath("(//input[contains(@class,'field bw-1')])[2]"));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'field bw-1')])[2]")));
		if (Fhotels.isDisplayed()) {
			System.out.println("Filter hotel option is prasent");
		} else {

			System.out.println("Filter hotel option is not prasent");
		}
		System.out.println();
		wait = new WebDriverWait(driver, 10);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'bn box-border')])")));
		List<WebElement> t_price1 = driver.findElements(By.xpath("(//input[contains(@class,'bn box-border')])"));
		driver.findElement(By.xpath("(//input[contains(@class,'bn box-border')])[1]")).clear();
		driver.findElement(By.xpath("(//input[contains(@class,'bn box-border')])[1]")).sendKeys("500");
		driver.findElement(By.xpath("(//input[contains(@class,'bn box-border')])[2]")).clear();
		driver.findElement(By.xpath("(//input[contains(@class,'bn box-border')])[2]")).sendKeys("50000");
		System.out.println("Total price options : " + t_price1.size());
		for (WebElement Tprice : t_price1) {
			String price = Tprice.getAttribute("value");
			System.out.println(price);
		}
		System.out.println();
		wait = new WebDriverWait(driver, 10);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[contains(@class,'radio w-100p')])")));
		System.out.println();
		List<WebElement> rating1 = driver.findElements(By.xpath("(//label[contains(@class,'radio w-100p')])"));
		System.out.println("Rating options : " + rating1.size());
		verify(rating1);
		// validate(rating1);

		Thread.sleep(5000);
		System.out.println();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(((//div[contains(@class,'flex flex-between')])[3]/following-sibling::div/label))")));
		List<WebElement> Soffers = driver.findElements(
				By.xpath("(((//div[contains(@class,'flex flex-between')])[3]/following-sibling::div/label))"));
		System.out.println("Special offers options : " + Soffers.size());
		verify(Soffers);

		System.out.println();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(((//div[contains(@class,'flex flex-between')])[4]/following-sibling::div/label))")));
		List<WebElement> TArating = driver.findElements(
				By.xpath("(((//div[contains(@class,'flex flex-between')])[4]/following-sibling::div/label))"));
		System.out.println("TA rating options : " + TArating.size());
		verify(TArating);
		

		System.out.println();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(((//div[contains(@class,'flex flex-between')])[5]/following-sibling::div/label))")));
		List<WebElement> vAmenties = driver.findElements(
				By.xpath("(((//div[contains(@class,'flex flex-between')])[5]/following-sibling::div/label))"));
		List<WebElement> vAmentie = driver.findElements(By.xpath(
				"(((//div[contains(@class,'flex flex-between')])[5]/following-sibling::div/label))[3]/following-sibling::div/div/labe"));
		vAmenties.addAll(vAmentie);
		System.out.println("Amenties options : " + vAmenties.size());
		verify(vAmenties);

		System.out.println();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(((//div[contains(@class,'flex flex-between')])[6]/following-sibling::div/label))")));
		List<WebElement> pType = driver.findElements(
				By.xpath("(((//div[contains(@class,'flex flex-between')])[6]/following-sibling::div/label))"));
		System.out.println("Property type options : " + pType.size());
		verify(pType);

		System.out.println();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Featured']")));
		List<WebElement> dBlock = driver.findElements(By.xpath("(//div[@class='d-block']//div)[1]/p"));

		System.out.println("D-block option : " + dBlock.size());
		for (WebElement Dblock : dBlock) {
			js.executeScript("arguments[0].scrollIntoView(true)", dBlock);
			System.out.println(Dblock.getAttribute("value"));
		}
		System.out.println();
		WebElement numberOfHotels = driver.findElement(By.xpath("//p[@class='fs-3 c-neutral-700']//span[1]"));
		System.out.println("Number of hotels : " + numberOfHotels.getText());
		List<WebElement> hotelList = driver.findElements(By.xpath("(//h2[contains(@class,'fs-4 mt-2')])"));
		for (WebElement webEle : hotelList) {
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView(true)", webEle);
			System.out.println(webEle.getText());
			Thread.sleep(2000);
		}

		System.out.println();

		driver.findElement(By.xpath("(//div[text()='Clear all'])[1]")).click();
		Thread.sleep(5000);
		String actual = "570";
		String expected = driver.findElement(By.xpath("(//input[contains(@class,'bn box-border')])[1]"))
				.getAttribute("value");
		System.out.println(expected);

		if (expected.equals(actual)) {
			System.out.println("ClearAll button working ");
		} else {
			System.out.println("ClearAll button not working");

		}
		System.out.println();

		List<WebElement> pHotels = driver.findElements(By.xpath("(//ul[contains(@class,'fs-2 ls-reset')])[1]/li"));
		System.out.println("Number of populer Hotels : " + pHotels.size());
		verify(pHotels);

//		 System.out.println();
//		 List<WebElement> phChain =
//		 driver.findElements(By.xpath("(//ul[contains(@class,'fs-2
//		 ls-reset')])[2]/li"));
//		 System.out.println("Number of Populer hotel chains : " +
//		 phChain.size());
//		 verify(phChain);
//		
//		 System.out.println();
//		 List<WebElement> oTools =
//		 driver.findElements(By.xpath("(//ul[contains(@class,'fs-2
//		 ls-reset')])[3]/li"));
//		 System.out.println("Number of Other Tools : " + oTools.size());
//		 verify(oTools);
//		
//		 System.out.println();
//		 WebElement view1 =
//		 driver.findElement(By.xpath("(//button[text()='View details'])[1]"));
//		 js.executeScript("arguments[0].click()", view1);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Select
//		 room'])[2]")));
//		 Thread.sleep(5000);
//		 if (driver.findElement(By.xpath("(//button[text()='Select
//		 room'])[2]")).isDisplayed()) {
//		 System.out.println("Search room page open");
//		 } else {
//		
//		 System.out.println("Search room page is not open");
//		 }
//		 driver.close();

	}

}
