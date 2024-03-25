package Gmaile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmail {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.nseindia.com/market-data/live-market-indices");
		driver.navigate().to("https://www.nseindia.com/market-data/live-market-indices");
		
		
		
		
		
		
		
		
		
		
	}

}
