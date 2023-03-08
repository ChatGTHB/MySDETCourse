package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

public class _03_ActionClickTest extends BaseDriver {

    @Test
    public void test(){
        driver.get("https://demoqa.com/buttons");
        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        // element.click();

        Actions actions = new Actions(driver); // web sayfası aksiyonlara açıldı

        Action action = actions.moveToElement(element).click().build();
        // elementin üzerine click için git orada bekle, aksiyonu hazırla
        System.out.println("Action prepared.");

        MyFunc.bekle(4);
        action.perform(); // aksiyonu gerçekleştir, işleme al, uygula, icra et
        System.out.println("Action took place");

        bekleKapat();

    }
}
