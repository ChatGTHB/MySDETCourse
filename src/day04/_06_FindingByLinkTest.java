package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

public class _06_FindingByLinkTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // linkText yoluyla eleman bulma işlemi sadece html <a> tag'inde kullanılabilir.
        WebElement myOrdersLink= driver.findElement(By.linkText("Siparişlerim"));
        // Görünen text'i "Siparişlerim" olan a tag'li web element


        System.out.println("myOrdersLink.getText() = " + myOrdersLink.getText());

        System.out.println("myOrdersLink.getAttribute(\"href\") = " + myOrdersLink.getAttribute("href"));
        System.out.println("myOrdersLink.getAttribute(\"title\") = " + myOrdersLink.getAttribute("title"));
        System.out.println("myOrdersLink.getAttribute(\"rel\") = " + myOrdersLink.getAttribute("rel"));

        // partialLinkTest
        WebElement link2= driver.findElement(By.partialLinkText("Süper Fiyat"));
        // görünen link text'inin bir parçası verilebiliyor.
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.bekle(2);
        driver.quit();
    }
}
