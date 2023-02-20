package AHLesson;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static deneme.Enum_By_Element.*;


@Listeners({ SoftAsserts.class})    // for use SOFT assertion
public class ClosestElement {

    @BeforeTest
    void setup(){
        Configuration.browser = "chrome";
        //Configuration.browser = "firefox";
        //Configuration.browser = "opera";
        //Configuration.browser = "edge";

        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void test(){
        open("/text-box");
        Username.getElement().setValue("Ahmet");
        Username.getElement().closest("input").setValue("aaa@aaa.com");
        CurrentAddress.getElement().setValue("Current address");
        Selenide.$$(PermanentAddress.getBy()).get(0).setValue("Permanent address");
        SubmitButton.getElement().scrollTo();
        //SubmitButton.getElement().click();
        SubmitButton.getElement().click(ClickOptions.usingJavaScript().offset(10,10));
        
    }

}


