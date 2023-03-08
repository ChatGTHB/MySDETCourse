package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;

public class _03_IFrameQuestion extends BaseDriver {
    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
    */
    @Test
    public void test3() {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.xpath("(/html/body/input)[1]"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);

        WebElement checkbox = driver.findElement(By.xpath("//*[@id='a']"));
        checkbox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        WebElement animalsMenu = driver.findElement(By.xpath("//*[@id='animals']"));
        Select animal = new Select(animalsMenu);
        animal.selectByIndex(3);

        bekleKapat();
    }
}
