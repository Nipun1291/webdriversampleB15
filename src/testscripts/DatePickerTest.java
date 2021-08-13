package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//nipun//Downloads//drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
	selectDate("2022", "September", "31");
	}
		
		public static String[] getMonthYear(String monthYearVal)
		{
			return monthYearVal.split(" ");
		}
	
	public static void selectDate(String expYear, String expMonth, String expDay)
	{
		
		if(expMonth.equalsIgnoreCase("February") && Integer.parseInt(expDay)>29)
			{System.out.println("Invalid input date :"+ expMonth +" " +expDay);
		return;
			}
		
		if(Integer.parseInt(expDay)>31)
			{System.out.println("Invalid input date :"+ expMonth +" " +expDay);
			return;
			}
			
		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println("Current Date is : "+monthYearVal);
		while(!(getMonthYear(monthYearVal)[0].equals(expMonth) && getMonthYear(monthYearVal)[1].equals(expYear)))
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
	}
		try
		{
			driver.findElement(By.xpath("//a[text()='" + expDay +"']")).click();
		}
	catch(Exception e)
	{
	System.out.println("Exception Invalid Date : "+ expMonth + " " + expDay);
		
	}
		
	}

}
