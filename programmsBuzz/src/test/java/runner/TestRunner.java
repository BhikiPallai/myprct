package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//feature/first.feature",".//feature/second.feature"},
		glue="step",
		dryRun=false,
		monochrome=true,
		tags="@SmokeTest"
		/*plugin=""*/
		)

public class TestRunner {

}
