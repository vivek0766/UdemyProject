package udemy.ie.calenderUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SouthWestDepartureCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver",
				"G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.southwest.com/");
		driver.findElement(By.cssSelector("input[id*='air-date-departure']")).click();
		
		// Now we will work on Calendar
		Thread.sleep(8000);
       // !(Exclamation or negation) is used, If the given condition is true. take it as false
		while (!driver
				.findElement(By
						.xpath("//div[@class='calendar-1 js-calendar-1'] //div[@class='calendar-selector--navigation']"))
				.getText().contains("Nov")) {
			driver.findElement(By.xpath("//a[contains(@class,'next js-next')]")).click();
		}
		//// div[@class='calendar-1 js-calendar-1']
		//// calendar-selector--navigation
		System.out.println("The size of available dates->"
				+ driver.findElements(By.xpath("//td[contains(@class,'js-available')]")).size());
		int count = driver.findElements(By.xpath("//td[contains(@class,'js-available')]")).size();
		System.out.println(" To select the dates from the calender");
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.xpath("//td[contains(@class,'js-available')]")).get(i).getText();
			System.out.println(driver.findElements(By.xpath("//td[contains(@class,'js-available')]")).get(i).getText());
			if (text.equalsIgnoreCase("14")) {
				driver.findElements(By.xpath("//td[contains(@class,'js-available')]")).get(i).click();
				System.out.println("The Departure date is selected");
				break;
			}
		}

	}

}
