package udemy.ie.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver",
				"G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.dcu.org/");
		driver.findElement(By.cssSelector("input[id*='userid']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(Keys.ENTER);

		Thread.sleep(10000l);
		System.out.println("The visible Header is " + driver.findElement(By.xpath("//h1[@id='headerDiv']")).getText());
		driver.findElement(By.xpath("//a[@id='forgotCredentialsLink']")).click();

	}

}
