package com.DriverManger;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Constant.constant;



import io.github.bonigarcia.wdm.WebDriverManager;

public class driver_Manager {

	private static WebDriver driver=null;
	
	static Logger logger = Logger.getLogger(driver_Manager.class);
	public static void lanuchBrowser() {
		try {
		switch (constant.Browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			logger.info("Lanching" + constant.Browser);
			driver=new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			logger.info("Lanching" + constant.Browser);
			driver=new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			logger.info("Lanching" + constant.Browser);
			driver=new InternetExplorerDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			logger.info("Lanching" + constant.Browser);
			driver=new ChromeDriver();
			break;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		driver.navigate().to(constant.url);
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
