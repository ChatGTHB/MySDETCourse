package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;

public class _02_IFramesPass extends BaseDriver {
    /*
   Scenerio :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */

    @Test
    public void Test2() {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        // //b[@id='topic']/following-sibling::input
        // b[id='topic']~input
        // #topic+input

        WebElement input = driver.findElement(By.xpath("(/html/body/input)[1]"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame();
        //  driver.switchTo().defaultContent(); // Aynı işlemi yapar çünkü bir kademe içeri girilmiş durumda
        driver.switchTo().frame(1);

        WebElement animalsMenu = driver.findElement(By.xpath("//*[@id='animals']"));
        Select animal = new Select(animalsMenu);
        animal.selectByValue("avatar");

        bekleKapat();
    }
}
