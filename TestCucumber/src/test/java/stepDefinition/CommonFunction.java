package stepDefinition;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.Ultlity.browserSelection;
import com.Ultlity.commonUlity;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class CommonFunction {

	Logger logger=Logger.getLogger(CommonFunction.class);
	@Before
	public void startApp() {
		
		PropertyConfigurator.configure("./src/test/resources/Config/Log4j.properties");
		logger.info("This Appilcation is SauceLabs WebSite ");
		commonUlity ulity = new commonUlity();
		ulity.loadProperties();
		logger.info("SauceLabs WebSite is started to excute :");
		try {
		if (browserSelection.getDriver() == null) {
			browserSelection.chooseBrowser();
			logger.info("Browser is selected for this App");
		}
		ulity.initelement();
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
	}

	@After
	public void teardown() {
		browserSelection.getDriver().quit();
		logger.info("Application is Excuted successfully");
	}
}
