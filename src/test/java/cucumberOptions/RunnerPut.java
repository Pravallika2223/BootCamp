package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/Login.feature",
		glue="stepDefination",
		monochrome = true,
		tags="@smoke3"
		//strict = true
		//dryRun = false
		)
public class RunnerPut {

}
