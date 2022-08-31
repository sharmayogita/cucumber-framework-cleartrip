package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue={"stepDefinitions"},
		dryRun=true,
		monochrome = true, //display the console output in a proper readable format
		strict=true // it will check if any step is not defined in step defination file
		//plugin = {"pretty","html=test-output"}
		)

public class TestRun {
	
}
