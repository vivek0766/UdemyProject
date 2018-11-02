package udemy.chrome.lecture43.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.dice.com/jobs/advancedSearch.html");
	//	driver.findElement(By.xpath("//div[@class='col-lg-7 colLP']/label[2]/input")).click();
		System.out.println(driver.findElements(By.xpath("//div[@class='col-lg-7 colLP']/label")).size());
		
		int count = driver.findElements(By.xpath("//div[@class='col-lg-7 colLP']/label")).size();
		synchronized (driver) {
              try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		for (int i=0;i<count;i++){
			driver.findElements(By.xpath("//div[@class='col-lg-7 colLP']/label")).get(i).click();
		}
     // To click on one particular radio Button below is the best practice to write.
		
		for (int j=0;j<count;j++){
			String name = driver.findElements(By.xpath("//div[@class='col-lg-7 colLP']/label")).get(j).getAttribute("id");
			if(name.equals("disradio")){
				driver.findElements(By.xpath("//div[@class='col-lg-7 colLP']/label")).get(j).click();
			}
		}
	}

}
