package udemy.ie.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownExample {

	public static void main(String[] args) {
System.setProperty("webdriver.ie.driver", "G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.aa.com/booking/find-flights?tripType=roundTrip");
		Select s = new Select(driver.findElement(By.cssSelector("select[id='passengerCount']")));
		
		s.selectByIndex(3);
		s.selectByValue("6");
		
	//	driver.close();
		

	}

}
