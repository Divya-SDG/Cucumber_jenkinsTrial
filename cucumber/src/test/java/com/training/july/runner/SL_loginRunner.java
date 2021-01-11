package com.training.july.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*@CucumberOptions(
 features = "C:\\Users\\divya\\eclipse-workspace\\cucumber\\src\\test\\resources\\features\\SL_Login.feature"
 ,glue={"com.training.july.steps"}
 )*/
@CucumberOptions(
		 features = "C:\\Users\\divya\\eclipse-workspace\\cucumber\\src\\test\\resources\\features"
		 ,tags="@smoke, @Regression"
		 )

		
public class SL_loginRunner {

}
