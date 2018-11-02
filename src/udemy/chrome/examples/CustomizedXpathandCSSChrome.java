package udemy.chrome.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CustomizedXpathandCSSChrome {

	public static void main(String[] args) {
		//downloaded new chrome driver for this class.
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/");

		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath(("//input[@name='userLoginId']"))).sendKeys("srinivasgangam@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("reddyyahoo");
		driver.findElement(By.xpath("//*[@class='btn login-button btn-submit btn-small']")).click();
		
		driver.findElement(By.xpath("//div[@data-reactid='19']")).click();

		//driver.close();
	}

}
