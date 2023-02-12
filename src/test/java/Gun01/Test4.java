package Gun01;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.App;
import utils.Device;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Test4 {

    @Test
public void test1(){
    Driver.runAppium();

    AppiumDriver<MobileElement> driver = Driver.getDriver(Device.HUAWEIP40, App.APIDEMO);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive")).click();
        driver.findElement(By.xpath("//*[@text= 'API Demos']")).click();
        driver.findElement(By.xpath("//*[@text='Accessibility']")).click();

    Driver.stopAppium();
}
}
