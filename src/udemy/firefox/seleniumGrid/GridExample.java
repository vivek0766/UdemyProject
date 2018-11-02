package udemy.firefox.seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
	//we can not work on two browsers in on Platform.	
//		Thread.sleep(6000);
//		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		driver.get("https://www.westernunion.com/us/en/home.html");
		System.out.println("All set we can work on remote systems");
		Thread.sleep(5000);
		driver.close();

	}

}
