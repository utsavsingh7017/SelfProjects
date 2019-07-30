package Qainfotch.CucumberWithSeleniumEx1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"Qainfotch.CucumberWithSeleniumEx1"})	
public class Runner {
	
}


