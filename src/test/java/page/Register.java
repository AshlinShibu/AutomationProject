package page;

import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
	By pop=By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/input");
	By close=By.xpath("/html/body/div[13]/div/div/a");
	By apfirstname=By.xpath("//*[@id=\"FirstName\"]");
	By aplastname=By.xpath("//*[@id=\"LastName\"]");
	By apemail=By.xpath("//*[@id=\"Email\"]");
	By appassword=By.xpath("//*[@id=\"CreatePassword\"]");
	By create=By.xpath("//*[@id=\"create_customer\"]/p/input");
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String firstname,String lastname,String email,String password)
	{
		driver.findElement(apfirstname).sendKeys(firstname);
		driver.findElement(aplastname).sendKeys(lastname);
		driver.findElement(apemail).sendKeys(email);
		driver.findElement(appassword).sendKeys(password);
	}
	public void click()
	{
		driver.findElement(pop).click();
		driver.findElement(close).click();
		driver.findElement(create).click();
	}
	

}
