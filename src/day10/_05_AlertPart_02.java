package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;
public class _05_AlertPart_02 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        MyFunc.bekle(2);
        clickMe.click();
        // alert açılıyor

        MyFunc.bekle(2);
        // alert açılıyor
        driver.switchTo().alert().dismiss();
        MyFunc.bekle(2);

        bekleKapat();
    }
}
