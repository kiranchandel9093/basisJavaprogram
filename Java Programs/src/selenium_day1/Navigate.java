package selenium_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/");
		driver.manage().window().minimize();
		
		Thread.sleep(9000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
	}

}
