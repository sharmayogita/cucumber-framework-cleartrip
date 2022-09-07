package testRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	features = {"Features/hotelsTopOffers.feature"},
		features = {"Features/internationalFlightsTopOffers.feature"},
		//features= {"Features/login.feature"},
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome = true, //display the console output in a proper readable format
		strict=true // it will check if any step is not defined in step defination file
		//plugin = {"pretty","html=test-output"}
		)

public class TestRun {
	
}

