package com.training.july.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class BaseDriverClassStep {
	 

	private static boolean initialized = false;

	   private WebDriver driver;

	   @Before
	   public void setUp() throws Exception {
	      if (!initialized) {
	         // initialize the driver
	    	String chromepath="C:\\Users\\divya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
	  		System.setProperty("webdriver.chrome.driver",chromepath );
	         driver =  new ChromeDriver();

	         initialized = true;
	      }
	   }

	   public WebDriver getDriver() {
	      return driver;
	   }
	}

