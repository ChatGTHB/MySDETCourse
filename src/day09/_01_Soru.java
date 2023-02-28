package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;
import utility.MyFunc;

import java.util.List;

public class _01_Soru extends BaseDriver {

//  Test Senaryosu
//  1- https://www.facebook.com/  sayfasına gidiniz
//  2- CreateNewAccount a tıklatınız.
//  3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//  4- Doğum tarihinizi Select sınıfı ile seçiniz
//  5- Email girildikten sonra emailin tekrar girilmesini isteyen
//  bir input daha açılıp öncesinde görünmediğini,
//  sonrasında ise göründüğünü assert ile doğrulayınız.

    @Test
    public void Test1() {

        driver.get("https://www.facebook.com/");

        MyFunc.bekle(1);
        List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        MyFunc.bekle(1);
        WebElement createANewAccount = driver.findElement(By.linkText("Yeni hesap oluştur"));
        createANewAccount.click();

        MyFunc.bekle(1);
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Hakan");

        MyFunc.bekle(1);
        WebElement surname = driver.findElement(By.name("lastname"));
        surname.sendKeys("Yurt");

        MyFunc.bekle(1);
        WebElement mailAgain = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(mailAgain.isDisplayed());

        MyFunc.bekle(1);
        WebElement mail = driver.findElement(By.name("reg_email__"));
        mail.sendKeys("hknyrt@hknyrt.com");

        MyFunc.bekle(1);
        Assert.assertTrue(mailAgain.isDisplayed());

        MyFunc.bekle(1);
        WebElement dayMenu = driver.findElement(By.id("day"));
        Select dMenu = new Select(dayMenu);
        dMenu.selectByValue("1");

        MyFunc.bekle(1);
        WebElement monthMenu = driver.findElement(By.id("month"));
        Select mMenu = new Select(monthMenu);
        mMenu.selectByIndex(0);

        MyFunc.bekle(1);
        WebElement yearMenu = driver.findElement(By.id("year"));
        Select yMenu = new Select(yearMenu);
        yMenu.selectByValue("2000");

        bekleKapat();

    }
}
