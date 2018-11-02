package udemy.chrome.cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://play.hbonow.com/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		//we can also delete one cookie
		driver.manage().deleteCookie(null);// I don't know Cookie Name to Pass. So, I just give null.
		driver.manage().getCookieNamed(null);// To get the cookie Name 
	
        
	}

}
