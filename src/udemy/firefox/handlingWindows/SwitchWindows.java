package udemy.firefox.handlingWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		
		//Website to work on Switching Windows --> http://toolsqa.wpengine.com/automation-practice-switch-windows/
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Before selecting New Window Button");
		System.out.println("The Title is "+driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		
		WebDriverWait windowWait = new WebDriverWait(driver, 20);
		windowWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(@class,'cp-submit-wrap-full col-md-12 col-lg-12 col-sm-12 col-xs-12')]//div[contains(@class,'')]"))));

		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> iterator = window.iterator();
		String parentwindow =iterator.next();
		String childWindow= iterator.next();
	
		System.out.println("After selecting Button");
		System.out.println("The Title is "+driver.getTitle());
		driver.switchTo().window(childWindow);
		System.out.println("The Script is now handling child Window");
		System.out.println("The Title is "+driver.getTitle());
		
		driver.switchTo().window(parentwindow);
		System.out.println("Now the script is coming back to Parent Window");
		System.out.println("The Title of parent window is -"+driver.getTitle());
		driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
		WebDriverWait tabWait = new WebDriverWait(driver, 15);
		
		tabWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Register Seat')]"))));
		Thread.sleep(10000L);
		driver.findElement(By.xpath("//span[contains(text(),'Register Seat')]")).click();
		
	}

}
