package CssSelector_Odev_;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/* 2-   1) Bu siteye gidin. -> https://demo.applitools.com/
        2) Username kısmına "ttechno@gmail.com" girin.
        3) Password kısmına "techno123." girin.
        4) "Sign in" buttonunan tıklayınız.
        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız. */
public class S_2 extends BaseDriver {
    @Test
    public void Test2() {
        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("[id='username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        driver.findElement(By.id("password")).sendKeys("techno123.");

        driver.findElement(By.id("log-in")).click();

        WebElement text = driver.findElement(By.cssSelector("[id='time']"));
        if (text.isDisplayed()) {
            System.out.println("Koşul sağlandı");
        } else {
            System.out.println("Koşul sağlanmadı");
        }
        BekleKapat();
    }
}
