package udemy.global.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {

	public WebDriver driver = null;
	
//	The Below test method, we can use it for globally as it is a Base Details method for the total project 
	@Test
	public void details() throws IOException {
		System.out.println("Executing globally by providing details in property file. Not Hardcoding");
		// Initially we need to provide where the property file is located
		// for that we have to invoke the Object of Properties class from java.util package as Below
		Properties property = new Properties();
		// now we need to mention where the Property file is Located using FileInputStream.
		FileInputStream input = new FileInputStream(
				"G:\\SeleniumWorkspace_Neon\\UdemyProject\\projectKeyDetails.properties");
		// Here we can provide the path of Property file.
		property.load(input);
		// We Can do our Stuff
      
		if(property.getProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "G:\\Selenium Drivers\\geckodrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		}else if(property.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else{
			 System.setProperty("webdriver.ie.driver", "G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
		//Till Now The Browser and the property file is invoked globally
		//You can work on any web Applications providing the URL and selenium script details.
		driver.get(property.getProperty("url"));
	}

}
