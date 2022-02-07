package Runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	  features="src/test/java/feature1",
	  glue="Scenario1SD",
	  tags="@tag1",
	  monochrome=true,
	  strict=true,
	  dryRun=true
		
)
public class ScenarioRunnerClass {

}
