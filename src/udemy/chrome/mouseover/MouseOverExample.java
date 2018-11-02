package udemy.chrome.mouseover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverExample {

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dcu.org/");
		
		Actions a = new Actions(driver) ;
		a.moveToElement(driver.findElement(By.linkText("Realty"))).build().perform();
		a.contextClick();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Below is for sending keys in CAPS by Holding shift Button 
		a.moveToElement(driver.findElement(By.xpath("//input[@class='searchInput']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			
	}
}
