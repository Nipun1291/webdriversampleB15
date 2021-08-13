package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameTest {
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chercher.tech/practice/frames");
		System.out.println("Before Frames :" +driver.findElement(By.xpath("//label[1]")).getText());
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello Welcome");
		
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#a")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("input[type='text']")).clear();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Welcome back");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dropdown =driver.findElement(By.cssSelector("#animals"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Avatar");
	}
		
		

}
