package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement search = driver.findElement(By.name("search"));
		//action.contextClick(search).perform();
		
		WebElement menu = driver.findElement(By.xpath("//a[text()='Components']"));
		Thread.sleep(1000);
		WebElement item = driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
		action.moveToElement(menu).click(item).perform();
	}
}
