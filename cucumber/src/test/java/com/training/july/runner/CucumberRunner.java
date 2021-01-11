package com.training.july.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\divya\\eclipse-workspace\\cucumber\\src\\test\\resources\\features\\SampleCucumber.feature"
 ,glue={"com.training.july.steps"}
 )
public class CucumberRunner {
	 
}
