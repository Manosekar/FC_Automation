package webdriver_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hey {
	
	public static void main(String args[]){
	
	WebDriver driver =new FirefoxDriver();
	
	String mainurl ="http://www.findchips.com";
	
	String currentUrl;
	
	driver.get(mainurl);
	
	currentUrl =driver.getCurrentUrl();
	
	if (mainurl == currentUrl){
		
		System.out.println("Working");
	}else{
		System.out.println("not working");
		
		driver.close();
	}
	
	
	
	
	
	}
	 

}

