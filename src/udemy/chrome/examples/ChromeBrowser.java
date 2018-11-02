package udemy.chrome.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[1]/svg")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.close();

	}

}
