package webdriver_Project1;

	
	

	import java.util.Arrays;
	import java.util.Collection;
	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.junit.runners.Parameterized;
	import org.junit.runners.Parameterized.Parameters;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	@RunWith(Parameterized.class)

	public class Parameterized_different_browser {
			 
		    WebDriver driver;
		    public WebDriver browser;
		 
		    public Parameterized_different_browser(WebDriver browser){
		this.browser = browser;
		    }
		 
		    @Parameters
		public static Collection<Object[] > data(){
		    Object[][] data = new Object[][] { { new ChromeDriver() }, { new FirefoxDriver() }};
		    
		    return Arrays.asList (data);
		    }
		
		@Before
		 public void setup(){
			driver=browser;
		}
		
		@After
		public void teardown(){
			driver.quit();
		}
			
	@Test

	public  void login(){

	String mainurl =("http://www.findchips.com");


	driver.get(mainurl);


	driver.findElement(By.linkText("Sign In")).click();

	//email address field 
	 WebElement element = driver.findElement(By.id("email-address"));
	 
	 element.sendKeys("mramasamy@supplyframe.com");
	 
	 //password field
	 
	 WebElement element1 = driver.findElement(By.id("password"));
	 element1.sendKeys("123456");
	 //submitting the form
	 element.submit();
	 
	 //log out
	 driver.findElement(By.id("accountDropDown")).click();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//logging out
		
		driver.findElement(By.linkText("Log Out")).click();
		
	 
		System.out.println("Testing login");
		
		
			
	}

	  }


