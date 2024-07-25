package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/AddtoCart.feature", 
glue = {"com.Step_Definition" }, 
dryRun = false, 
monochrome = false, 
tags = "@Addtocart")

public class runner {

}
