package pac;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class Test1 {
    @Test
    public void test1(){
        Configuration.browser = "firefox";
        open("https://opensource-demo.orangehrmlive.com/");
        $("[name='username']").should(Condition.visible).setValue("xxxxxx");
        $("").scrollIntoView(true).should(Condition.enabled).hover().screenshot();
        $$("").stream().filter(e-> e.isDisplayed()).toList().forEach(e-> System.out.println(e.getText()));
    }


    @Test
    public void test2(){
        open("https://demo.openmrs.org/");
        WebDriver driver = WebDriverRunner.getWebDriver();

        By id = By.id("username");
        driver.navigate().refresh();
        driver.findElement(id).sendKeys("Demo");

    }

}
