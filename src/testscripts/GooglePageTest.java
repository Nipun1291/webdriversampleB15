package testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.cssSelector("input[title='Search']"));
		search.sendKeys("java tutorials");
		
		Thread.sleep(2000L);
		List <WebElement> elist = driver.findElements(By.xpath("ul[@role='listbox']//li//descendant::div[@class='pcTkSc']"));
		System.out.println("Number of suggestion :" +elist.size());
		for (int i=0; i<elist.size(); i++)
		{
			System.out.println(elist.get(i).getText());
			 if(elist.get(i).getText().equalsIgnoreCase("java tutorialspoint pdf"))
				 elist.get(i).click();
				 break;
				
		}
		
	}

}
