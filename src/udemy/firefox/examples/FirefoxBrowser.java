package udemy.firefox.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	public static void main(String []args){
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=9Nz75nOVzKI");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
