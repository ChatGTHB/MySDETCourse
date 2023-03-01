package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

public class _06_AlertPart_03 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.bekle(2);
        clickMe.click();
        // alert açılıyor

        MyFunc.bekle(2);
        // alert açılıyor
        driver.switchTo().alert().sendKeys("Yıldırım");
        driver.switchTo().alert().accept();

        MyFunc.bekle(2);
        WebElement textActual= driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Beklenen yazı gözüktü mü?", textActual.getText().contains("Yıldırım"));

        bekleKapat();
    }
}
