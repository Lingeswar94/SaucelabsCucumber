package com.Ultlity;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class browserSelection {

	public static WebDriver driver = null;

	static Logger logger = Logger.getLogger(browserSelection.class);

	public static void chooseBrowser() {

		try {
			switch (Constant.Browser) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				logger.info("Lanching" + Constant.Browser);
				break;
			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				logger.info("Lanching" + Constant.Browser);
				break;
			default:
				// System.out.println("Driver is not found");
				logger.info("Driver is not found" + Constant.Browser);
				break;
			}
		}

		catch (Exception e) {
			logger.error(e.getMessage());

		}

		driver.manage().window().maximize();
		driver.navigate().to(Constant.Url);

	}

	public static WebDriver getDriver() {
		return driver;
	}
}
