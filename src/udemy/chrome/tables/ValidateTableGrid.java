package udemy.chrome.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTableGrid {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/16869/ind-vs-eng-2nd-test-england-tour-of-india-2016-17");
		//System.out.println("The size "+driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")).size());
	   WebElement table = driver.findElement(By.cssSelector("div[class*='cb-col cb-col-67'] div[id='innings_1'] div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
//		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//we can get cssSelector using tagname:nth-child(index)   -other way of getting cssSelector
		System.out.println("The no of rows in first Innings table ="+table.findElements(By.cssSelector("#innings_1 div:nth-child(1) div[class='cb-col cb-col-100 cb-scrd-itms']")).size());
		
		int rowscount = table.findElements(By.cssSelector("#innings_1 div:nth-child(1) div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		int sumofPlayersScore=0;
		for(int i=0;i<rowscount-2;i++){
//		System.out.println(table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] [class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
		String count = table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] [class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
		int value = Integer.parseInt(count);
		sumofPlayersScore =sumofPlayersScore+value;
		}
		String extras = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
		int inningsExtras = Integer.parseInt(extras);
		sumofPlayersScore =sumofPlayersScore+inningsExtras;
		System.out.println("The Sum of Players Score is "+sumofPlayersScore);
		//we can also get xpath using Text of that element as shown Below
//		System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText());
		System.out.println("The Total Score is "+table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText());
		
		String totalScore =table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();
		int finalScore =Integer.parseInt(totalScore);
		
		if(finalScore==sumofPlayersScore){
		System.out.println("The Total Score is Validated");
		}else{
			System.out.println("The total score is not valid with Players total");
		}
	}
}
