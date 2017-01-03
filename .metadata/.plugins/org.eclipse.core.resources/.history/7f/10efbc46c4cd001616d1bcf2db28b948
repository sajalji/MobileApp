package SetUp;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utility.LogClass;



public class DriverConfig {
	

	static WebDriver driver;
	

	public WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sajal\\Desktop\\jars\\chromedriver.exe");

		final String path=ClassLoader.getSystemResource("Run.Properties").getPath();
		try {
			final FileInputStream file=new FileInputStream(path);
			final Properties prop=new Properties();
			prop.load(new FileInputStream(path));
			String browser=prop.getProperty("Browser");
			System.out.println(browser);
			if(browser.matches("CHROME")){
				driver=new ChromeDriver();
				
			}
			else if(browser.matches("FireFox")){
				driver=new FirefoxDriver();
			}
			else if(browser.matches("Explorer")){
				driver=new InternetExplorerDriver();
			}
				//LogClass log=new LogClass("Log");
				//log.logger(driver.getClass());
			System.out.println(driver);
			return driver;
				
		} catch (IOException e) {
			e.printStackTrace();
			return driver;
		}
	}
		

		
	}

	




