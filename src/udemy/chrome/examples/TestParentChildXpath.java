package udemy.chrome.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestParentChildXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://www.westernunion.com");
		driver.findElement(By.xpath("//a[@id='menu-wu-logo']/div/img")).click();
		
		//if we need to use wait on WebDriver. You can only wait on an object if you've acquired the lock for it using synchronized.
		synchronized (driver) {
			driver.wait(5000);	
		}
			
		driver.findElement(By.xpath("//div[@class='rmt-downloadApp']/a[1]/img")).click();
		
		driver.close();

	}

}
