package Remotescripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HideImageTest {
	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		Map<String, Object> prefs = new HashMap();
		prefs.put("profile.managed_default_content_settings.images", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		//options.addArguments("--headless");
		//options.addArguments("--headless-gpu");
		//options.addArguments("--disable-infobars");
		
		options.merge(capabilities);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}

}
