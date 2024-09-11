package test;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Register;

public class Register1 {
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
	driver.get("https://alpsgoodness.com/account/register");
}
@Test
public void test()
{
	Register ob=new Register(driver);
	ob.setvalues("ashlin", "shibu", "ashlinshibu1996@gmail.com", "ashlin123456789");
	ob.click();
	
	//logo verification
	WebElement src = driver.findElement(By.xpath("//*[@id=\"header-landing\"]/div/div/div[1]/a/img"));
	boolean b=src.isDisplayed();
	
	if(b)
	{
		System.out.println("logo is displayed");
	}
	System.out.println("logo is not displayed");
	
	
}
}
