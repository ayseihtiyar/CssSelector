package CssSelector;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın. */

public class S_1 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demoqa.com/text-box");

        WebElement userName =driver.findElement(By.id("userName"));
        userName.sendKeys("Automation");

        MyFunc.Bekle(2);

        WebElement userMail = driver.findElement(By.id("userEmail"));
        userMail.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement txt1 = driver.findElement(By.id("currentAddress"));
        txt1.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        WebElement txt2 = driver.findElement(By.id("permanentAddress"));
        txt2.sendKeys("Testing Permanent Address");

        WebElement btn = driver.findElement(By.id("submit"));
        btn.click();

        WebElement fullNameDegeri=driver.findElement(By.id("name"));
        WebElement mailDegeri=driver.findElement(By.id("email"));


        if (fullNameDegeri.getText().contains("Automation")) {
            System.out.println("Full Name'in içinde Automation'ın  bulunuyor.");
        }else {
            System.out.println("Full Name'in içinde Automation'ın bulunmuyor");
        }
        if (mailDegeri.getText().substring(0,(mailDegeri.getText().indexOf("@"))).contains("Testing")){
            System.out.println("E-mail de 'Testing' bulunuyor.");
        }else {
            System.out.println("E-mail de 'Testing' bulunmuyor.");
        }
        BekleKapat();
    }
}
