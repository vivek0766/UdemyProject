package udemy.ie.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.ie.driver", "G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
        
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.netflix.com/browse");
        System.out.println("The Title of the Page is "+driver.getTitle());
        driver.close();
	}

}
