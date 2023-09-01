package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/home/coder/project/workspace/src/test/java/Features/Feature.feature", 
		glue = "StepDefinations", 
		dryRun = true,
		monochrome = true,
		plugin = {"html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json" }
		)
public class TestRunner {

}
