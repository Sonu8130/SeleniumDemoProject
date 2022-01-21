package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	public WebDriver driver;

	public landingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By signIn = By.xpath("//span[normalize-space()='Login']");
	private By Title = By.xpath("//h2[normalize-space()='Featured Courses']");
	private By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right");

	public WebElement getNavBar() {
		return driver.findElement(NavBar);
	}

	public WebElement getLogin() {
		return driver.findElement(signIn);
	}

	public WebElement getTitle() {
		return driver.findElement(Title);
	}

}
