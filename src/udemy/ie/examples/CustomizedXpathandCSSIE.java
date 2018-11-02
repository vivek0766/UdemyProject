package udemy.ie.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CustomizedXpathandCSSIE {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver",
				"G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.netflix.com/");

		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath(("//input[@name='userLoginId']"))).sendKeys("srinivasgangam@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("reddyyahoo");
		/*boolean x = driver.findElement(By.className("login-remember-me-label-text")).isSelected();
		
		if (x == false){
			driver.findElement(By.className("login-remember-me-label-text")).click();
		}*/
		
		System.out.println(driver.findElement(By.className("login-remember-me-label-text")).isSelected());
		driver.findElement(By.className("login-remember-me-label-text")).click();
		synchronized (driver) {
			driver.wait(5000);
			
		}
		
		
		driver.findElement(By.xpath("//*[@class='btn login-button btn-submit btn-small']")).click();
		synchronized (driver) {
			driver.wait(5000);
			
		}
		System.out.println(driver.findElement(By.className("login-remember-me-label-text")).isSelected());
		

	//	driver.close();

	}

}
