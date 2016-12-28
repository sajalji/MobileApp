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
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Gesture2 {
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
    		File app=new File(appDir,"ApiDemos.apk");

     		DesiredCapabilities cap=new DesiredCapabilities();
     		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
     		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
     		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
     		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
     		
     		AppiumDriver driver=(AppiumDriver)new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
     		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    
     		System.out.println(driver.getContext());
     		List<WebElement> e=driver.findElements(By.id("android:id/text1"));
     		
     		TouchAction t=new TouchAction(driver);
     		
     		//t.tap(e.get(2)).perform();
     		t.tap(0, 657).perform();
     		
     		//t.longPress(e.get(2)).perform();
     	    Thread.sleep(10000);

}
}
