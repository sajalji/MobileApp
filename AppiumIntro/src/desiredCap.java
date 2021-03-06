import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class desiredCap {

	@Test
	public void test() throws ExecuteException, IOException, InterruptedException {
		
		   DefaultExecutor executor = new DefaultExecutor();
	        DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		
		CommandLine launchEmul = new CommandLine("F:/Genymobile/Genymotion/player");
        launchEmul.addArgument("--vm-name");
        launchEmul.addArgument("Google Nexus 5 - 5.1.0 - API 22 - 1080x1920");
        executor.setExitValue(1);
        executor.execute(launchEmul, resultHandler);
		File appDir=new File("src");
		File app=new File(appDir,"BookMyShow�Movie Tickets%2CPlays_5.0.7_apk-dl.com.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
          
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		driver.findElement(By.id("com.bt.bms:id/language_english")).click();
		driver.findElement(By.id("com.bt.bms:id/language_text_view_label")).click();
		/*driver.findElement(By.id("com.bt.bms:id/launcher_tv_for_login")).click();
		List<WebElement> same=driver.findElements(By.className("android.widget.TextView"));
		if(!same.isEmpty()){
		for(WebElement i:same)
		{
			System.out.println(i.getText());
			
		}
		same.get(1).click();
		
		Thread.sleep(1000);
		}
		else{
			System.out.println("There is no such element with the following identifier");
		}*/
		
		// SignUp code for book My show app
		
		driver.findElement(By.id("com.bt.bms:id/launcher_tv_for_signup")).click();
		driver.findElement(By.id("com.bt.bms:id/signup_et_first_name")).sendKeys("Sajal");
		driver.findElement(By.id("com.bt.bms:id/signup_et_last_name")).sendKeys("Sajal");
		driver.findElement(By.id("com.bt.bms:id/signup_et_email")).sendKeys("sam21088@malinator.com");
		driver.findElement(By.id("com.bt.bms:id/signup_et_password")).sendKeys("coulomb12");
		driver.findElement(By.id("com.bt.bms:id/signup_et_mobileno")).sendKeys("9818115867");
		
		//Handling checkbox is appium
		
		WebElement check=driver.findElement(By.id("com.bt.bms:id/signup_cb_walletactivation"));
		boolean b=check.isSelected();
		if(b==true)
		{
			check.click();
		}
		driver.findElement(By.id("com.bt.bms:id/signup_bt_signup_button")).click();
		
		
		//driver.findElement(By.id("com.bt.bms:id/et_search")).sendKeys("Gurgaon");
		driver.quit();
		driver.close();
		//Android Driver
		//IOS driver

		
	}

}
