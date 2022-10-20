package com.smarttechqarunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/"	},
		glue = {"com.smarttechqa.stepdef", "com.smarttechqarunner"},	
		plugin = {"pretty","json:target/ cucumber.json" },
		dryRun = true,
		tags  = "@smoke",
		monochrome = true
		
			)

public class FeatureRunner extends AbstractTestNGCucumberTests {

	
	
	
}
