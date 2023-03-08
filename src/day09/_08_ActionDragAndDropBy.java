package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

public class _08_ActionDragAndDropBy extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        Actions actions = new Actions(driver);

        WebElement leftWicked = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunc.bekle(3);

        Action action = actions.dragAndDropBy(leftWicked, 100, 0).build();
        action.perform();
        MyFunc.bekle(3);

        bekleKapat();
    }
}
