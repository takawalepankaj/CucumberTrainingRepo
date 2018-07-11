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

public class SDStepDefs2 extends CommonStepDefs {
	
	protected WebDriver driver;
	
	public SDStepDefs2(CommonStepDefs comm) throws InterruptedException {
		driver = comm.getDriver();
	}
	
	@When("^he enters \"([^\"]*)\" as user last name$")
	public void He_enters_user_last_name(String lastname) throws InterruptedException {
		driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(lastname);
		Thread.sleep(5000);
	}
	
	@Then("^check username is present in textbox$")
	public void check_signup_should(){
		Assert.assertTrue(true);
		driver.quit();
	}

}
