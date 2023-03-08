package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void test1() {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleContainer"));
        //element.sendKeys("Ahmet");

        Actions actions=new Actions(driver);
        Action action=actions
                .moveToElement(element) // kutucuğa gel
                .click()                // içine tıkla
                .keyDown(Keys.SHIFT)    // shift tuşuna bas
                .sendKeys("a")          // shift "a" -> "A"
                .keyUp(Keys.SHIFT)      // shift tuşunu bırak
                .sendKeys("hmet")       // "hmet" gönder
                .build();               // action hazırlandı

        MyFunc.bekle(2);
        action.perform();

        bekleKapat();
    }
}
