package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//plugin = pretty is used to generate console detail output.
//plugin = html:target/CucumberReports/CucumberReport.html/ used to generate html report (In target folder)
//publish = true used to display/publish your report on cloud ,you can share url with your team member , you will get the url "https://reports.cucumber.io/reports/aa0269b5-2d9a-4a6e-8fb7-116329c9b0fe"
//after running your test runner class
@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features",
				 glue = {"stepdefinations" ,"hooks"	},
				 plugin = { "pretty" , "html:target/CucumberReports/CucumberReport.html/" },
				 publish = true)
public class TestRunner {

}
