package com.Ultity;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.text.DateFormatter;

import org.openqa.selenium.support.PageFactory;

import com.Constant.constant;
import com.DriverManger.driver_Manager;
import com.PageObject.LoginPage;

public class Commonutils {

	public void loadproperties() {

		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		constant.url = properties.getProperty("Url");
		constant.Browser = properties.getProperty("Browser");
		constant.Username = properties.getProperty("UserName");
		constant.Password = properties.getProperty("Password");
		constant.Product = properties.getProperty("ProductName");
		constant.Firstname = properties.getProperty("Firstname");
		constant.LastName = properties.getProperty("LastName");
		constant.Postcalcode = properties.getProperty("Postcalcode");
		constant.Thanks = properties.getProperty("Thanks");
	}

	public void InitWebElemnet() {

	}

	public String takeScreenshot() {

		String screenshot = System.getProperty("user.dir") + "/src/test/resources/Screenshot/Sauce"+getcurrentdate()+".png";

		File directory = new File(screenshot);
		if (!directory.exists()) {
			directory.mkdirs();
		}
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dimension);
		BufferedImage image = robot.createScreenCapture(rectangle);
		File file = new File(screenshot);
		try {
			ImageIO.write(image, "png", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenshot;

	}

	public static String getcurrentdate() {
		DateFormat dateFormat = new SimpleDateFormat("_MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		String currentdate = dateFormat.format(date);
		return currentdate;
	}

}
