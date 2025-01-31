package com.Step_Definition;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.DriverManger.driver_Manager;
import com.Ultity.Commonutils;

import io.cucumber.java.Before;

public class common_function {

	public static WebDriver driver;
	Commonutils commonutils=new Commonutils();
	Logger logger = Logger.getLogger(common_function.class);

	@Before
	public void before_start_app() {
		logger.info("SauceLabs Test Executed Started");
		try {
			logger.info("Instantiation the CommonUtils");
			//Commonutils commonutils = new Commonutils();
			logger.info("Properties file is loading");
			commonutils.loadproperties();
			logger.info("Check driver is null or not");
			if (driver_Manager.getDriver() == null) {
				driver_Manager.lanuchBrowser();
				commonutils.InitWebElemnet();
			}
		} catch (Exception e) {
			
			logger.error(e);
			commonutils.takeScreenshot();
		}
	}

}
