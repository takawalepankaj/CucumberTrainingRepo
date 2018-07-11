package com.syne.basic.dataTable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/com/syne/basic/dataTable" }, 
					glue = {"com/syne/basic/dataTable/" }, 
					monochrome = true, // console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+91244+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
							
					}
					)

public class RunDataTablerStepDefsTest {

}
