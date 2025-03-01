package TestRunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features= {"src/test/java/FeatureFile/tutorial123.feature",
					"src/test/java/FeatureFile/tutorial124.feature"},
		    glue="StepDefinationFile",
			monochrome= true,
			dryRun=false
		   
			)
	public class TestRunnerClass extends AbstractTestNGCucumberTests {
	
}
 