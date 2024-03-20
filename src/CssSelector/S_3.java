package CssSelector;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S_3 extends BaseDriver {
    /*
    3-
        1) Bu siteye gidin. -> https://www.snapdeal.com/
        2) "teddy bear" aratın ve Search butonuna tıklayın.
        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
     */
    @Test
    public void Test3() {
        driver.get("https://www.snapdeal.com/");

        driver.findElement(By.cssSelector("[id='inputValEnter']")).sendKeys("teddy bear");
        MyFunc.Bekle(2);

        driver.findElement(By.cssSelector("[class='sd-icon sd-icon-search-under-catagory lfloat']")).click();
        MyFunc.Bekle(2);

        WebElement element = driver.findElement(By.cssSelector("[id='searchMessageContainer'] span"));
        Assert.assertTrue("Mesaj bulunamadı", element.getText().contains("We've got"));

        BekleKapat();
    }
}
