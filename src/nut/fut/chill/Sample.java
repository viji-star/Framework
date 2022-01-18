package nut.fut.chill;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	
	static WebDriver driver;

	@Parameters({"url","username","password","sum"})
	@Test
	public void testlevel(String url,String username,String password,int sum)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(sum, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(sum, TimeUnit.SECONDS);
		WebElement user = driver.findElement(By.id("userName"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(password);
		
	}
}
