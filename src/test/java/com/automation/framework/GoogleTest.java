package com.automation.framework;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	
    private static final Logger logger = LogManager.getLogger(GoogleTest.class);
	
	@BeforeTest
	public void beforeTest() {
		logger.error("before Test ");
	}
	
	@BeforeClass
	public void beforeClass() {
		logger.info("before Class ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		logger.info("before Method ");
	}
	
	@Test
	public void clickSerchButton() {
		logger.info("on click of google search button ");
	}

}
