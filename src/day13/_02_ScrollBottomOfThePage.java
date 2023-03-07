package day13;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utility.BaseDriver;

public class _02_ScrollBottomOfThePage extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://p-del.co/");

        JavascriptExecutor js = (JavascriptExecutor) driver; // cast yapıldı

        // Syfanın sonuna kadar kaydırır
        js.executeScript("window.scrollTo(0,0);"); // En başa 0 noktasına gider.

        bekleKapat();
    }
}
