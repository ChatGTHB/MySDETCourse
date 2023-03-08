package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

import java.time.Duration;

public class _01_WaitGiris extends BaseDriver {

    @Test
    public void wait1() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        button.click();

        Duration duration = Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(duration);

//        MyFunc.bekle(30); // Programı durdurur

        WebElement message = driver.findElement(By.xpath("//p[text()='WebDriver']"));

        bekleKapat();
    }
}
