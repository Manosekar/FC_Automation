package webdriver_Project1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_errormessage {
	

	@Test
	
	public  void Login_errormsgTest(){
		WebDriver driver =new FirefoxDriver();
		
		   String mainurl = "http://www.findchips.com";
		   
		   String Expectedurl ="http://www.findchips.com";
		   
		   String ActualTitle ="";
		   
		   driver.get(mainurl);
		   
		   ActualTitle =driver.getTitle();
		   
		   driver.findElement(By.linkText("Sign In")).click();
		   
		  WebElement email= driver.findElement(By.id("email-address"));
		   email.sendKeys("m@yahoo.com");
		   
		   
		  WebElement password= driver.findElement(By.id("password"));
		  password.sendKeys("123456");
		   
		   
		   driver.findElement(By.className("signin")).click();
		   
		   if (ActualTitle.contentEquals(Expectedurl)){
			   System.out.println("Login successful with no error message");
		   }else{
			   System.out.println("Login fails as user name or password is invalid");
		   }

		   
		   driver.quit();
		   
	   }	 
   

}
	
		




