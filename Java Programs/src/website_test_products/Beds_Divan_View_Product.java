package website_test_products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.I1;

public class Beds_Divan_View_Product implements I1 {
	

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get(beds_diwan_url);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	WebElement Divan_Beds = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/a[1]/div/p"));
	Divan_Beds.click();
	//Actions action = new Actions(driver);
	//action.moveToElement(Divan_Beds);
}
}
