package CssSelector;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S_6 extends BaseDriver {
    /* 6-  Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
           Fake Alerts'e tıklayınız.
           Show modal dialog buttonuna tıklayınız.
           Ok'a tıklayınız.
           Alert kapanmalıdır.*/
    @Test
    public void Test6() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        driver.findElement(By.cssSelector("[id='fakealerttest']")).click();
        MyFunc.Bekle(2);

        driver.findElement(By.cssSelector("[id='modaldialog']")).click();
        MyFunc.Bekle(2);

        driver.findElement(By.cssSelector("[id='dialog-ok']")).click();

        WebElement element = driver.findElement(By.cssSelector("[id='dialog-text']"));
        if (!element.isDisplayed()) {
            System.out.println("Alert kapantı.");
        } else {
            System.out.println("Alert hala açık.");
        }

        BekleKapat();
    }
}
