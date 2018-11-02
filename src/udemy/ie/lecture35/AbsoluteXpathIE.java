package udemy.ie.lecture35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AbsoluteXpathIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "G:\\Selenium Drivers\\InternetExplorerDrivers\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.westernunion.com");
		driver.findElement(By.xpath("//html/body/div/header/div/div/header/div[3]/div/div[5]/ul/li[8]/a")).click();//I took from starting of HTML code.
		                                /*   //body/div/header/div/div/header/div[3]/div/div[5]/ul/li[8]/a
		                                   //header/div/div/header/div[3]/div/div[5]/ul/li[8]/a */		
		driver.close();

	}

}
