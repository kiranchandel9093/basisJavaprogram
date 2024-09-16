package selenium_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver {

	public static void main(String[] args) {
		
	/*	EdgeDriver d = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		d.get("https://www.w3schools.com/");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
	//	driver.close();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		
		
		
	}

}
