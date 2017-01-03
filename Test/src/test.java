import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import SetUp.DriverConfig;
import utility.DatabaseConn;

public class test {

	@Test
	public void test1() {
		DriverConfig d = new DriverConfig();
		WebDriver driver = d.getDriver();
		driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sam21088@gmail.com");
		driver.findElement(By.xpath("//input[@id='next']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sajalsighisthenextelonmusk");
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		DatabaseConn c = new DatabaseConn();
		Assert.assertEquals(1, 1);

	}

}
