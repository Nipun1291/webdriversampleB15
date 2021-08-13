package testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SamplePageTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		Actions action = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#fname")).sendKeys("TestUser");
		driver.findElement(By.id("idOfButton")).click();
		driver.findElement(By.id("male")).click();
		driver.findElement(By.className("Automation")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("name"));
		 * for(WebElement element : elements) { System.out.println("Name Attribute :" +
		 * element.getAttribute("name")); }
		 * driver.findElement(By.partialLinkText("This is")).click();
		 */
		
		WebElement dblClickBtn = driver.findElement(By.id("dblClkBtn"));
		action.doubleClick(dblClickBtn).perform();
		

		
		

	}

}
