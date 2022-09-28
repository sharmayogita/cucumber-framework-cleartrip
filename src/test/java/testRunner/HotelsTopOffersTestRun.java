package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features/hotelsTopOffers.feature"},
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome = true, //display the console output in a proper readable format
		strict=true, // it will check if any step is not defined in step defination file
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/hotelsTopOffers.html"}
				//plugin = {"pretty","html=test-output"}
		)
public class HotelsTopOffersTestRun extends AbstractTestNGCucumberTests {

}
