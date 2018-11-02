package udemy.firefox.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpathandCSSFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.netflix.com/");

		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath(("//input[@autocomplete='email']"))).sendKeys("srinivasgangam@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("reddyyahoo");
		driver.findElement(By.xpath("//*[@class='btn login-button btn-submit btn-small']")).click();

	//	driver.close();

	}

}
