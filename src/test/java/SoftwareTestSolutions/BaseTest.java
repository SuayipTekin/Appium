package SoftwareTestSolutions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.URL;
import java.net.MalformedURLException;
import java.time.Duration;


public class BaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {

        //AdroidDriver, IOSDriver
        // Starting the Appium Server
        service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        //Appium Code -> Appium Server -> Mobile
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("TestAutomation");
        options.setApp("//Users//suayiptekin//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
        // Stopping the server
        driver.quit();
        service.stop();
    }
}
