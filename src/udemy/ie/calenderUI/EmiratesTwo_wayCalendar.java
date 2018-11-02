package udemy.ie.calenderUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EmiratesTwo_wayCalendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver",
				"G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.emirates.com/us/english/");
		driver.findElement(
				By.cssSelector("[class='destination-dropdown'] [class='js-field-input field__input js-dropdown-open']"))
				.sendKeys("msy");
		driver.manage().window().fullscreen();
		driver.findElement(By
				.xpath("//a[contains(@class,'cta cta--large cta--primary js-continue-search-flight search-flight__continue--cta')]"))
				.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='search-flight-date-picker--depart']")).click();

		// Now we will work on Calendar
		while (!driver
				.findElement(By.cssSelector(
						"[class='ek-datepicker__column-title'] [class='ek-datepicker__column-label label-month']"))//Its not accurate css But it works
				.getText().contains("Nov")) {
			driver.findElement(By.cssSelector("[class='ek-datepicker__button ek-datepicker__button--next']")).click();
		}
		
		int count = driver.findElements(By.cssSelector(".ek-datepicker__table .ek-datepicker__day")).size();
        System.out.println("The count of available days"+count);
        Thread.sleep(7000);
        
        for(int i=1; i<count; i++){
        String dateText = driver.findElements(By.cssSelector(".ek-datepicker__table .ek-datepicker__day")).get(i).getText();
       
        if(dateText.equalsIgnoreCase("4")){
        	driver.findElements(By.cssSelector(".ek-datepicker__table .ek-datepicker__day")).get(i).click();
        	 System.out.println("The Departure date is ->"+dateText);
        	} else
        if(dateText.equalsIgnoreCase("8")){
        	driver.findElements(By.cssSelector(".ek-datepicker__table .ek-datepicker__day")).get(i).click();
        	 System.out.println("The Return date is ->"+dateText);
        	break; //It is used to come out of for loop also because the condition is valid.
        }
      }
		
		Thread.sleep(5000);
		driver.close();
	}

}
