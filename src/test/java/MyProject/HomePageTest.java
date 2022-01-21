package MyProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.Base;

public class HomePageTest extends Base {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());

	@BeforeTest
	public void setup() throws IOException {
		driver = initializeDriver();
		log.info("Driver initialized");
	}

	@Test
	public void loginTest() {
		driver.get("http://www.qaclickacademy.com/");
		log.info("Navigated to QAclick Academy");
		landingPage l = new landingPage(driver);
		l.getLogin().click();
		log.info("clicked on Login button");
		loginPage lp = new loginPage(driver);
		lp.getEmail().sendKeys("abc@gmail.com");
		log.info("Entered Email");
		lp.getPassword().sendKeys("abc@123");
		log.info("Entered Password");
		lp.getLogin().click();
		log.info("Clicked on login button");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
