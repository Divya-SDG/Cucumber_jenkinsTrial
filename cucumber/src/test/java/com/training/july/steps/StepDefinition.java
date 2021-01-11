package com.training.july.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class StepDefinition {
	WebDriver driver;
	@Given("^user will launch browser  with selenuim website$")
	public void user_will_launch_browser_with_selenuim_website() throws Throwable {
		
		String chromepath="C:\\Users\\divya\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath );
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}

	@When("^enter the value in the search  selenuim text box$")
	public void enter_the_value_in_the_search_selenuim_text_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("cucumber");
	  //  throw new PendingException();
	}

	@Then("^click on Go button$")
	public void click_on_Go_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@class='nav-item'][contains(text(),'Blog')]")).click();
	}

}
