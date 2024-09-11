package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.AlpsGoodness;

public class AlpsGoodness1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().refresh();		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://alpsgoodness.com/");
	}
	@Test
	public void test()
	{
		
		AlpsGoodness ob=new AlpsGoodness(driver);	
		ob.click();
		
	}
}
