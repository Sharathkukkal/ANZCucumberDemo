package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "D:/ANZ_Workspace/test/src/main/java/feature/anz_testfeature.feature", //path of the feature files
			glue={"step_definition"}, //path of the step definition files
			format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},// For report generation
			monochrome = true, 
			strict = true,
			dryRun = false
				
			)
	 
	public class TestRunner {
	 
	}
