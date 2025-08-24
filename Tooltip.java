package Mypackage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Tooltip {

	public static void main(String[] args) throws Exception
	{
	  WebDriver w=new FirefoxDriver();
	  w.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  w.get("https://staging.grandcanals.com/index.php");
	  w.findElement(By.id("email")).sendKeys("swapnil.dhasal@grandcanals.com");
	  w.findElement(By.id("password")).sendKeys("Swapnil@123");
	  w.findElement(By.id("submit")).click();
	  w.findElement(By.xpath("html/body/aside/nav/ul/li[2]/a/span")).click();
	  Thread.sleep(4000);
	  
	  /*
	  Actions a=new Actions(w);
      a.moveToElement(w.findElement(By.xpath("html/body/div[1]/div[3]/section/div[1]/article[1]/div[1]/div/div[2]/div/canvas[2]"))).perform();
	  List<WebElement> li=w.findElements(By.id("flotTip"));
	  System.out.println(li.size());
	  for(int i=0;i<li.size();i++)
	  System.out.println(li.get(0).getText());
	  System.out.println("\n");
	  */
	  
	  
	      Actions a=new Actions(w);
	      a.moveToElement(w.findElement(By.xpath("html/body/div[1]/div[3]/section/div[1]/article[2]/div[1]/div/div[2]/div/canvas[2]"))).perform();
	 	  List<WebElement> li=w.findElements(By.xpath("html/body/div[1]/div[3]/section/div[1]/article[2]/div[1]/div/div[2]/div/span"));
	 	  System.out.println(li.size());
	 	  for(int i=1;i<=li.size();i++)
	 	  {
	 	  String abc=	w.findElement(By.xpath("html/body/div[1]/div[3]/section/div[1]/article[2]/div[1]/div/div[2]/div/span["+i+"]/div")).getText();
	 	  System.out.println("Information is="+abc);
	 	  Thread.sleep(5000);
	 	  }
	      System.out.println("\n");
	      
	 	  
	 	  w.findElement(By.xpath("html/body/div[1]/div[3]/section/div[1]/article[2]/div[1]/div/div[2]/div/canvas[2]")).click();
	 	  List<WebElement> l=w.findElements(By.xpath("html/body/div[1]/div[3]/section/div[2]/article/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[2]"));	 
	 	  System.out.println(l.size());
	 	  
	 	 List<WebElement> least=w.findElements(By.xpath("html/body/div[1]/div[3]/section/div[2]/article/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[3]"));
	 	  System.out.println(least.size());
	 	  
	 	  System.out.println("Zone          Shipment Count");
	 	  System.out.println("==============================");
	 	  
	 	  for(int c=2;c<=l.size();c++)
	 	  {
	 		  String ab=w.findElement(By.xpath("html/body/div[1]/div[3]/section/div[2]/article/div/div/div[2]/div[2]/div[2]/table/tbody/tr["+c+"]/td[2]")).getText();
	 		//  System.out.println("zone is="+ab);
	 	  
	 	 
	 		  String xyz=w.findElement(By.xpath("html/body/div[1]/div[3]/section/div[2]/article/div/div/div[2]/div[2]/div[2]/table/tbody/tr["+c+"]/td[3]")).getText();
              System.out.println(ab+"             "+xyz);
	 	  }
	}
}

	  
	  
	  
	  
	  

	



