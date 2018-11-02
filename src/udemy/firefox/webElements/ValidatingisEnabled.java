package udemy.firefox.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingisEnabled {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.southwest.com/");

		System.out.println("Before selecting the Oneway Radio Button");
		System.out.println(driver.findElement(By.xpath("//input[@id='air-date-return']")).isEnabled());
		synchronized (driver) {
			driver.wait(3000);
		}
		driver.findElement(By.xpath("//input[@id='trip-type-one-way']")).click();

		System.out.println("After selecting the Oneway Radio Button");
		System.out.println(driver.findElement(By.xpath("//input[@id='air-date-return']")).isEnabled());
		
		//To validate the object which is present in web or in code.
		int count = driver.findElements(By.xpath("//input[@id='trip-t-one-way']")).size();
		if(count==0){
			System.out.println("Verified");
		}
	}

}
