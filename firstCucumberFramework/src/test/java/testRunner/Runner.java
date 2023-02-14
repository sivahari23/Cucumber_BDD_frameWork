package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.SnippetType;
@CucumberOptions(
		features = {"src/test/java/features/login.feature"},
		dryRun =!true,
	//snippets =Snippets.CAMELCASe
				strict=true,glue = "steps",
	 monochrome=true)


public class Runner extends AbstractTestNGCucumberTests {
	
	

}
