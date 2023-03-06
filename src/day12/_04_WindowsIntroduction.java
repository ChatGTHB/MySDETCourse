package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

import java.util.List;
import java.util.Set;

public class _04_WindowsIntroduction extends BaseDriver {
    @Test
    public void Test4() {

        driver.get("https://www.selenium.dev/");

        // Ana sayfada olunan aşama
        // Bulunulan sayfanın id'sini almak için
        String homepageWindowID=driver.getWindowHandle();
        System.out.println("homepageWindowID = " + homepageWindowID);

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mail"))
                link.click();
        }

        // Bütün sayfaların açıldığı aşama
        Set<String> windowsIDs=driver.getWindowHandles();
        for (String id : windowsIDs) {
            System.out.println("id = " + id);
        }

        MyFunc.bekle(10);
        bekleKapat();
    }

}
