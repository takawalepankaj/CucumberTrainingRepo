package com.syne.basic.newSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefs {
	
	private static WebDriver driver;
	
	@Before
	public WebDriver getDriver() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","C:\\PankajCucumber\\eclipse\\chromedriver.exe");
		if (driver ==  null) {
		driver = new ChromeDriver();
		
		System.out.println("opned browser");
		Thread.sleep(5000);
		}
		return driver;
	}
	
	
	

}
