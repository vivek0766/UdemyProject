package udemy.firefox.handlingWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		//Website to work on Switching Windows --> http://toolsqa.wpengine.com/automation-practice-switch-windows/
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		System.out.println("Before selecting New Browser Tab Button");
		System.out.println("The Title is " + driver.getTitle());
		
		String parentTab = driver.getWindowHandle();
		System.out.println(parentTab);
		Thread.sleep(20000L);
		driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
		String childTab = driver.getWindowHandle();
		Thread.sleep(15000L);
		for(String windowsHanlings:driver.getWindowHandles()){
		driver.switchTo().window(parentTab);
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("After selecting New Browser Tab Button");
		System.out.println("The Title is " + driver.getTitle());
//		Thread.sleep(10000L);
//		driver.switchTo().window(childTab);
		}
	}

}
