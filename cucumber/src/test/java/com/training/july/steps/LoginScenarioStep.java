package com.training.july.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginScenarioStep {
	private BaseDriverClassStep BaseDriver;

	   
	   public LoginScenarioStep(BaseDriverClassStep BaseDriver) {
	      this.BaseDriver = BaseDriver;
	   }
	
	   @Then("^enter valid username \"([^\"]*)\"$")
	   public void enter_valid_username(String arg1) throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	      // throw new PendingException();
		   
		   WebDriver driver = BaseDriver.getDriver();
			driver.findElement(By.id("username")).sendKeys(arg1);
		  }
	   
	   @Then("^enter valid password \"([^\"]*)\"$")
	   public void enter_valid_password(String arg1) throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	     //  throw new PendingException();
		   WebDriver driver = BaseDriver.getDriver();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg1);  
	   }


	   }  
	
	
	
  
	

	

	
	
	


