package Inportia.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "Features",
		glue = "Inportia/Cucumber/StepDefination",
		//tags = {""},
		plugin = { "pretty", "html:target/cucumber", "json:target_json/cucumber.json"}
)

public class App 
{
   
	
}
