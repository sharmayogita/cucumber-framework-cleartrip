package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features/domesticFlightsOffer.feature"},
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome = true, //display the console output in a proper readable format
		strict=true, // it will check if any step is not defined in step defination file
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/domesticFlightsOffer.html"}
				//plugin = {"pretty","html=test-output"}
		)
public class DomesticFlightsOfferTestRun extends AbstractTestNGCucumberTests {

}
