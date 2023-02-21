package gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

public class _06_FindingByLinkTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // linkText yoluylaa eleman bulma işlemi sadece a tag'inde kullanılabilir.
        WebElement siparislerimLinki= driver.findElement(By.linkText("Siparişlerim"));
        // Görünen text'i "Siparişlerim" olan a tag'li web element
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());
        System.out.println("siparislerimLinki.getAttribute(\"href\") = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(\"title\") = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(\"rel\") = " + siparislerimLinki.getAttribute("rel"));

        // partialLinkTest
        WebElement link2= driver.findElement(By.partialLinkText("Süper Fiyat"));
        // görünen link text'inin bir parçası verilebiliyor.
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.bekle(2);
        driver.quit();
    }
}
