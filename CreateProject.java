package portal.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProject {

	WebDriver driver;

	public CreateProject(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dev.fielddata.io/portal/projects/project-editor/create");
	}

	@FindBy(xpath = "//body[@class='fd-portal-app']/portal-root/div[@class='fd-portal-app-container']/portal-project-editor[@class='ng-star-inserted']/div[@class='project-editor-router-container']/portal-project-form[@class='ng-star-inserted']/form[@class='container ng-pristine ng-invalid ng-touched']/div[@class='row']/div[@class='form-container column']/div[2]/div[1]/input[1] ")
	WebElement ProjectName;

	@FindBy(xpath = "//div[@class='column one-of-two ng-pristine ng-invalid ng-touched']//input[@placeholder='street']")
	WebElement ProjectAddress;

	@FindBy(xpath = "//div[@class='row one-of-two']//div[@class='column one-of-two']//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
	WebElement ProjectShortName;

	@FindBy(xpath = " //div[@class='row one-of-two ng-pristine ng-invalid ng-touched']//div[1]//input[1]")
	WebElement ZipCode;

	@FindBy(xpath = "//div[@class='row one-of-two ng-pristine ng-invalid ng-touched']//div[2]//input[1]")
	WebElement City;

	@FindBy(xpath = "//div[@class='row one-of-two ng-pristine ng-invalid ng-touched']//input[@placeholder='Pick one']")
	WebElement Country;

	@FindBy(xpath = "//input[@class='form-control mat-autocomplete-trigger ng-untouched ng-pristine ng-invalid']")
	WebElement Status;

	@FindBy(xpath = "//div[@class='column one-of-two']//input[@placeholder='Pick one']")
	WebElement ProjectManager;

	@FindBy(xpath = "//body[@class='fd-portal-app']/portal-root/div[@class='fd-portal-app-container']/portal-project-editor[@class='ng-star-inserted']/div[@class='project-editor-router-container']/portal-project-form[@class='ng-star-inserted']/form[@class='container ng-pristine ng-invalid ng-touched']/div[@class='row']/div[@class='form-container column']/div[5]/div[2]/input[1]")
	WebElement Description;

	@FindBy(xpath = "//div[7]//div[1]//input[1]")
	WebElement ClientName;

	@FindBy(xpath = "//body[@class='fd-portal-app']/portal-root/div[@class='fd-portal-app-container']/portal-project-editor[@class='ng-star-inserted']/div[@class='project-editor-router-container']/portal-project-form[@class='ng-star-inserted']/form[@class='container ng-pristine ng-invalid ng-touched']/div[@class='row']/div[@class='form-container column']/div[8]/div[1]/input[1] ")
	WebElement ContactPerson;

	@FindBy(xpath = "//button[@class='button emphasis-h']")
	WebElement Save;

	public void createProjectStuffs(String pn, String pa, String psn, String zc, String cty, String ctry, String sts,
			String pm, String Desc, String cname, String cPerson) {

		ProjectName.sendKeys(pn);
		ProjectAddress.sendKeys(pa);
		ProjectShortName.sendKeys(psn);
		ZipCode.sendKeys(zc);
		City.sendKeys(cty);
		Country.sendKeys(ctry);
		Status.sendKeys(sts);
		ProjectManager.sendKeys(pm);
		Description.sendKeys(Desc);
		ClientName.sendKeys(cname);
		ContactPerson.sendKeys(cPerson);
	}
}
