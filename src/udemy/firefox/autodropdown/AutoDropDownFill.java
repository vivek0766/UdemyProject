package udemy.firefox.autodropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoDropDownFill {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
         driver.get("https://www.orangetravels.in/");		
         driver.findElement(By.id("close")).click();
         int count =driver.findElements(By.tagName("iframe")).size();
         System.out.println("the count is "+count);
         
     if(driver.findElement(By.xpath("//div[@id='searchbus_from_chosen']")).isSelected()){ 	
     } else  {
    	 driver.findElement(By.xpath("//div[@id='searchbus_from_chosen']")).click();
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("[class*='chosen-drop'] [class='chosen-search'] input")).sendKeys("BA");
    	 driver.findElement(By.cssSelector("[class*='chosen-drop'] [class='chosen-search'] input")).sendKeys(Keys.DOWN);
    	 driver.findElement(By.cssSelector("[class*='chosen-drop'] [class='chosen-search'] input")).sendKeys(Keys.DOWN);
    	 driver.findElement(By.cssSelector("[class*='chosen-drop'] [class='chosen-search'] input")).sendKeys(Keys.DOWN);
    	 driver.findElement(By.cssSelector("[class*='chosen-drop'] [class='chosen-search'] input")).sendKeys(Keys.ENTER);
    	 System.out.println(driver.findElement(By.cssSelector("[class*='chosen-drop'] [class='chosen-search'] input")).getText());
    	 //The tag is in hidden Mode so you can not see Text of it in Console.
    	 // To get text we need to work on JavaScript HTML DOM.
    	
    	
    	 
    	 
     }
    	 
       
      

	}

}
