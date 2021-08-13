package testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopWinTest {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stqatools.com/demo/Windows.php");
		
		
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent  Handle :" + parentWin);
		driver.findElement(By.xpath("//button[normalize-space()='Click to open new Tab']")).click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("No. of tabs : " +tabs.size());
		for(String childWin : tabs)
		{
			System.out.println(childWin);
			if(!childWin.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(childWin);
				driver.findElement(By.xpath("//body/div[@id='page']/div[@role='banner']/header[@class='header-bar']/ul[@id='primary-menu']/li[3]/a[1]")).click();
			}
		}
	driver.close();
	driver.switchTo().window(parentWin);
	driver.findElement(By.xpath("//button[normalize-space()='Click to open new Window']")).click();
	Set<String> wins = driver.getWindowHandles();
	for(String childWin : wins)
	{
		System.out.println(childWin);
		if(!childWin.equalsIgnoreCase(parentWin)) {
			driver.switchTo().window(childWin);
			driver.findElement(By.xpath("//button[normalize-space()='New Message Window']")).click();
		}
	}
	driver.close();
	driver.quit();
	}

}
