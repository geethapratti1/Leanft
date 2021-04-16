package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Murali\\eclipse-workspace\\LeanFT\\CucumberProj\\src\\test\\resources\\Facebook\\Facebook.feature",
glue = "com.StepDefinition")

public class TestRunnerClass {
	


}
