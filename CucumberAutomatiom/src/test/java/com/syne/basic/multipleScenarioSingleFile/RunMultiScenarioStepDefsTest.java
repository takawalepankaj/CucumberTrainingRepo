package com.syne.basic.multipleScenarioSingleFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features={"src/test/resources/com/syne/basic/multipleScenarioSingleFile/"},
					glue={"com/syne/basic/multipleScenarioSingleFile/"}
					,monochrome = true //console output in readable format
//					,dryRun = true
					,plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+1+".json"
							,"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
					}
					)

public class RunMultiScenarioStepDefsTest {

}
