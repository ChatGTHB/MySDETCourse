package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

public class _05_ActionRightClickTest extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("rightClickBtn"));
        MyFunc.bekle(2);

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(element).contextClick().build(); // contextClick=rightClick
        action.perform();

//        actions.moveToElement(element).contextClick().build().perform();
//        new Actions(driver).contextClick().build().perform();

        bekleKapat();
    }
}
