package test;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class screenshot {

		ChromeDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://alpsgoodness.com/");
		}
		
		@Test
		public void test() throws Exception
		{

			WebElement dayelement = driver.findElement(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/div/form/input[5]"));
			
			File src=dayelement.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("./screenshot//name.png"));
		}
	}


