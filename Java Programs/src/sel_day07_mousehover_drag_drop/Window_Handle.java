package sel_day07_mousehover_drag_drop;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.I1;

public class Window_Handle  implements I1{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	
	//driver.get(indeed_login_url);
	driver.get(naukri_portal_url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	//driver.findElement(By.id("EmployersPostJob")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
	Set<String>child = driver.getWindowHandles();
	System.out.println(child);
	
	Iterator<String> itr = child.iterator();
	while (itr.hasNext()) {
		String object_child = (String) itr.next();
		System.out.println(object_child);
		{
			if(!parent.equals(object_child))
			{
				driver.switchTo().window(object_child);
				System.out.println(driver.switchTo().window(parent).getTitle());
			}
		}
		//WebElement We = driver.findElement(By.id("EmployersPostJob"));
		/*WebElement object_child1 =driver.findElement(By.xpath("/html/body/div[4]/ul[1]/li[2]/a/span"));
		
		Actions action = new Actions(driver);
		action.moveToElement(object_child1);
		
		WebElement we2 = driver.findElement(By.xpath("/html/body/div[4]/ul[1]/li[2]/ul/li[2]/a"));
		action.moveToElement(we2);
		action.click().build().perform();
		*/
	}
	}

}
//FindCandidates