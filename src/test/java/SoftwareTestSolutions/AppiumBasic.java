package SoftwareTestSolutions;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasic extends BaseTest {

    @Test
    public void WifiSettingsName() throws MalformedURLException {

        // Locators android locators support appium
        //1. Xpath, id, Accessibility id, classname, androidUIAutomator
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

    }

}
