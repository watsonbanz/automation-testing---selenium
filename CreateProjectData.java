package PortalTestCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import portal.login.CreateProject;

public class CreateProjectData {

	static WebDriver driver;
	
	@Test
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.fielddata.io/portal/projects/my-projects");
	
		CreateProject createProject = PageFactory.initElements(driver,CreateProject.class);
		createProject.createProjectStuffs(pn, pa, psn, zc, cty, ctry, sts, pm, Desc, cname, cPerson); // <-- Provide required value in doube quotes
	}	
}
