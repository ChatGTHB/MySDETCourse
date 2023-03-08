package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;

public class _07_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);

        WebElement Oslo = driver.findElement(By.id("box1"));
        WebElement Norway = driver.findElement(By.id("box101"));

        // 1. Yöntem
        // actions.dragAndDrop(Oslo,Norway).build().perform(); // Oslo'yu Norway'e ata

        // 2. Yöntem
//        actions.clickAndHold(Oslo).build().perform();
//        MyFunc.bekle(2);
//        actions.moveToElement(Norway).release().build().perform();
//        MyFunc.bekle(2);

        // 3. Yöntem -> Best Practise
        Action action= actions.dragAndDrop(Oslo,Norway).build();
        action.perform();

        bekleKapat();
    }
}
