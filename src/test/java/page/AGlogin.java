package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AGlogin {
	WebDriver  driver;
	
	By pop=By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/input");
	By close=By.xpath("/html/body/div[13]/div/div/a");
	By agemail=By.xpath("//*[@id=\"CustomerEmail\"]");
	By agpassword=By.xpath("//*[@id=\"CustomerPassword\"]");
	By signin=By.xpath("/html/body/main/div[2]/div/div/div/div/div/div/div[2]/form/p[2]/input");
	//By approduct=By.xpath("//*[@id=\"shopify-section-navigation\"]/div/nav/div/div/ul/li[4]/a");
	//By product=By.xpath("/html/body/main/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[1]/ul/li[4]/div/div[1]/a");
	//By cart=By.xpath("//*[@id=\"AddToCart\"]");
	
	public AGlogin(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void setvalue(String email,String password)
	{
		
		driver.findElement(agemail).sendKeys(email);
		driver.findElement(agpassword).sendKeys(password);
		
	}
	
	public void login()
	{

		driver.findElement(pop).click();
		driver.findElement(close).click();
		driver.findElement(signin).click();
		
		//driver.findElement(approduct).click();
		//driver.findElement(product).click();
		//driver.findElement(cart).click();
	}
}
