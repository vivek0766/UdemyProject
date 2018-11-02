package udemy.chrome.lecture43.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.westernunion.com/us/en/home.html");
		driver.findElement(By.linkText("Log in")).click();

		System.out.println(driver.findElement(By.xpath("//div[@class='hidden-xs col-sm-12 checkbox text-right']/label/input")).isSelected());
		
		driver.findElement(By.xpath("//div[@class='hidden-xs col-sm-12 checkbox text-right']/label/input")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='hidden-xs col-sm-12 checkbox text-right']/label/input")).isSelected());
		

	}

}
