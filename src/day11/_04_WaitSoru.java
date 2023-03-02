package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {

    @Test
    public void Wait4(){

    /*
    Senaryo
    1-  https://www.demoblaze.com/index.html  siteyi açınız.
    2- Samsung galaxy s6  linkine tıklayınız.
    3- Sepete ekleyiniz.
    4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
    */

        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsung= driver.findElement(By.linkText("Samsung galaxy s6"));
        samsung.click();

        WebElement addToCart= driver.findElement(By.linkText("Add to cart"));
        addToCart.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement back= driver.findElement(By.id("nava"));
        back.click();

        bekleKapat();

    }
}
