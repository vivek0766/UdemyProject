package udemy.chrome.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.0_1");
		driver.findElement(By.xpath("//td[contains(@class,'indtd')]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//you can perform required operations on alert method.
		//If you have HTML code on Alert Popup Page you can do regular WebDriver operations to get selenium Script work.
		
	}
	

}
