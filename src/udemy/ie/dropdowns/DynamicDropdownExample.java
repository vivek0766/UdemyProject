package udemy.ie.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


//This Class is tried for DynamicDropdown Test But it is almost Static Drop down Test.
public class DynamicDropdownExample {

	public static void main(String[] args) throws InterruptedException {
	//Very Imp Topic.
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.aa.com/homePage.do");
		
		driver.findElement(By.cssSelector("a[data-for='reservationFlightSearchForm.originAirport']")).click();
		
		Select selectcountryCodeFrom = new Select(driver.findElement(By.xpath("//*[@id='countryCode']")));
		
		selectcountryCodeFrom.selectByIndex(4);
		synchronized (driver) {
			driver.wait(5000);
		}
		selectcountryCodeFrom.selectByVisibleText("Canada");
		
		Select selectProvinceFrom = new Select(driver.findElement(By.cssSelector("select#stateCode")));
		selectProvinceFrom.selectByIndex(10);
		synchronized (driver) {
			driver.wait(10000);
		}
		
		driver.findElement(By.xpath("//a[contains(@id,'airport_YBI')]")).click();
		
		synchronized (driver) {
			driver.wait(3000);
		}
		
		//Above code is for departure(From) drop down test 
		
		//Below code is for Destination(To) drop down test 
		driver.findElement(By.xpath("//div[3][@class='row-form']/div[2]/div/a")).click();
		
		Select selectcountryCodeTo = new Select(driver.findElement(By.xpath("//*[@id='countryCode']")));
		
		selectcountryCodeTo.selectByIndex(4);
		synchronized (driver) {
			driver.wait(5000);
		}
		selectcountryCodeTo.selectByVisibleText("Canada");
		
		Select selectProvinceTo = new Select(driver.findElement(By.cssSelector("select#stateCode")));
		selectProvinceTo.selectByIndex(7);
		synchronized (driver) {
			driver.wait(10000);
		}
		
		driver.findElement(By.xpath("//a[contains(@id,'airport_ZBF')]")).click();
		
		synchronized (driver) {
			driver.wait(3000);
		}
		
		
		driver.findElement(By.cssSelector("input[id*='flightSearchForm.button.reSubmit'")).click();
		
		//driver.close();
	
		

	}

}
