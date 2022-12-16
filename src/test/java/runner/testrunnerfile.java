package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = "src/test/java/feature", 
		glue = "stepDefinitions",
		//dryRun=true,
		monochrome=true
		)
public class testrunnerfile extends AbstractTestNGCucumberTests {

}
