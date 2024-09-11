package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.AGlogin;
import page.AlpsGoodness;

public class AGlogin1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		//ChromeOptions options = new ChromeOptions();
	    //options.addArguments("--disable-notifications");
		//driver=new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.navigate().refresh();		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://alpsgoodness.com/account/login");
	}
	@Test
	public void test1() 
	{
		
		AGlogin ob=new AGlogin(driver);	
		ob.setvalue("ashlinshibu1996@gmail.com","ashlin123456789");
		ob.login();	
		
		
		//scrolldown to facebook
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.xpath("//*[@id=\"shopify-section-footer-model-6\"]/div/footer/div/div[2]/div/div[2]/ul/li[1]/a/span")).click();
		
		
	}
		public void test2()
		{
			 
		AlpsGoodness ob1=new AlpsGoodness(driver);	
		ob1.click();
	}

}
