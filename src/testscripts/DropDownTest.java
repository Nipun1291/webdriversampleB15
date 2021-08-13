package testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		Select singleSel = new Select(driver.findElement(By.id("select-demo")));
		singleSel.selectByValue("Monday");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File srcFile = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("//Users//nipun//eclipse-workspace//webdriversampleB15//src//screenshot//screenshot28july2021.png"));
		
		//Selecting by Multi-Select
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		if(mulSel.isMultiple())
		{
			mulSel.selectByIndex(1);
			mulSel.selectByValue("New Jersey");
			mulSel.selectByVisibleText("Texas");
		}
		System.out.println("No. of items selected : " +mulSel.getAllSelectedOptions().size());
		
		mulSel.deselectByIndex(1);

}
}
