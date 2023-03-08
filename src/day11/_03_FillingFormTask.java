package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {

    @Test
    public void wait3(){

        /*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
        */

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.id("title"));
        name.sendKeys("Name");

        WebElement comment= driver.findElement(By.id("description"));
        comment.sendKeys("Comment");

        WebElement submitButton= driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement successMessage= driver.findElement(By.id("submit-control"));

        Assert.assertEquals("Form submited Successfully!",successMessage.getText());
        bekleKapat();

//        WebElement button=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
//        button.click();
//
//        Duration duration=Duration.ofSeconds(30);
//        WebDriverWait wait=new WebDriverWait(driver,duration);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));


    }
}
