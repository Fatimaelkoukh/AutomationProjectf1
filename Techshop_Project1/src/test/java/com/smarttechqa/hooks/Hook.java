package com.smarttechqa.hooks;

import com.Smarttechqa.basepage.BaseClass;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {

	@Before
	public static void initialize() {
	BaseClass.setUp();
	
	}	
	
	@After
	public static void tearDown() {
		driver.quit();
			
	}
	
}

