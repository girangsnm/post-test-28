package com.juaracoding.postTest26;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
				features = {"src/test/resources/demoqa/search.feature",
							"src/test/resources/demoqa/02.search.feature",
							"src/test/resources/demoqa/checkout.feature"},
				glue ="com.juaracoding.postTest26",
				plugin = {"pretty", "html:target/cucumber-reports.html"})
public class TestShopRunner extends AbstractTestNGCucumberTests {
	
	

}
