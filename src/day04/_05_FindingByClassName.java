package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement className= driver.findElement(By.className("form-textbox"));
        className.sendKeys("Kerem");
        // birden fazla aynı locatar'a sahip olan eleman bulunduğunuda :
        // findElement ilk elementi bulur.

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println("labels.size() = " + labels.size());

        for(WebElement e : labels){
            System.out.println("e.getText() = " + e.getText());
        }

        // aranılan eleman bulunamazsa : findElement NoSuchElement hatası verir.
        // findElements is size ı 0 olan List verir, yani hata vermez.

        MyFunc.bekle(3);
        driver.quit();
    }
}
