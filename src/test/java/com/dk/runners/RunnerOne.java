package com.dk.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/com/dk/features"},
        glue = {"com.dk.steps"},
        tags = "@facebook or @twitter",
        monochrome = true
)

public class RunnerOne extends AbstractTestNGCucumberTests {

}
