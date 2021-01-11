package com.training.july.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Sl_checkBoxStep   {

	private BaseDriverClassStep BaseDriver;

	   
	   public Sl_checkBoxStep (BaseDriverClassStep BaseDriver) {
	      this.BaseDriver = BaseDriver;
	   }
	   
	@Then("^click  on remember me check box$")
	public void click_on_remember_me_check_box() throws Throwable {
		WebDriver driver = BaseDriver.getDriver();
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
	
}
