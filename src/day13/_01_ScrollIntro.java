package day13;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utility.BaseDriver;
import utility.MyFunc;

public class _01_ScrollIntro extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://p-del.co/");
        MyFunc.bekle(2);

//        Actions actions=new Actions(driver); // Driver üzerinden aksiyon işlemleri için
//        Select select=new Select(element); // Bir tane element için

        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js = (JavascriptExecutor) driver; // cast yapıldı

        js.executeScript("window.scrollBy(0,3000)");
        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        // (0,3000) -> (x,y) Sayfayı sağa x kadar ve aşağı y kadar kaydırır.
        // 3000 pixel kadar aşağı kaydıracak.
        MyFunc.bekle(2);

        js.executeScript("window.scrollBy(0,-3000)");
        MyFunc.bekle(2);
        bekleKapat();
    }
}
