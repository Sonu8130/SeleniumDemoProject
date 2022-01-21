package MyProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.landingPage;
import resources.Base;

public class validateNavBar extends Base {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(validateNavBar.class.getName());

	@BeforeTest
	public void setup() throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void NavBarTest() {
		driver.get(prop.getProperty("url"));

		landingPage l = new landingPage(driver);
		Assert.assertTrue(l.getNavBar().isDisplayed());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
