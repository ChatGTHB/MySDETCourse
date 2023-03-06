package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

import java.util.List;
import java.util.Set;

public class _05_WindowsQuestion extends BaseDriver {

    /*
    Scenerio:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Ana sayfa harici diğer tüm sayfaları kapatınız.
 */
    @Test
    public void Test5() {
        driver.get("https://www.selenium.dev/");

        String homepageWindowID = driver.getWindowHandle();
        System.out.println("homepageWindowID = " + homepageWindowID);

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mail"))
                link.click();
        }

        // Bütün sayfaların açıldığı aşama

        Set<String> windowsIDs = driver.getWindowHandles();
        for (String id : windowsIDs) {
            driver.switchTo().window(id); // Sıradaki tabdaki window'a geçilmiş oldu
            System.out.println("title = " + driver.getTitle()+", url = " + driver.getCurrentUrl());
            if(id.equals("homepageWindowID")){
                continue;
            }
            driver.switchTo().window(id);
            driver.close();
        }

        bekleKapat();
    }
}
