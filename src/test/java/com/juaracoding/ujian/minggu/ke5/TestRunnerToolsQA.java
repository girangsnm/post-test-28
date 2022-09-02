package com.juaracoding.ujian.minggu.ke5;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ToolsQA/01.ToolsQA.Login.feature",
				glue = "",
				plugin = {"pretty","html:target/cucumber-reports.html"})

public class TestRunnerToolsQA extends AbstractTestNGCucumberTests {

}
