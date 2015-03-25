package webdriver_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HttpsTesting {

	public static void main(String[] args) {
		
		FirefoxProfile profile = new FirefoxProfile();
		 
		profile.setAcceptUntrustedCertificates(true);
		 
		WebDriver driver = new FirefoxDriver(profile);
		
		String url =("https://qa.findchips.com/register");
		 
		driver.get(url);
		 

	}

}
