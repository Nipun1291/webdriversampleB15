package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*
		 * driver.get("https://demo.opencart.com/");
		 * 
		 * String pageTitle = js.executeScript("return document.title").toString();
		 * System.out.println("Page title : " + pageTitle); WebElement searchBox =
		 * driver.findElement(By.name("search")); searchBox.sendKeys("Phone");
		 * driver.findElement(By.className("input-group-btn")).click();
		 * js.executeScript("window.scrollBy(200, 700)");
		 * js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		 */
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		js.executeScript("document.querySelector('#datepicker1').value='30/07/2021'");
		
		
		
	}

}
