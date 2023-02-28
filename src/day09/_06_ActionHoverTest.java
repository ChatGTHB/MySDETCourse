package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

public class _06_ActionHoverTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.bekle(2);

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(element).build();
        action.perform();

        bekleKapat();
    }
}
