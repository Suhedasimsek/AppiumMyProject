package pac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Test2 {
    WebDriver driver;
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/contactus");

        By inputs = By.cssSelector(".page-body input[type='text']");
        String[] arr = {"text1", "text2"};
        for (int i = 0; i < 2; i++) {
            driver.findElements(inputs).get(i).sendKeys(arr[i]);
            driver.navigate().refresh();
        }

        driver.quit();
    }
}
