package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class _02_ExplitWait extends BaseDriver {

    @Test
    public void wait2(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        button.click();

        Duration duration=Duration.ofSeconds(30);
        WebDriverWait wait=new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        // Beklenen Kriterlerden                     -> ExpectedConditions
        // Verilen Locatar'daki element görünür hale -> visibilityOfElementLocated
        // gelene kadar bekle                        -> wait.until

        System.out.println("Bitti");

        bekleKapat();
    }
}
