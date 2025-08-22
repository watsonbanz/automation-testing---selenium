package portal.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	By username = By.name("email");
	By password = By.name("password");
	By Loginbutton = By.name("submit");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void typeUserName(String uname) {
		driver.findElement(username).sendKeys("watson.banz@bauer.de");
	}

	public void typePassword(String pwd) {
		driver.findElement(password).sendKeys("P@ssw0rd");
	}

	public void clickonLoginButton() {
		driver.findElement(Loginbutton).click();
	}

}
