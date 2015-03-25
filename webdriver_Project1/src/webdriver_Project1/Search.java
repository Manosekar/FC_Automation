package webdriver_Project1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
public class Search {
	

	WebDriver driver =new FirefoxDriver ();
	
	
	@Test
	
	public void searchTest()
	{
		driver.manage().window().maximize() ;
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	String mainurl =("http://www.findchips.com");
	
	driver.get(mainurl);
	
	//SRP page
	
WebElement element= driver.findElement(By.xpath(".//*[@id='part']"));
		element.sendKeys("121");
   
     
   element.submit();
     //clicking the Anchor links
     
     //Authorized
     
  driver.findElement(By.id("anchors-number-authorized")).click();
     
     System.out.println("Authorized Anchor is clicked as expected");
     
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   
     //Independent
     driver.findElement(By.id("anchors-number-independed")).click();
     
     System.out.println("Independent Anchor is clicked as expected");
     
     //Industrial supplies
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     driver.findElement(By.id("anchors-number-industrial-supplies"));
     
     System.out.println("Industrial supplies Anchor is clicked as expected");
       
     
     driver.findElement(By.linkText("Switch to Lite Version")).click();
     
     System.out.println("Light version is clicked as expected");
     
     driver.findElement(By.linkText("Switch to Full Version")).click();
     
     System.out.println("Full version is clicked as expected");
     
     driver.findElement(By.linkText("Detail")).click();
     
     System.out.println("Detail page is clicked as expected");
     
     //Searching a part number from Detail page
     
     driver.findElement(By.id("part")).clear();
     
     WebElement element1 = driver.findElement(By.id("part"));
     
    		 element1.sendKeys("RN-1/4-T2-44.2-1%-R");
     
     element1.submit();
     
     //clicking on "Total stock available thru Find chips"
     
     driver.findElement(By.linkText("2,000")).click();
     
     System.out.println("users in SRP page by clicking total stock");
     
     driver.quit();
     
     
    

   }

}



