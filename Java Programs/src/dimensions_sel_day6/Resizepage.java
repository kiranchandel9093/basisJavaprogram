package dimensions_sel_day6;
  
import java.io.File;  

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utility.I1;

public class Resizepage implements I1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get(indeed_login_url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 
		Dimension dim = new Dimension(300, 500);
		driver.manage().window().setSize(dim);
		Point p = new Point(300, 50);
		driver.manage().window().setPosition(p);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(500, document.body.scrollHeight)");
		
		/*File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(file, new File("C:\\Users\\NECTAR\\eclipse-workspace\\Java Programs\\newimage.png"));
		
		FileHandler.copy(f1, new File("C:\\Users\\NECTAR\\Desktop\\Firstsreenshot.png"));
	//FileHandler.copy(file, new File("C:\\Users\\NECTAR\\eclipse-workspace\\Java Programs\\Screenshots\\kk.png"));
	 
	 */
		
		//File f = new File();
		
		File f  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(f, new File("C:\\Users\\NECTAR\\Documents\\Custom Office Templates\\Firstsreenshot.png"));
		
		FileHandler.copy(f, new File("C:\\Users\\NECTAR\\eclipse-workspace\\Java Programs\\src\\kiran\\Firstsreenshot.png"));
		
		
	
	}

}
