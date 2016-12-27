import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class test{
	
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sajal\\Desktop\\jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
	// xpath is chrome syntax $x('//*[@id="Email"]')
	driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("sam21088@gmail.com");
	driver.findElement(By.xpath("/*[@id='next']")).click();
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sajalsighisthenextelonmusk");
	driver.findElement(By.xpath("/*[@id='submit']")).click();

	
	
	
	
}
}
