package webdriver_Project1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class login_test {
	
	WebDriver driver =new FirefoxDriver();
	
	
	@Before 

	public void Register_FCTest()

	{
		
			
				String mainurl= ("http://www.findchips.com");
				driver.manage().window().maximize();
				driver.get(mainurl);
				
				driver.findElement(By.linkText("Register")).click();
			
				//Finding email address
				
				WebElement element = driver.findElement(By.id("email-address"));
			   element.sendKeys("abc27@abc.com");
				//timeout
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//password element
			    WebElement element1= driver.findElement(By.id("password"));
			    	element1.sendKeys("123456");
		
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//confirm password element
				WebElement element2 = driver.findElement(By.id("confirm-password"));
			element2.sendKeys("123456");
				
				//privacy policy
			 driver.findElement(By.name("confirm-privacy")).click();
			
			
	             element.submit();
				//clicking the modal window 
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.findElement(By.linkText("OK")).click();
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				//Account drop down click
				
				driver.findElement(By.id("accountDropDown")).click();
				
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				
				//logging out
				
				driver.findElement(By.linkText("Log Out")).click();
				
			System.out.println("Registeration is  sucess");
		   }
		
		
		@Test
			
			
	public void signin_FcTest(){
				
				 
					
					driver.findElement(By.linkText("Sign In")).click();
					
					//email address field 
					 WebElement element = driver.findElement(By.id("email-address"));
					 
					 element.sendKeys("mramasamy@supplyframe.com");
					 
					 //password field
					 
					 WebElement element1 = driver.findElement(By.id("password"));
					 element1.sendKeys("123456");
					 //submitting the form
					 element.submit();
					 
					 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
					 
					 //clicking on Account section
					 
					 
				
				System.out.println("Sign in is success");
	  
	  }
		
			
			@After
			
			public void AccountTest(){
				

				 
				driver.findElement(By.id("accountDropDown")).click();
				 
				 //clicking the "Account" menu
				
				driver.findElement(By.linkText("Account")).click();
				 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				 
				 //clicking on update password
				 
		  driver.findElement(By.linkText("Update Password")).click();
			   
			   //updating password using element "name"
			   
			   WebElement element3 =driver.findElement(By.name("password"));
			 element3.sendKeys("123456");
			 driver.manage().timeouts().setScriptTimeout(500, TimeUnit.SECONDS);
			 
			 WebElement element4 =driver.findElement(By.name("newPassword"));
			 element4.sendKeys("1234567");
			 driver.manage().timeouts().setScriptTimeout(500, TimeUnit.SECONDS);
			 
			 WebElement element5 =driver.findElement(By.name("newPasswordConfirm"));
			 element5.sendKeys("1234567");
			 driver.manage().timeouts().setScriptTimeout(500, TimeUnit.SECONDS);
			 
			 element3.submit();
			 
			 System.out.println("Password is updated");
			 
			//Preference section
			 
			 driver.findElement(By.linkText("Preferences")).click();
				
				//checking on In-stock
			 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				
				driver.findElement(By.className("j-in-stock")).click();
				
				//checking on Exact Matches checkbox
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				
				driver.findElement(By.className("j-exact-match")).click();
					
			
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				
				//Selecting the drop down value(by creating new method)
				
				Select dropdown = new Select(driver.findElement(By.className("j-currency")));
				
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				
				dropdown.selectByValue("Default");
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				
				driver.findElement(By.linkText("Save")).click();
				
				System.out.println("Preference checkbox checked as expected");
				
				
				//logging out 
				
	driver.findElement(By.id("accountDropDown")).click();
				
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				
				//logging out
				
				driver.findElement(By.linkText("Log Out")).click();
				
			  driver.close();
			 
				

			}

		

	}


