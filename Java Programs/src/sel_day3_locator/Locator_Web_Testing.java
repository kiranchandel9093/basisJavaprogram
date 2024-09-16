package sel_day3_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.I1;

public class Locator_Web_Testing  implements I1 {

	WebDriver driver;
	static Locator_Web_Testing obj ;
	
	public static void main(String[] args) throws InterruptedException  {
	 obj = new Locator_Web_Testing();
		obj.Web_open();
		
	}
	
	void Web_open() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		boolean status= driver.getPageSource().contains("Test Cases");
		System.out.println(status);
		if(status==true)
		{
			System.out.println("Home Page visible sucessfully");
			driver.findElement(By.xpath("//a[@href='/login']")).click();
			driver.findElement(By.xpath("//a[@href='/products']")).click();
		}
		
		else
		{
			System.out.println("Home Page not visible sucessfully");
		}
	}

/*	 void Clickon_signup_link()
	 {
		driver.findElement(By.linkText(" Signup / Login")).click();
	 }*/
}
