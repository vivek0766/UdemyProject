package udemy.chrome.framesdragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesExample {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().fullscreen();

		System.out.println("The Size of Frames tags-->" + driver.findElements(By.tagName("iframe")).size());
		
		//switching to frame using WebElement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class*='demo-frame']")));

		Actions a = new Actions(driver);
		// a.dragAndDrop(driver.findElement(By.xpath("//body/div[1]")),
		// driver.findElement(By.xpath("html")));
		a.contextClick().build().perform();

		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Auto-scroll")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("API Documentation"))));
		//Switching to frame using INDEX of frame tag
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.cssSelector("#draggable2"));
		WebElement target = driver.findElement(By.cssSelector("#draggable"));
		System.out.println("Drag and droping WebElements");
		a.dragAndDrop(source, target);

		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
	}

}
