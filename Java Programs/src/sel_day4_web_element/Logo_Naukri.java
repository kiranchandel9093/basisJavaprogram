package sel_day4_web_element;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.I1;

public class Logo_Naukri implements I1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(naukri_portal_url);
		//driver.get(nuakri_Com_url);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		/*WebElement Search_Job = driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
		String get_text= Search_Job.getText();
		System.out.println(get_text);
		if(get_text.equals("Search"))
		{
		*/
		WebElement Naukri_Field = driver.findElement(By.xpath("//span[@class='nI-gNb-sb__placeholder nI-gNb-sb__placeholder--prefill']"));
		//Naukri_Field.clear();
		Naukri_Field.click();
		WebElement Suggestion_field =driver.findElement(By.xpath("//input[@class='suggestor-input ']" ));
		Suggestion_field.clear();
		Suggestion_field.click();
		Suggestion_field.sendKeys("Software Engineer");
		WebElement Search_Field = driver.findElement(By.id("experienceDD"));
		Search_Field.clear();
		Search_Field.click();
		
		WebElement Exp_F = driver.findElement(By.xpath("//input[@placeholder='Select experience']"));
		Select select = new Select(Exp_F);
		//Exp_F.click();
		
		
		Thread.sleep(3000);
		
		WebElement Location_Field = driver.findElement(By.xpath("//input[@placeholder='Enter location']"));
		Location_Field.sendKeys("Noida");
		
		WebElement Search_Job = driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
		Search_Job.click();
		
		//}
		//span[@class='nI-gNb-sb__placeholder nI-gNb-sb__placeholder--prefill']
		//input[@placeholder='Enter location']
		
		
		/*WebElement Naukri_logo = driver.findElement(By.xpath("//img[@src='//static.naukimg.com/s/0/0/i/naukri-identity/naukriLogo.svg']"));
		//String get_logo = Naukri_logo.getText();
		System.out.println(get_logo);
		*/
		
		/*else
		{
			System.out.println("Fail");
		}*/
	}

}
