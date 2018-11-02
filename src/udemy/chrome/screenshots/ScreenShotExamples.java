package udemy.chrome.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

public class ScreenShotExamples {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.westernunion.com/us/en/home.html");
		//To kill a file which is opened in Window. But WindowsUtils Class methods are depreciated.
		WindowsUtils.killByName("word.docx");

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\VivekReddy\\Desktop\\Selenium_Udemy\\scr.png"));
		
		Thread.sleep(4000);
		File deleteFile = new File("C:\\Users\\VivekReddy\\Desktop\\Selenium_Udemy\\screen.png");
		
		if(deleteFile.delete()){
			System.out.println("The file in "+deleteFile.getPath()+" is deleted ");
		}else{
			System.out.println("The file is not present in the folder to deleted");
		}
		
//		Thread.sleep(6000);
//		FileUtils.deleteQuietly(file);
		

		Thread.sleep(5000);
		driver.close();
	}

}
