package CssSelector_Odev_;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class S_4 extends BaseDriver {
    /*
    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
    Calculate'e tıklayınız.
    İlk input'a herhangi bir sayı giriniz.
    İkinci input'a herhangi bir sayı giriniz.
    Calculate button'una tıklayınız.
    Sonucu alınız.
    Sonucu yazdırınız. */
    @Test
    public void Test4() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);

        driver.findElement(By.cssSelector("[id='calculatetest']")).click();
        MyFunc.Bekle(1);

        driver.findElement(By.cssSelector("[id='number1']")).sendKeys("3");
        MyFunc.Bekle(1);

        driver.findElement(By.cssSelector("[id='number2']")).sendKeys("4");
        MyFunc.Bekle(1);

        driver.findElement(By.cssSelector("[id='calculate']")).click();
        MyFunc.Bekle(1);

        System.out.println("Sonuç = " + driver.findElement(By.cssSelector("[id='answer']")).getText());

        BekleKapat();
    }
}
