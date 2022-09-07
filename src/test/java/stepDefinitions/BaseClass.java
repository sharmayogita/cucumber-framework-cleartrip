package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private static boolean initialized = false;
	protected static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;

	public String screenSubFolderName;

	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Before
	public static void launchApp() {

		String browserName = prop.getProperty("browserch");
		if (browserName.equalsIgnoreCase("Chrome") || !initialized) {
			WebDriverManager.chromedriver().setup();
			// initialize the driver
			driver = new ChromeDriver();
			initialized = true;

		} else if (browserName.equalsIgnoreCase("FireFox") || !initialized) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			initialized = true;

		} else if (browserName.equalsIgnoreCase("IE") || !initialized) {
			System.setProperty("webdriver.ie.driver", prop.getProperty("IEpath"));
			driver = new InternetExplorerDriver();
			initialized = true;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWait")), TimeUnit.SECONDS);
		// PageLoad TimeOuts
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageLoadTimeOut")),
				TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

	public WebDriver getDriver() {
		return driver;
	}

	@After
	public void tearDown(Scenario scenario) {
		System.out.println("screenshot showing");
		if (scenario.isFailed()) {
			if (screenSubFolderName == null) {
				LocalDateTime myDateObj = LocalDateTime.now();
				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyyHHmmss");
				screenSubFolderName = myDateObj.format(myFormatObj);
			}
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourcePath = ts.getScreenshotAs(OutputType.FILE);
			File destPath = new File("./Screenshots/" + screenSubFolderName + "/" + screenshotName + ".png");
			try {
				FileUtils.copyFile(sourcePath, destPath);
				// Reporter.addScreenCaptureFromPath(destPath.toString());
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(prop.getProperty("screenshotSuccessMsg"));
		}
		driver.quit();
	}
}
