package Runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	  features="src/test/java/feature1",
	  glue="StepDefinition",
	  tags="@smoke2",
	  monochrome=true,
	  strict=true,
	  dryRun=true
		
)

public class deleteRun {

}
