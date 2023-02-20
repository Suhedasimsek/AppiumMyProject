package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test3 {
    WebDriver driver;

    @Test
    public void test1(){
        //Elements e = new Elements(driver);
        Elements e = PageFactory.initElements(driver, Elements.class);

    }
}
