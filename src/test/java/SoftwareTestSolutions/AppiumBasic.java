package SoftwareTestSolutions;

import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasic {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		//AdroidDriver, IOSDriver
		
		// Starting the Appium Server
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		//Appium Code -> Appium Server -> Mobile
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("TestAutomation");
		options.setApp("//Users//suayiptekin//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);


		
		// Stopping the server
//		driver.quit();
//		service.stop();
		//Actutal automation starts after the Appium setup
		
		
	}

}
