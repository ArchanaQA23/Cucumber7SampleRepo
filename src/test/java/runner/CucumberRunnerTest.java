package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature",
glue = {"stepDefinations","hooks"},
plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
tags = "@Checkout"
)
public class CucumberRunnerTest {

}
