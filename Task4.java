package Mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task4 {

	public static void main(String[] args) throws Exception
	{
		String title;
		WebDriver w=new FirefoxDriver();
		w.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		w.get("https://qa.grandcanals.com/");
		w.findElement(By.id("email")).sendKeys("siddharth.shah@grandcanals.com");
	    w.findElement(By.id("password")).sendKeys("XdR5^7YgVc");
		w.findElement(By.id("submit")).click();
  	    w.findElement(By.xpath("html/body/aside/nav/ul/li[9]/a/span")).click();
  	    
  	    List<WebElement> li=w.findElements(By.xpath("html/body/aside/nav/ul/li[9]/ul/li"));
  	    System.out.println(li.size());
  //html/body/aside/nav/ul/li[9]/a/span
  	    //html/body/aside/nav/ul/li[2]/a/span
  	    //html/body/aside/nav/ul/li[9]/ul/li[3]/a
  	    //html/body/aside/nav/ul/li[9]/ul/li[1]/a
  	    //html/body/aside/nav/ul/li[9]/ul/li
  	 
 	for(int i=3;i<li.size();i++)
  	{                      
  	    w.findElement(By.xpath("html/body/aside/nav/ul/li[9]/ul/li["+i+"]/a")).click();
  	    title = w.getTitle();
  	    Thread.sleep(4000);
  	    System.out.println("Page title is: "+title);
  	    String Text=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
  	    Thread.sleep(4000);
  	    System.out.println("hierarchy is:" + Text);
  	    String abc=w.findElement(By.xpath("html/body/div[1]/div[3]/section/div[1]/article/div/header/h2")).getText();
  	    Thread.sleep(4000);
  	    System.out.println("Form Name is:" + abc);
  	}
	}
}
  	   
  	    
  	/*    
  	    w.findElement(By.linkText("Company List")).click();
	    title = w.getTitle();
	    Thread.sleep(4000);
	    System.out.println("Page title is: "+title);
	    String Tex=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + Tex);
	    String ab=w.findElement(By.xpath("html/body/div[1]/div[3]/section/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + ab);
	   
	    
	    
	    
	    w.findElement(By.linkText("Zones")).click();
	    title = w.getTitle();
	    Thread.sleep(4000);
	    System.out.println("Page title is: "+title);
	    String Te=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + Te);
	    String a=w.findElement(By.xpath("html/body/div[1]/div[3]/section/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + a);
	  
	    
	    
	    
	    
	    w.findElement(By.linkText("Service Types")).click();
	    Thread.sleep(4000);
	    title = w.getTitle();
	    System.out.println("Page title is: "+title);
	    String T=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + T);
	    String z=w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + z);
	    
	  
	    
	    
	    w.findElement(By.linkText("Charge Codes")).click();
	    Thread.sleep(4000);
	    title = w.getTitle();
	    System.out.println("Page title is: "+title);
	    String ca=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + ca);
	    String za=w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + za);
	   
	    
	    
	    
	    w.findElement(By.linkText("Usage Analytics")).click();
	    Thread.sleep(4000);
	    title = w.getTitle();
	    System.out.println("Page title is: "+title);
	    String cab=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + cab);
	    String zab=w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + zab);
	   
	    
	    
	    
	    w.findElement(By.linkText("Agreements")).click();
	    Thread.sleep(4000);
	    title = w.getTitle();
	    System.out.println("Page title is: "+title);
	    String cabc=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + cabc);
	
	    
	    
	    
	    w.findElement(By.linkText("Deleted Delivery Time Status")).click();
	    Thread.sleep(4000);
	    title = w.getTitle();
	    System.out.println("Page title is: "+title);
	    String cabcd=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + cabcd);
	    String zabcd=w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + zabcd);
	   
	    
	    
	    
	    w.findElement(By.linkText("Version History")).click();
	    Thread.sleep(4000);
	    title = w.getTitle();
	    System.out.println("Page title is: "+title);
	    String cabcde=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + cabcde);
	    String zabcde=w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + zabcde);
	  
	    
	    
	    
	    
	    w.findElement(By.linkText("Assign Consultant")).click();
	    Thread.sleep(4000);
	    title = w.getTitle();
	    System.out.println("Page title is: "+title);
	    String cabcdef=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + cabcdef);
	    String zabcdef=w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + zabcdef);
	   
	    
	    
	    
	    w.findElement(By.linkText("Fuel Surcharge")).click();
	    Thread.sleep(4000);
	    title = w.getTitle();
	    System.out.println("Page title is: "+title);
	    String cabcdefg=w.findElement(By.xpath("html/body/div[1]/div[2]/div")).getText();
	    Thread.sleep(4000);
	    System.out.println("hierarchy is:" + cabcdefg);
	    String zabcdefg=w.findElement(By.xpath("html/body/div[1]/div[3]/section[1]/div/article/div/header/h2")).getText();
	    Thread.sleep(4000);
	    System.out.println("Form Name is:" + zabcdefg); 
  	    
  	    */
  	    
	//} 

//}
