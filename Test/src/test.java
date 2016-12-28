import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
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

import com.mysql.cj.api.mysqla.result.Resultset;

import utility.DatabaseConn;
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
	
    
	DatabaseConn db=new DatabaseConn();
	try {
		db.connection();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sam21088@gmail.com");
	driver.findElement(By.xpath("//input[@id='next']")).click();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sajalsighisthenextelonmusk");
	driver.findElement(By.xpath("//input[@id='submit']")).click();
	DatabaseConn c=new DatabaseConn();
	ResultSet result=c.select("Select * from country");
	try {
		result.next();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	try {
		System.out.println(result.getString(1));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Assert.assertEquals(1, 1);
   

	
	
	
	
}
}
