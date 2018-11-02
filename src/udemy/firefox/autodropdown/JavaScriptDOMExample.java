package udemy.firefox.autodropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptDOMExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cheapoair.com/");
		//To check iframe element is present in webPage or Not
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println("the count is " + count);
		
	//	driver.findElement(By.xpath("//div[@id='ember768']//a[@class='suggestion-box__clear icon ic-cancel-fill']")).click();

		if (driver.findElement(By.xpath("//div[@id='ember768']")).isSelected()) {
		} else {
			driver.findElement(By.xpath("//div[@id='ember768']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='ember768']//input[@id='ember769']")).sendKeys("sa");
			driver.findElement(By.xpath("//div[@id='ember768']//input[@id='ember769']"))
					.sendKeys(Keys.DOWN);
			driver.findElement(By.xpath("//div[@id='ember768']//input[@id='ember769']"))
					.sendKeys(Keys.DOWN);
			driver.findElement(By.xpath("//div[@id='ember768']//input[@id='ember769']"))
					.sendKeys(Keys.DOWN);
//			driver.findElement(By.xpath("//div[@id='ember768']//input[@id='ember769']"))
//					.sendKeys(Keys.ENTER);
			// Here The Drop downs are working by mouse over on them also. so below code is by mouse over on element.
			
			System.out.println(driver
					.findElement(By.xpath("//div[@id='ember768']//input[@id='ember769']")).getText());
			// The tag is in hidden Mode so you can not see Text of it in Console.
			// To get text we need to work on JavaScript HTML DOM.
			
			JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
			String script = "reutrn document.getElementByClassName(\"form-control input-lg ember-view ember-text-field\").value;";
			
			String text =(String) jsExecutor.executeScript(script);
			System.out.println(text);
			Thread.sleep(5000);
			driver.close();
		}

	}
}
