package AsListsDemo;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Uma-Hari\\eclipse-workspace\\Cucumber\\src\\test\\java\\AsListsDemo\\AsLists.feature",
		glue="AsListsDemo",
		dryRun=false,
		monochrome=true,
		plugin= {"html:html-output"}
		)
public class RunnerClass {

}
