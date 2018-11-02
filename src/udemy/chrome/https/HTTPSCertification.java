package udemy.chrome.https;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPSCertification {
	public static void main(String[] args){
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
//		Below are the different capabilities of Different Certifications 1, It will accept all insecured certifications
//		2, It will take Insecured Certifications 3rd, Is SSL Certification
		
		dc.acceptInsecureCerts();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.close();
		// you can perform selenium script 
	}

}
