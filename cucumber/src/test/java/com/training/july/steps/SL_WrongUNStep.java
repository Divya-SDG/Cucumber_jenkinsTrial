package com.training.july.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;

public class SL_WrongUNStep {
	private BaseDriverClassStep BaseDriver;

	   
	   public SL_WrongUNStep (BaseDriverClassStep BaseDriver) {
	      this.BaseDriver = BaseDriver;
	   }
	@Then("^enter the wrong  value in the username text box$")
	public void enter_the_wrong_value_in_the_username_text_box() throws Throwable {
		WebDriver driver = BaseDriver.getDriver();
		driver.findElement(By.id("username")).sendKeys("popmusic@gmail.com");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	}
