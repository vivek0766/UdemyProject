package udemy.ie.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver",
				"G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.dcu.org/");
		driver.findElement(By.cssSelector("input[id*='userid']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(Keys.ENTER);

		 WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("//span[@id='ifs-button-1009-btnInnerEl']"))));
		 //wait.until(ExpectedConditions.textToBe(driver.findElement(By.cssSelector("label[class*='user-label']")), "Member Number"));
     //    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='bluelink heading-l3 bold outline-cls']"))));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.linkText("I can't access my account")), "access"));
         //Thread.sleep(10000l);
		System.out.println("The visible Header is " + driver.findElement(By.xpath("//h1[@id='headerDiv']")).getText());
		driver.findElement(By.xpath("//a[@id='forgotCredentialsLink']")).click();
	}
}
