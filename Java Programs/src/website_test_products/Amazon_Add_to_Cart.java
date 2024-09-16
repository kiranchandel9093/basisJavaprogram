package website_test_products;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.I1;

public class Amazon_Add_to_Cart implements I1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(amazon_base_url);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement WE = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		WE.click();
		WebElement E_mail = driver.findElement(By.name("email"));
		//WebElement WE2 = driver.findElement(By.id("ap_email_login"));
		E_mail.sendKeys("kiran123chandel@gmail.com");
		WebElement button_click = driver.findElement(By.xpath("//*[@id='continue']/span/input"));
		button_click.click();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345677889");
		WebElement sign_in = driver.findElement(By.id("signInSubmit"));
		sign_in.click();
		
		/*WebElement search_field = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		search_field.sendKeys("Redmi 9a");
		search_field.click();
		WebElement button = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
		button.click();
		//WebElement add_to_cart = driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		WebElement add_cart = driver.findElement(By.xpath("//*[@id='a-autoid-1-announce']"));
		add_cart.click();
		WebElement Cart_link = driver.findElement(By.id("nav-cart-count"));
		Cart_link.click(); */
		
		//WebElement home_page_item = driver.findElement(By.xpath("//*[@id='CardInstanceIlZYqIjznfTVZxAEPP1uGg']/div[2]/div[1]/div[1]/a/div[2]/span"));)
		WebElement home_page_item = driver.findElement(By.xpath("//span[contains(text(),'Cushion covers, bedsheets & more')]"));
		home_page_item.click();
	}

}
