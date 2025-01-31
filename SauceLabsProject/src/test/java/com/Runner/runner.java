package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = {
		"com.Step_Definition" }, dryRun = false, monochrome = true, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class runner {

}
