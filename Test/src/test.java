import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.LogClass;


@Test
public class test{
	
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sajal\\Desktop\\jars\\chromedriver.exe");
	
	
	LogClass l=new LogClass("sajal");
	Logger li=l.logger(test.class);
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
	// xpath is chrome syntax $x('//*[@id="Email"]')
	
    
	
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sam21088@gmail.com");
	driver.findElement(By.xpath("//input[@id='next']")).click();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sajalsighisthenextelonmusk");
	driver.findElement(By.xpath("//input[@id='submit']")).click();
	Assert.assertEquals(1, 1);
   

	
	
	
	
}
}
