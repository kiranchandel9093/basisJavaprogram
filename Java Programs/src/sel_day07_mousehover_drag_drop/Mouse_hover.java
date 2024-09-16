package sel_day07_mousehover_drag_drop;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.I1;

public class Mouse_hover implements I1  {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get(flipkart_url);
		//driver.get(Browser_Stack_url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement We1 = driver.findElement(By.xpath("//*[@id='products-dd-toggle']"));
		WebElement We = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/img"));
		
		Actions action = new Actions(driver);
		action.moveToElement(We);
		
		//action.moveToElement(We).build().perform();
		WebElement we2 = driver.findElement(By.xpath("//a[contains(text(),'All')]"));
		action.moveToElement(we2);
		action.click().build().perform();
		Thread.sleep(4000);
		WebElement we = driver.findElement(By.xpath("//*[@class='hZmZbn AQNm5W']"));
		Actions action1 = new Actions(driver);
		action1.dragAndDropBy(we, 80, 20).perform();
	}
	}


////a[contains(text(),'All')]
///div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/img
//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/img
//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/img