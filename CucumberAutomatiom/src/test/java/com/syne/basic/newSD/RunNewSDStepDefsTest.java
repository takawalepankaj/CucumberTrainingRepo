package com.syne.basic.newSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features={"src/test/resources/com/syne/basic/newSD/"},
					glue={"com/syne/basic/newSD/"}
					,monochrome = true //console output in readable format
//					,dryRun = true
					,plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+1+".json"
							,"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
					}
					)

public class RunNewSDStepDefsTest {

}
