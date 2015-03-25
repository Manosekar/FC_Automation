package webdriver_Project1;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)



	public  class ParameterizedTestcase {
		//2.Declaring parameters Globally
		
		public String email ;
		public String password;
		
		//3.Declaring constructors

	public ParameterizedTestcase(String emailaddress,String password){
			
			this.email=emailaddress;
			this.password=password;
			
		
		}
		
		 
		//4.writing annotation @ the rate parameters(object array)
		
		@Parameters
		public static Collection<Object[]> getData(){
			
			//no of rows=no of times repeating the test
			//no of cols =no of parameters that I want to pass
			
			Object [][] data =new Object[2] [2];
			
			//1st row
			data[0][0] ="mramasamy@supplyframe.com";
			data[0][1] ="123456";
			
			
			//2nd row
			data[1][0] ="abc20@abc.com";
			data[1][1] ="123456";
			
	
			
			
			return Arrays.asList (data);
			
		
		}
		
			
		
	@Test
		public  void login(){
		
		WebDriver driver  =new FirefoxDriver();
		
		driver.manage().window().maximize() ;
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		String mainurl =("http://www.findchips.com");
		
		
		driver.get(mainurl);
		

		driver.findElement(By.linkText("Sign In")).click();
		
		//email address field 
		 WebElement element = driver.findElement(By.id("email-address"));
		 
		 element.sendKeys(email);
		 
		 //password field
		 
		 WebElement element1 = driver.findElement(By.id("password"));
		 element1.sendKeys(password);
		 //submitting the form
		 element.submit();
		 
		 //log out
		 driver.findElement(By.id("accountDropDown")).click();
			
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
			//logging out
			
			driver.findElement(By.linkText("Log Out")).click();
			
		 
			System.out.println("Login is successful");
			
			driver.close();
		}
	
	

	}



