package udemy.chrome.limitingWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/");

		System.out.println("The links Total Web Page -->"+driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver =driver.findElement(By.xpath("//div[contains(@id,'footer')]"));
		System.out.println("The Links in Footer of Webpage"+footerdriver.findElements(By.tagName("a")).size());
		
		WebElement footerfirstcloumn =driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/div[5]/div[1]/div[1]"));
		System.out.println("The Links in first footer column->"+footerfirstcloumn.findElements(By.tagName("a")).size());
		
		int linksSize =footerfirstcloumn.findElements(By.tagName("a")).size();
		
		for(int i=0; i<linksSize; i++){
			//Keys.chord is used for control the Keyboard and click on Links to open in new tab 
			//Instead of click(); we use sendKeys(clickOnLinks) to open the links in new Tab.
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerfirstcloumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
		}
			Set<String> windowHandling =driver.getWindowHandles();
			Iterator<String> iterator =windowHandling.iterator();
			
			while(iterator.hasNext()){     //.hasNext() tells whether the next index is present, If Present Then Do next process in the loop
				driver.switchTo().window(iterator.next());
				System.out.println(driver.getTitle());
				Thread.sleep(6000);
				driver.close();
			}			
		
		
//		Thread.sleep(6000);
//		driver.close();
	}

}
