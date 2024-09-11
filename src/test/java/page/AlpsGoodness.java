package page;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class AlpsGoodness {
	WebDriver driver;
	By pop=By.xpath("/html/body/div[13]/div/div/div[2]/div/div[2]/input");
	By close=By.xpath("//*[@id=\"email-modal\"]/div/div/a");
	//By approduct=By.xpath("//*[@id=\"shopify-section-navigation\"]/div/nav/div/div/ul/li[4]/a");
	By product=By.xpath("/html/body/main/div/div/div/div[2]/div/div[2]/div/ul/div/div/div[1]/div[1]/li[1]/div/div[1]/a/div");
	By cart=By.xpath("/html/body/main/div[2]/div/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/form/div[4]/button");
	
	public AlpsGoodness(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click()
	{
		driver.findElement(pop).click();
		driver.findElement(close).click();
		//driver.findElement(approduct).click();
		driver.findElement(product).click();
		driver.findElement(cart).click();
	}
}
