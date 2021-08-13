package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertTest {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		driver.switchTo().alert().accept();
				
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
		driver.switchTo().alert().sendKeys("Welcome!");
		driver.switchTo().alert().accept();

}
}
