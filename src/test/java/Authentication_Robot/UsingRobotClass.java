package Authentication_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UsingRobotClass extends AuthenticationBaseClass {
    WebDriver driver;
    WebDriverWait wait;

    /*  Robot class, java.awt'ye aittir.
        Browser, window, popup, element algilamaz.
        Sadece klavye ve mouse islemlerini, cursor'un aktif oldugu yerde isletir.
        Yapilacak islem aktif olan pencere de gecerlisir.
        Browser ya da windows penceresi olmasi farketmez.
        Action class, Selenium'a aittir ve HTML ile sinirlisir.
        Action class HTML disarisia ulasamaz.
     */


    String url = "https://the-internet.herokuapp.com/basic_auth";
    String user = "admin";
    String pass = "admin";

    By authSuccess = By.xpath("//h3[text()='Basic Auth']");

    @Test
    public void robotClassAuthentication() throws InterruptedException {
       driver.get(url);
       Thread.sleep(2000);
        writeString(user);
        Thread.sleep(2000);
        writeSpecial(RobotKey.TAB);
        writeString(pass);
        Thread.sleep(2000);
        writeSpecial(RobotKey.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(authSuccess));
    }



}
