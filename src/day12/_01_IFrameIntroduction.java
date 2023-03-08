package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _01_IFrameIntroduction extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://chercher.tech/practice/frames");

        // id=frame1  name=iamFrame index?=Bulunduğu sayfadaki kod sayısı
        driver.switchTo().frame(0); // name ve id oldukça yavaş çalışıyor, index hızlı

        WebElement input = driver.findElement(By.xpath("(/html/body/input)[1]"));
        input.sendKeys("Türkiye");

        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmem lazım.
        // driver.switchTo().frame(0);  // ilgili odaya (iframe) geç
        // driver.switchTo().parentFrame(); // bir önceki odaya geç, parent e geç
        // driver.switchTo().defaultContent(); // ilk ana sayfaya direk geçer

        bekleKapat();
    }
}
