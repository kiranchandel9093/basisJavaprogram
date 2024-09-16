package sel_day5_dropdown;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.I1;

public class Webform_Dropdown implements I1 {

	public static void main(String[] args) throws InterruptedException {
		String path ="C:\\Users\\NECTAR\\Desktop\\New folder";
		WebDriver driver = new ChromeDriver();
		driver.get(sel_web_url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement Dropdown_Select = driver.findElement(By.name("my-select"));
		Select select = new Select(Dropdown_Select);
		select.selectByVisibleText("One");
		//select.selectByIndex(2);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
		driver.findElement(By.id("my-check-1")).click();
		driver.findElement(By.xpath("//button[contains( text(),'Submit')]")).click();
	}

}
