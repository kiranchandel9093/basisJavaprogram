package sel_day5_dropdown;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.I1;

public class Indeed_Practice implements I1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(indeed_login_url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement Signin_link = driver.findElement(By.linkText("Sign in"));
		Signin_link.click();
		WebElement email_enter = driver.findElement(By.id("\'ifl-InputFormField-ihl-useId-passport-webapp-1\'"));
		email_enter.sendKeys("kiran9093chandel@gmail.com");
		//WebElement email_enter = driver.findElement(By.name("__email))";
	    //driver.findElement(By.xpath("//button[@id='login-google-button'] ")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'login-google-button')]")).click();
	    
	    //Login_with_Google.click();
		
				
			
	}
	
	
	
	
	
	

}
