package PortalTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import portal.login.Login;

public class VerifyPortalLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://dev.fielddata.io/portal/projects/my-projects");

		Login login = new Login(driver);

		login.typeUserName("watson.banz@bauer.de");
		login.typePassword("P@ssw0rd");
		login.clickonLoginButton();

		driver.quit();

	}

}
