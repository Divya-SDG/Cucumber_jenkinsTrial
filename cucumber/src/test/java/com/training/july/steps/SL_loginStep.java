package com.training.july.steps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class SL_loginStep {
	
	 private BaseDriverClassStep BaseDriver;

	   
	   public SL_loginStep (BaseDriverClassStep BaseDriver) {
	      this.BaseDriver = BaseDriver;
	   }

	   //WebDriver driver = BaseDriver.getDriver();
	@Given("^user will launch browser  with salesforce  website$")
	public void user_will_launch_browser_with_salesforce_website() throws Throwable {
		//WebDriver driver;
	//	String chromepath="C:\\Users\\divya\\Downloads\\chromedriver_win32\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver",chromepath );
		//WebDriver driver =BaseDriver.getDriver();
		WebDriver driver = BaseDriver.getDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		System.out.println("test case 01 succeful");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	@Then("^enter the value in the username text box$")
	public void enter_the_value_in_the_username_text_box() throws Throwable {
		WebDriver driver = BaseDriver.getDriver();
		driver.findElement(By.id("username")).sendKeys("divyasreegunuru-sgeu@force.com");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

   @Then("^enter the value in the password text box$")
	public void enter_the_value_in_the_password_text_box() throws Throwable {
	   WebDriver driver = BaseDriver.getDriver();
		driver.findElement(By.name("pw")).sendKeys("AmlaSoda1@");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	

	@Then("^click on login  button$")
	public void click_on_login_button() throws Throwable {
		WebDriver driver = BaseDriver.getDriver();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
	

	
}
