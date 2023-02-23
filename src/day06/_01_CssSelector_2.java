package day06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
public class _01_CssSelector_2 extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement textBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        textBox.sendKeys("Merhaba Selenium");

        String myMessage="Merhaba Selenium";
        WebElement button = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        button.click();

        WebElement message = driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("Aranılan ibare bulunamadı.",message.getText().equals(myMessage));// Verilen değer TRUE mu
        // Hata yok ise yani içindeki değer TRUE ise hiç bilgi vermez.

        bekleKapat();
    }
}
