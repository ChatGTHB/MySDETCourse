package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;
import utility.MyFunc;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

//        List<WebElement> acceptAll = driver.findElements(By.xpath("//span[text()='Accept All']"));
//        if (acceptAll.size() > 0) {
//            acceptAll.get(0).click();
//        }

        Robot robot = new Robot();

        for (int i = 0; i < 21; i++) {
            robot.keyPress(KeyEvent.VK_TAB); // Tuşa basıldı
            robot.keyRelease(KeyEvent.VK_TAB); // Tuş bırakıldı
        }
        robot.keyPress(KeyEvent.VK_ENTER); // Tuşa basıldı
        robot.keyRelease(KeyEvent.VK_ENTER); // Tuş bırakıldı

        // Buraya kadar windows dosya bul açıldı.
        // Aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor.
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\cihat\\Desktop\\Sundry\\dosyaYolu.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        MyFunc.bekle(1);
        robot.keyPress(KeyEvent.VK_CONTROL); // Tuşa basıldı
        robot.keyPress(KeyEvent.VK_V); // Tuşa basıldı

        MyFunc.bekle(2);
        robot.keyRelease(KeyEvent.VK_CONTROL); // Tuşa basıldı
        robot.keyRelease(KeyEvent.VK_V); // Tuşa basıldı

        robot.keyPress(KeyEvent.VK_ENTER); // Tuşa basıldı
        robot.keyRelease(KeyEvent.VK_ENTER); // Tuş bırakıldı

        // Check Box'a gelindi
        MyFunc.bekle(1);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB); // Tuşa basıldı
            robot.keyRelease(KeyEvent.VK_TAB); // Tuş bırakıldı
        }

        MyFunc.bekle(1);
        robot.keyPress(KeyEvent.VK_SPACE); // Tuşa basıldı
        robot.keyRelease(KeyEvent.VK_SPACE); // Tuş bırakıldı

        MyFunc.bekle(1);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB); // Tuşa basıldı
            robot.keyRelease(KeyEvent.VK_TAB); // Tuş bırakıldı
        }

        MyFunc.bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER); // Tuşa basıldı
        robot.keyRelease(KeyEvent.VK_ENTER); // Tuş bırakıldı

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement message = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(message.isDisplayed());

        bekleKapat();
    }
}
