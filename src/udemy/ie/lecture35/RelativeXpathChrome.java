package udemy.ie.lecture35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.westernunion.com");
	//	driver.findElement(By.xpath("//a[@id='menu-login']")).click(); //relative Xpath.
		// Above example for relative xPath but Log in OBJECT in web page have two matching xpaths are present. so it not good to use.
		//so, i am taking xpath using regular Expression of exact login link //ul[@class='nav nav-tabs tab-menu']/li[8]/a 
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs tab-menu']/li[8]/a")).click(); //Regular expression
		
		driver.close();

	}

}
