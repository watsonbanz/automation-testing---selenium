package Mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CostPerShipment {

	public static void main(String[] args) throws Exception
	{
		WebDriver w=new FirefoxDriver();
		
		float total=0,total1=0;
		
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://qa.grandcanals.com/index.php");
	   // w.manage().window().maximize();
		w.findElement(By.name("email")).sendKeys("4444pritesh@gmail.com");
		w.findElement(By.name("password")).sendKeys("Password@123");
		w.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		w.findElement(By.xpath("html/body/aside/nav/ul/li[5]/a/span")).click();
		Thread.sleep(5000);
		w.findElement(By.xpath("html/body/aside/nav/ul/li[5]/ul/li[1]/a/span")).click();
		Thread.sleep(5000);
		w.findElement(By.xpath("html/body/aside/nav/ul/li[5]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		w.findElement(By.xpath("html/body/div[1]/div[3]/section/div[2]/article/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[1]/a/i")).click();
		Thread.sleep(10000);
		
		Select s=new Select(w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article[1]/div/div/div[2]/div[2]/div[1]/div[2]/span/label/select")));
		s.selectByVisibleText("100");
		Thread.sleep(5000);
		
		List<WebElement> w1=w.findElements(By.xpath("html/body/div[1]/div[3]/section[1]/div/article[1]/div/div/div[2]/div[2]/div[3]/div/div[2]/table/tbody/tr"));
		
		int count = w1.size();
		
		for(int i=1;i<=count;i++)
		{
			String net_amount=w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article[1]/div/div/div[2]/div[2]/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[4]")).getText();
			Thread.sleep(1000);
			String str=net_amount.replace("$", "");

			total=Float.parseFloat(str);
			
			total1=total1+total;
			
		}
		
		System.out.println("Total : "+total1);
		System.out.println("Cost per shipment : "+(total1/count));
		

	}

}
