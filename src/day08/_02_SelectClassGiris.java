package day08;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;

public class _02_SelectClassGiris extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        // Bu element select tag'i ile başlıyorsa, bunu Select'e cast yap ve öyle kullan

        Select ddMenu = new Select(webMenu); // elementi daha rahat kullanılabilir SELECT nesnesine dönüştürdü.
        ddMenu.selectByIndex(4);
//        ddMenu.selectByValue("search-alias=electronics");
//        ddMenu.selectByVisibleText("Elektronik");

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        bekleKapat();
    }
}
