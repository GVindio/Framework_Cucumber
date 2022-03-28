package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		monochrome = true,
		tags = {"@alltest"},
		name = {},
		dryRun = false,
		//strict = true,
		plugin = {"pretty"}
							//"html:Report:1",
				            				//"json:Report:2",
				            								//"junit:Report3"}
				
				
		)
public class TestRunner {

}
