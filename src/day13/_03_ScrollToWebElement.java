package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _03_ScrollToWebElement extends BaseDriver {

    @Test
    public void test1() {

        driver.manage().deleteAllCookies(); // Cookiesler silindi

        driver.get("https://www.copado.com/robotic-testing");

        JavascriptExecutor js = (JavascriptExecutor) driver; // Casting

        WebElement readStoryButton = driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", readStoryButton); // readStoryButton'a kadar kaydır

        // readStoryButton.click(); tıklatma özelliğini kaybettiren elementlerin altında olduğunda tıklanamaz
        js.executeScript("arguments[0].click();", readStoryButton); // HTML içinden elemente ulaşır ve tıklatır

        bekleKapat();
    }
}
