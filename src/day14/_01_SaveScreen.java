package day14;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_SaveScreen extends BaseDriver {

    @Test
    public void test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("username");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // Hata var ise ortaya çıkan element
        List<WebElement> errorMessage = driver.findElements(By.cssSelector("div[role='alert']"));

        if (errorMessage.size() > 0) { // Hata varsa
            //Ekran kaydet
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File stateInMemory=takesScreenshot.getScreenshotAs(OutputType.FILE);
            // Hafızadaki bu bilgiyi dosya olarak kaydet
            FileUtils.copyFile(stateInMemory, new File("screenShots\\screenshot.png"));
        }
        // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
        //        Biz istiyoruz ki her dosya ayrı olsun yani her kayıt ayrı olsun.
        //        Bunu nasıl yaparsınız?
        //        LocalDateTime alacaksın bilgileri.
        //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        bekleKapat();
    }
}
