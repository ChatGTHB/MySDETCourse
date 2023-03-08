package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

public class _03_YonTuslariSecim extends BaseDriver {
    @Test
    public void test1() {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions actions = new Actions(driver);
        // elemente git, içine tıklat, b tuşuna bas

        Action action = actions
                .moveToElement(element)
                .click()
                .sendKeys("b")
                .build();

        MyFunc.bekle(2);
        action.perform();

        MyFunc.bekle(2);

        action = actions
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();

        action.perform();

        bekleKapat();
    }
}
