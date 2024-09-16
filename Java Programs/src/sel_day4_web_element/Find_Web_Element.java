package sel_day4_web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.I1;

public class Find_Web_Element implements I1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(sel_web_url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Web_Form = driver.findElement(By.xpath("//h1[contains(text(),'Web')]"));
		String get_text = Web_Form.getText();
		System.out.println(get_text);
		if(get_text.equals("Web form"))
		{
			//driver.findElement(By.id("my-text-id")).sendKeys("This is my code");
			WebElement Text_Name_Field = driver.findElement(By.id("my-text-id"));
			Text_Name_Field.clear();
			Text_Name_Field.sendKeys("Enter a Name in this field");
			WebElement Password_Field = driver.findElement(By.name("my-password"));
			Password_Field.clear();
			Password_Field.sendKeys("Enter Your Password");
			WebElement Text_Area_Field = driver.findElement(By.name("my-textarea"));
			Text_Area_Field.clear();
			Text_Area_Field.sendKeys("Write here at-least 1-150 words");
			WebElement Return_to_Index_Link = driver.findElement(By.linkText("Return to index"));
			Return_to_Index_Link.click();
			Thread.sleep(3000);
			driver.navigate().back();
			
			
			driver.close();
		}
		
		else
		{
			System.out.println("Test Case Fail");
		}
		
	}

}
