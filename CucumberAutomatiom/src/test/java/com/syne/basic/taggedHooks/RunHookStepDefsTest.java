package com.syne.basic.taggedHooks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features = { "src/test/resources/com/syne/basic/taggedHooks/" }, 
					glue = {"com/syne/basic/taggedHooks" }, 
					monochrome = true, // console output in readable format
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+193+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
					}
					)

public class RunHookStepDefsTest {

}
