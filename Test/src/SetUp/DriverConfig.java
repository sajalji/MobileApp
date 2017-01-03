package SetUp;

import java.io.FileReader;
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

	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sajal\\Desktop\\jars\\chromedriver.exe");

		final String path = ClassLoader.getSystemResource("Run.Properties").getPath();
		try {
			final FileReader file = new FileReader(path);
			final Properties prop = new Properties();
			prop.load(file);
			String browser = prop.getProperty("Browser");

			if (browser.matches("CHROME")) {
				driver = new ChromeDriver();
			} else if (browser.matches("FireFox")) {
				driver = new FirefoxDriver();
			} else if (browser.matches("Explorer")) {
				driver = new InternetExplorerDriver();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		LogClass log = new LogClass("Log");
		log.logger(driver.getClass());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	}

	public WebDriver getDriver() {
		return driver;
	}
}
