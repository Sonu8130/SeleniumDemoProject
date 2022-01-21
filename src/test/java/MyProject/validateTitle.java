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

public class validateTitle extends Base {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(validateTitle.class.getName());
	@BeforeTest
	public void setup() throws IOException {
		driver = initializeDriver();
	}
	
	@Test
	public void TitleTest() throws IOException {
		driver.get("http://www.qaclickacademy.com/");
		landingPage l = new landingPage(driver);
		boolean w = l.getTitle().isDisplayed();
		System.out.println(w);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES123");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
