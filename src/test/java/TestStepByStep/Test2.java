package TestStepByStep;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Test2 {

    // appiumu java ile baslatmak icin service
    AppiumDriverLocalService service;

    @Test
    public void test1() throws MalformedURLException {

        // appium icin servis ayarlari yapiliyor.
        service = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                //.usingPort(1111)
                .usingAnyFreePort()
                .build();
        // appium servisi baslatilyor.
        service.start();


        DesiredCapabilities capabilities = new DesiredCapabilities();
        // cihaz ya da emülatör bilgileri
        capabilities.setCapability("appium:udid", "EPHUT20721025903");
        capabilities.setCapability("appium:version", "12");
        capabilities.setCapability("appium:deviceName", "HUAWEI P40");
        capabilities.setCapability("platformName", "Android");
        // calistirilacak uygulama bilgileri
        capabilities.setCapability("appium:appPackage", "com.touchboarder.android.api.demos");
        capabilities.setCapability("appium:appActivity", "com.touchboarder.androidapidemos.MainActivity");


        AppiumDriver<MobileElement> driver;

        driver = new AndroidDriver<>(service.getUrl(), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive")).click();
        driver.findElement(By.xpath("//*[@text= 'API Demos']")).click();
        driver.findElement(By.xpath("//*[@text='Accessibility']")).click();

        driver.closeApp();

        // appium service durduruluyor
        service.stop();

    }

}
