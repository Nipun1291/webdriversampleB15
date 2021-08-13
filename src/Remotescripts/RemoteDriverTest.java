package Remotescripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
public class RemoteDriverTest {
	
	public static void main(String[] args) throws MalformedURLException
	{
	ChromeOptions options = new ChromeOptions();
	options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
	String strHub = "http://192.168.0.104:4444/wd/hub";
	WebDriver driver = new RemoteWebDriver(new URL(strHub), options);
	driver.get("https://www.google.co.in/");
	WebElement search = driver.findElement(By.cssSelector("input[title='Search']"));
	search.sendKeys("Java Tutorial");
	search.sendKeys(Keys.ENTER);
	System.out.println("Page Title : " +driver.getTitle());
	
	
	
	}
}
