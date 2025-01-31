package com.Ultlity;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.support.PageFactory;

import com.Testscenario.AddItems;
import com.Testscenario.CheckingOverview;
import com.Testscenario.CheckoutItem;
import com.Testscenario.Userdetails;
import com.Testscenario.loginPage;

public class commonUlity {

	public void loadProperties() {

		Properties properties = new Properties();
		try {
			// properties.load(getClass().getResourceAsStream("src/main/resources/Config/Config.properties"));
			properties.load(getClass().getClassLoader().getResourceAsStream("Config/Config.properties"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Constant.Url = properties.getProperty("Url");
		Constant.Browser = properties.getProperty("Browser");
		Constant.Purchaseitems = properties.getProperty("Purchaseitems");
		
		
		
	}

	public void initelement() {

		PageFactory.initElements(browserSelection.getDriver(), loginPage.getLoginPage());
		PageFactory.initElements(browserSelection.getDriver(), AddItems.getaddItems());
		PageFactory.initElements(browserSelection.getDriver(), CheckoutItem.getCheckoutItem());
		PageFactory.initElements(browserSelection.getDriver(), Userdetails.getUserdetails());
		PageFactory.initElements(browserSelection.getDriver(), CheckingOverview.getcheckingOverview());
	}

	public static String getscreenshot() {

		  String directoryPath = System.getProperty("user.dir") + "/src/test/resources/Screenshot/";
	        File directory = new File(directoryPath);

	        // Create directory if it does not exist
	        if (!directory.exists()) {
	            directory.mkdirs();
	        }

	        // Define the screenshot file path with a timestamp
	        String screenshotPath = directoryPath + "Screenshot_" + getCurrentime() + ".png";
	        File file = new File(screenshotPath);
		Robot robot = null;
		try {
			robot = new Robot();

		} catch (AWTException e) {

			e.printStackTrace();
		}
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(dimension);
		BufferedImage image=	robot.createScreenCapture(rectangle);
		try {
			ImageIO.write(image, "png", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenshotPath;
	}

	public static String getCurrentime() {
		DateFormat dateFormat = new SimpleDateFormat("_MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		String Currentime = dateFormat.format(date);
		return Currentime;
	}
}
