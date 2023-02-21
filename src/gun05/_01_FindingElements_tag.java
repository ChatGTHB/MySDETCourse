package gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        // verilen taglardaki tüm elemanları aldık.

        for (WebElement e : links) {
            if (e.getText().isEmpty()) {
                System.out.print("(\"href\") = " + e.getAttribute("href"));
                System.out.print("(\"title\") = " + e.getAttribute("title"));
                System.out.println("(\"rel\") = " + e.getAttribute("rel"));
            }
        }
        bekleKapat();
    }

}
