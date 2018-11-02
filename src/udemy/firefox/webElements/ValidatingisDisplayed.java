package udemy.firefox.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingisDisplayed {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.southwest.com/");

		System.out.println("Before selecting the Flight Link");
		System.out.println(driver.findElement(By.xpath("//input[@id='trip-type-one-way']")).isDisplayed());
		synchronized (driver) {
			driver.wait(3000);
		}
		driver.findElement(By.xpath("//a[@id='booking-form--hotel-tab']")).click();

		System.out.println("After selecting the Hotel Link");
		System.out.println(driver.findElement(By.xpath("//input[@id='trip-type-one-way']")).isDisplayed());
	}

}
