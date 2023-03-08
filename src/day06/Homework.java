package day06;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

public class Homework extends BaseDriver {

    @Test
    public void homework(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyFunc.bekle(2);
        WebElement businessButton= driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        businessButton.click();

        MyFunc.bekle(2);
        WebElement dropDownDiscoverButton= driver.findElement(By.cssSelector("[id$='_4588']"));
        dropDownDiscoverButton.click();

        MyFunc.bekle(2);
        WebElement optionOnlineAdvertising= driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        MyFunc.bekle(2);
        WebElement everyDayButton= driver.findElement(By.cssSelector("[value='Every Day'][type='radio']"));
        everyDayButton.click();

        MyFunc.bekle(2);
        WebElement goodRadioButton= driver.findElement(By.cssSelector("[value='Good'][type='radio']"));
        goodRadioButton.click();

        MyFunc.bekle(2);
        WebElement howLongDropDownButton= driver.findElement(By.cssSelector("select[id$=_4597]"));
        howLongDropDownButton.click();

        MyFunc.bekle(2);
        WebElement option4=driver.findElement(By.cssSelector("select[id$=_4597] > :nth-child(4)"));
        option4.click();

        MyFunc.bekle(2);
        goodRadioButton.click();

        bekleKapat();
    }


    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector
}
