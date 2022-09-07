package pageObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public PageObjectClass(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void options(List<WebElement> data) throws Throwable {
		List<WebElement> fData = data;
		for (WebElement each : fData) {
			System.out.println(each.getText());
		}
	}

	@FindBy(xpath = "(//*[name()='svg'][@class=' c-pointer c-neutral-900'])[1]")
	WebElement Popup;

	@FindBy(xpath = "//div[text()='Hotels']")
	WebElement Hotels;

	@FindBy(xpath = "//input[contains(@class,'field bw-1')]")
	WebElement Field;

	@FindBy(xpath = "//p[text()='The LaLiT Golf & Spa Resort Goa, Goa,Goa, India']")
	WebElement City;

	@FindBy(xpath = "//button[@name='from']")
	WebElement From;

	@FindBy(xpath = "//div[@class='flex-1 ta-right']//*[name()='svg']")
	WebElement Rclick;

	@FindBy(xpath = "(//div[text()='23'])[2]")
	WebElement Checkin;

	@FindBy(xpath = "(//div[text()='30'])[1]")
	WebElement Checkout;

	@FindBy(name = "travellers")
	WebElement Trvlr;

	@FindBy(xpath = "//p[contains(@class,'p-2 fs-3')]")
	WebElement Select1;

	@FindBy(xpath = "//p[contains(@class,'fs-2 c-pointer')]")
	WebElement Select2;

	@FindBy(xpath = "//li[text()='2 Rooms, 4 Adults']")
	WebElement Members;

	@FindBy(xpath = "//button[contains(@class,'px-7 bg-primary-500')]")
	WebElement Search;

	@FindBy(linkText = "View all")
	WebElement Vl;

	@FindBy(xpath = "//div[text()='1']")
	WebElement Deal1;

	@FindBy(xpath = "//div[text()='2']")
	WebElement Deal2;

	@FindBy(xpath = "//div[text()='3']")
	WebElement Deal3;

	@FindBy(xpath = "//div[text()='4']")
	WebElement Deal4;

	@FindBy(xpath = "//div[text()='5']")
	WebElement Deal5;

	@FindBy(xpath = "//div[text()='6']")
	WebElement Deal6;

	@FindBy(xpath = "//div[text()='7']")
	WebElement Deal7;

	@FindBy(xpath = "//p[text()='Goa']")
	WebElement Goa;

	@FindBy(xpath = "//p[text()='Delhi']")
	WebElement Delhi;

	@FindBy(xpath = "//p[text()='Mumbai']")
	WebElement Mumbai;

	@FindBy(xpath = "//p[text()='Jaipur']")
	WebElement Jaipur;

	@FindBy(xpath = "//p[text()='Dubai']")
	WebElement Dubai;

	@FindBy(xpath = "//p[text()='Maldives']")
	WebElement Maldives;

	@FindBy(xpath = "(//input[@name='search'])[1]")
	WebElement placeholder;

	@FindBy(xpath = "(//div[contains(@class,'fs-inherit c-inherit')])[2]")
	WebElement checkIN;
	
	@FindBy(xpath = "(//div[contains(@class,'fs-inherit c-inherit')])[3]")
	WebElement checkOUT;

	@FindBy(xpath = "//button[@name='travellers']//div[1]")
	WebElement passenger;

	@FindBy(xpath = "//button[text()='Modify search']")
	WebElement modifySearch;

	@FindBy(xpath = "//div[text()='Filter by hotel']")
	List<WebElement> filterOptions1;
	@FindBy(xpath = "(//div[@class='pt-8']//p)")
	List<WebElement> filterOptions2;

	@FindBy(xpath = "(//input[contains(@class,'bn box-border')])")
	List<WebElement> tpriceOptions;

	@FindBy(xpath = "(//div[contains(@class,'flex flex-between')])[2]/following-sibling::div/label/div/div")
	List<WebElement> hotelclassOptions;
	
	@FindBy(xpath="(//div[contains(@class,'flex flex-between')])[3]/following-sibling::div/label/div/div")
	List<WebElement> sOffers;

	@FindBy(xpath="(//div[contains(@class,'flex flex-between')])[5]/following-sibling::div/label/div/div ")
	List<WebElement> amenities;
	
	@FindBy(xpath = "(//div[contains(@class,'flex flex-between')])[4]/following-sibling::div/label/div/div ")
	List<WebElement> TripAdvisorratingOptions;

	@FindBy(xpath = "(//div[contains(@class,'flex flex-between')])[6]/following-sibling::div/label/div/div ")
	List<WebElement> PropertytypesOptions;
	
	@FindBy(xpath = "(//div[contains(@class,'c-secondary-500 bc-secondary-500')]//p)[6]")
	WebElement priyorityseemorebtn;
	@FindBy(xpath = "(//div[contains(@class,'c-secondary-500 bc-secondary-500')]//p)")
	List<WebElement> priyorityOptions;
	
	@FindBy(xpath = "(//button[text()='View details'])[1]")
	WebElement select;

	@FindBy(xpath = "(//button[text()='Select room'])[2]")
	WebElement sr;

	@FindBy(xpath = "//li[text()='Traveller reviews']")
	WebElement tr;

	@FindBy(xpath = "//li[text()='Hotel amenities and info']")
	WebElement amenitiesAndInfo;

	@FindBy(xpath = "(//div[@class='flex-column'])[4]")
	WebElement amntsection;

	@FindBy(xpath = "//li[text()='Map view']")
	WebElement map;

	@FindBy(xpath = "(//button[text()='Select room'])[3]")
	WebElement mapcancel;

	@FindBy(xpath = "(//button[text()='Book'])[1]")
	WebElement book;

	@FindBy(xpath = "(//*[name()='svg'][@class=' c-pointer c-neutral-900'])[1]")
	WebElement alert;

	@FindBy(xpath = "(//button[text()='Continue'])[1]")
	WebElement cont;

	@FindBy(xpath = "//input[@placeholder='Mobile number']")
	WebElement number;

	@FindBy(xpath = "//input[@data-testid='email']")
	WebElement mail;

	@FindBy(xpath = "(//button[text()='Continue'])[2]")
	WebElement con2;
	
	@FindBy(xpath = "(//div[@class='p-relative']//button)[2]")
	WebElement title;
	
	@FindBy(xpath = "(//input[@placeholder='First name'])[1]")
	WebElement Fname;
	
	@FindBy(xpath = "(//input[@placeholder='Last name'])[1]")
	WebElement Lname;
	
	@FindBy(xpath = "(//div[@class='p-relative']//button)[3]")
	WebElement title2;
	
	@FindBy(xpath = "(//input[@placeholder='First name'])[2]")
	WebElement Fname2;
	
	@FindBy(xpath = "(//input[@placeholder='Last name'])[2]")
	WebElement Lname2;
	
	@FindBy(xpath = "//button[text()='Continue to payment']")
	WebElement payment;
	
	@FindBy(xpath="//h1[contains(@class,'fs-7 fw-600')]")
	WebElement paymentdetail;
	
	@FindBy(xpath = "(//input[contains(@class,'bn box-border')])[1]") WebElement MinPrice;
	@FindBy(xpath = "(//input[contains(@class,'bn box-border')])[2]") WebElement MaxPrice;
	
	//Priority filter
	@FindBy(xpath = "(//p[@class='fs-2'])[1]") WebElement PriorityOption1;
	@FindBy(xpath = "(//p[@class='fs-2'])[2]") WebElement PriorityOption2;
	@FindBy(xpath = "(//p[@class='fs-2'])[3]") WebElement PriorityOption3;
	@FindBy(xpath = "(//p[@class='fs-2'])[4]") WebElement PriorityOption4;
	@FindBy(xpath = "(//p[@class='fs-2'])[5]") WebElement PriorityOption5;
	
	//Hotel Class
	@FindBy(xpath = "(//span[contains(@class,'checkbox__mark bs-border')])[1]") WebElement Hoteloption1;
	@FindBy(xpath = "(//span[contains(@class,'checkbox__mark bs-border')])[2]") WebElement Hoteloption2;
	@FindBy(xpath = "(//span[contains(@class,'checkbox__mark bs-border')])[3]") WebElement Hoteloption3;
	@FindBy(xpath = "(//span[contains(@class,'checkbox__mark bs-border')])[4]") WebElement Hoteloption4;
	
	//Special Offers
	@FindBy(xpath = "//input[@value='hotelWithDeals']/following-sibling::span[1]") WebElement SpecialOption1;
	@FindBy(xpath = "//input[@value='freeCancellation']/following-sibling::span[1]") WebElement SpecialOption2;
	
	//Trip Advisor rating
	@FindBy(xpath = "(//span[contains(@class,'radio__circle bs-border')])[1]") WebElement TripOption1;
	@FindBy(xpath = "(//span[contains(@class,'radio__circle bs-border')])[2]") WebElement TripOption2;
	@FindBy(xpath = "(//span[contains(@class,'radio__circle bs-border')])[3]") WebElement TripOption3;
	@FindBy(xpath = "(//span[contains(@class,'radio__circle bs-border')])[4]") WebElement TripOption4;
	
	//Amenities
	@FindBy(xpath = "(//span[@class='checkbox__mark bs-border bc-neutral-500 bw-1 ba'])[7]") WebElement AmenitiesOption1;
	@FindBy(xpath = "(//span[@class='checkbox__mark bs-border bc-neutral-500 bw-1 ba'])[8]") WebElement AmenitiesOption2;
	@FindBy(xpath = "(//span[@class='checkbox__mark bs-border bc-neutral-500 bw-1 ba'])[9]") WebElement AmenitiesOption3;
	
	public void AmenitiesValiation() throws Throwable 
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("javascript:window.scrollBy(0,450)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AmenitiesOption1));
		Thread.sleep(3000);
	    AmenitiesOption1.click();
	    Thread.sleep(3000);
	    
	    js.executeScript("javascript:window.scrollBy(0,450)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AmenitiesOption2));
		Thread.sleep(3000);
	    AmenitiesOption2.click();
	    Thread.sleep(3000);
	    
	    js.executeScript("javascript:window.scrollBy(0,550)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(AmenitiesOption3));
	    AmenitiesOption3.click();
	   Thread.sleep(3000);
	}
	
	// Property Types 
	@FindBy(xpath = "//input[@value='HOT']/following-sibling::span[1]") WebElement PropertyOption1;
	@FindBy(xpath = "(//span[@class='checkbox__mark bs-border bc-neutral-500 bw-1 ba'])[22]") WebElement PropertyOption2; 
	@FindBy(xpath = "(//span[@class='checkbox__mark bs-border bc-neutral-500 bw-1 ba'])[23]") WebElement PropertyOption3;
	
	public void Popup() throws Throwable {
		try {
			if ((Popup).isDisplayed())
				(Popup).click();

		} catch (Exception e) {
			System.out.println("Not Showing Alert Window");

		}

		Thread.sleep(3000);
	}

	public void VerifyPage() {

		if ((Hotels).isDisplayed()) {
			System.out.println("iam in the hotel page");

		}
	}

	public void Hotels() {
		Hotels.click();
	}

	public void WhereTo() throws Throwable {
		
		Thread.sleep(5000);
		WebElement wTo1 = driver.findElement(By.xpath("//label[text()='Where to?']/following::input"));
		wTo1.sendKeys("Hyderabad");
		wTo1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'bg-white br-4')]//li[1]")).click();
		Thread.sleep(1000);

	}

	public void SelectDate() throws Throwable
	{
		From.click();
		Thread.sleep(3000);
		Rclick.click();
		Thread.sleep(3000);
		Checkin.click();
		Thread.sleep(3000);
		Checkout.click();
		Thread.sleep(3000);
	}
	
	public void AddTravellers() throws Throwable
	{
		
		Trvlr.click();
		Thread.sleep(2000);
		
		Select1.click();
		Thread.sleep(2000);
		
		Select2.click();
		Thread.sleep(2000);

	    Members.click();
	    Thread.sleep(2000);
	}
	
	public void SearchHotels() throws Throwable
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Search);
		Thread.sleep(2000);
	}
	
	public void ViewAll() throws Throwable
	{
		String parent = driver.getWindowHandle();
        System.out.println(parent);
		Thread.sleep(2000);
        Vl.click();
        Thread.sleep(5000);

	}
	
	public void TripDeals() throws Throwable
	{
		Deal1.click();
		Thread.sleep(1000);
		Deal2.click();
		Thread.sleep(1000);
		Deal3.click();
		Thread.sleep(1000);
		Deal4.click();
		Thread.sleep(1000);
		Deal5.click();
		Thread.sleep(1000);
		Deal6.click();
		Thread.sleep(1000);
		Deal7.click();
		Thread.sleep(1000);
	}
	public void Popular() throws Throwable
	{
		WebElement goa = Goa;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", goa);

		WebElement delhi = Delhi;
		js.executeScript("arguments[0].click()", delhi);

		Thread.sleep(3000);

		WebElement mum = Mumbai;
		js.executeScript("arguments[0].click()", mum);

		Thread.sleep(3000);

		WebElement jai = Jaipur;
		js.executeScript("arguments[0].click()", jai);

		Thread.sleep(3000);
		WebElement dubai = Dubai;
		js.executeScript("arguments[0].click()", dubai);

		Thread.sleep(3000);
		WebElement mal = Maldives;
		js.executeScript("arguments[0].click()", mal);
	}
	
	public void modifySearchOptions() throws Throwable {
		wait = new WebDriverWait(driver, 15);
		List<WebElement> list = new ArrayList<WebElement>();
		list.add(placeholder);
		list.add(checkIN);
		list.add(checkOUT);
		list.add(passenger);
		System.out.println("Modify search options : " + list.size());
		System.out.println( placeholder.getAttribute("value"));
		System.out.println(checkIN.getText());
		System.out.println(checkOUT.getText());
		System.out.println(passenger.getText());
		
	}
	
	public void modifySearchBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.visibilityOf(modifySearch));
		js.executeScript("arguments[0].scrollIntoView(true)", modifySearch);
		if (modifySearch.isDisplayed()) {
			System.out.println("Modify search is displayed");
		} else {
			System.out.println("Modify search is not displayed");
		}
	}
	
	public void filterOptions() throws Throwable {
		Thread.sleep(1000);
		filterOptions1.addAll(filterOptions2);
		System.out.println("Filter options : "+(filterOptions1.size()+filterOptions2.size()));
		options(filterOptions1);
		options(filterOptions2);
	}
	
	public void priceOptions() throws Throwable {

		System.out.println("Total price options : " + tpriceOptions.size());
		for (WebElement price : tpriceOptions) {
			System.out.println(price.getAttribute("value"));
		}
	}
	
	public void hotelClassoptions() throws Throwable{
		Thread.sleep(1000);
		System.out.println("Hotelclass Options : "+hotelclassOptions.size());
		options(hotelclassOptions);
	}
	
	public void specialOffer() throws Throwable{
		Thread.sleep(1000);
		System.out.println("Special offers options : "+sOffers.size());
		options(sOffers);
	}
	
	public void amenitiesOptions() throws Throwable{
		Thread.sleep(1000);
		System.out.println("Propertytype Options : "+amenities.size());
		options(amenities);
	}
	
	public void tripAdvisorOptions() throws Throwable{
		Thread.sleep(1000);
		System.out.println("TripAdvisorrating Options : "+TripAdvisorratingOptions.size());
		options(TripAdvisorratingOptions);
	}
	
	public void propertyTypeOptions() throws Throwable{
		Thread.sleep(1000);
		System.out.println("Propertytype Options : "+PropertytypesOptions.size());
		options(PropertytypesOptions);
	}

	public void priyority() throws Throwable{
		priyorityseemorebtn.click();
		Thread.sleep(1000);
		System.out.println("Priyority options : "+priyorityOptions.size());
		options(priyorityOptions);
	}
	
	public void TotalPriceValidation() throws Throwable
	{
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(MinPrice));
		MinPrice.clear();
		Thread.sleep(2000);
		MinPrice.sendKeys("3000");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(MaxPrice));
		MaxPrice.clear();
		Thread.sleep(2000);
		MaxPrice.sendKeys("500000");
		
	}

	public void PriorityFilterValidation() throws Throwable
	{
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(PriorityOption1));
		PriorityOption1.click();
		Thread.sleep(3000);
		
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(PriorityOption2));
		PriorityOption2.click();
		Thread.sleep(3000);
		
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(PriorityOption3));
		PriorityOption3.click();
		Thread.sleep(3000);
		
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(PriorityOption4));
		PriorityOption4.click();
		Thread.sleep(3000);
		
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(PriorityOption5));
		PriorityOption5.click();
		Thread.sleep(3000);
	}

	public void HotelClassValidation() throws Throwable 
	{
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(Hoteloption1));	
		Hoteloption1.click();
		Thread.sleep(3000);
		
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(Hoteloption2));	
		Hoteloption2.click();
		Thread.sleep(3000);
		
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(Hoteloption3));	
		Hoteloption3.click();
		Thread.sleep(3000);
		
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(Hoteloption4));	
		Hoteloption4.click();
		Thread.sleep(3000);
		
	}

	public void SpecialOffersValidation() throws Throwable 
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("javascript:window.scrollBy(0,350)");
        Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(SpecialOption1));		
		SpecialOption1.click();
		Thread.sleep(3000);
		
		js.executeScript("javascript:window.scrollBy(0,350)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(SpecialOption2));
		SpecialOption2.click();
		Thread.sleep(3000);
	}

	public void TripAdvisorValidation() throws Throwable 
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("javascript:window.scrollBy(0,350)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(TripOption1));
		js.executeScript("arguments[0].click()", TripOption1);
		//TripOption1.click();
		Thread.sleep(3000);
		
		js.executeScript("javascript:window.scrollBy(0,350)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(TripOption2));
		js.executeScript("arguments[0].click()", TripOption2);
		//TripOption2.click();
		Thread.sleep(3000);
		
		js.executeScript("javascript:window.scrollBy(0,350)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(TripOption3));
		js.executeScript("arguments[0].click()", TripOption3);
		//TripOption3.click();
		Thread.sleep(3000);
		
		js.executeScript("javascript:window.scrollBy(0,350)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(TripOption4));
		js.executeScript("arguments[0].click()", TripOption4);
		//TripOption4.click();
		Thread.sleep(3000);
	}

	public void ProperyTypesValidation() throws Throwable
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("javascript:window.scrollBy(0,650)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(PropertyOption1));
	    PropertyOption1.click();
	    Thread.sleep(3000);
	    
	    js.executeScript("javascript:window.scrollBy(0,650)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(PropertyOption2));
	    PropertyOption2.click();
	    Thread.sleep(3000);
	    
	    js.executeScript("javascript:window.scrollBy(0,650)");
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(PropertyOption3));
	    PropertyOption3.click();
	    Thread.sleep(3000);
		
	}

	public void view() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", select);
		System.out.println("I click Viewdetails");
		Thread.sleep(2000);

	}

	public void select() throws Throwable {
		System.out.println("I click select btn");
		sr.click();
		Thread.sleep(2000);
	}

	public void travellers() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", tr);
		Thread.sleep(3000);
		System.out.println("I click Travellers reviews and taken screenshot");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File tr = new File(".\\Screen\\Travellers.png");
		FileUtils.copyFile(sr, tr);
		Thread.sleep(3000);
	}

	public void amenitiesAndinfo() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", amenitiesAndInfo);
		Thread.sleep(3000);
		System.out.println("I click Hotel Amenties and info and taken screenshot");

		WebElement section = amntsection;
		File sec = section.getScreenshotAs(OutputType.FILE);
		File trc = new File(".\\Screen\\Amenities.png");
		FileUtils.copyFile(sec, trc);

		Thread.sleep(2000);

	}

	public void mapview() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", map);
		Thread.sleep(5000);
		System.out.println("I click Mapview and taken screenshot");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screen\\Map.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);

		mapcancel.click();
		Thread.sleep(5000);

	}

	public void room() throws Throwable {
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", book);
        System.out.println("I click book btn");
		Thread.sleep(5000);
		
		

		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(brw.get(1));
		System.out.println("I switch to child window");

		try {
			if ((alert).isDisplayed())
				(alert).click();
			System.out.println("Alert window shown and i closed window");

		} catch (Exception e) {
			System.out.println("Not Showing Alert Window");

		}

	}

	public void VerifyTitile() throws Throwable {

		
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(brw.get(1));
		
	}
	 public void Continue1() throws Throwable {
	     
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()", cont);
		 System.out.println("I click continue btn");
		 Thread.sleep(2000);

	 }

	public void ContDetails() throws Throwable {
		
		number.clear();
		number.sendKeys("9876543210");
		 Thread.sleep(2000);

		mail.clear();
		mail.sendKeys("rocky459@gmail.com");
		 Thread.sleep(2000);
		 System.out.println("I filled contact details");
	}

	public void Continue2() throws Throwable {
		System.out.println("I click continue btn");
		con2.click();
		Thread.sleep(2000);
	}
	
	public void AddTraveller() throws Throwable
	{
		title.click();
		Actions ac = new Actions(driver);
	    ac.moveToElement(title).click().perform();
	    Thread.sleep(1000);
	    ac.sendKeys(Keys.ARROW_DOWN).perform();
	    Thread.sleep(1000);
	    ac.sendKeys(Keys.ENTER).click().perform();
		Thread.sleep(2000);
		Fname.sendKeys("Prime");
		Thread.sleep(2000);
		Lname.sendKeys("Batch");
		
		title2.click();
	    ac.moveToElement(title2).click().perform();
	    Thread.sleep(1000);
	    ac.sendKeys(Keys.ARROW_DOWN).perform();
	    Thread.sleep(1000);
	    ac.sendKeys(Keys.ENTER).click().perform();
		Thread.sleep(2000);
		Fname2.sendKeys("Hotels");
		Thread.sleep(2000);
		Lname2.sendKeys("Team");
		
		Thread.sleep(2000);
		System.out.println("I filled Travallers details");
		
	}
	
	public void Continue3() throws Throwable
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()",payment);
		System.out.println("I click Payment button");
		Thread.sleep(7000);
	}

}
