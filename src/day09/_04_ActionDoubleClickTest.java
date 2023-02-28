package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

public class _04_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("doubleClickBtn"));
        MyFunc.bekle(4);

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(element).doubleClick().build();
        action.perform();

//       actions.doubleClick(element).build().perform();
//       actions.moveToElement(element).doubleClick().build().perform();

        bekleKapat();
    }
}
