import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sajal\\Desktop\\jars\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Screen s=new Screen();
      ScreenImage file = s.capture(s.getBounds());
      
		
		driver.quit();
	}

}