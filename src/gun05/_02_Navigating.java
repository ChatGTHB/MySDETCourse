package gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.bekle(3);

        WebElement element=driver.findElement(By.id("alerttest"));
       // WebElement element1= driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click(); // yeni sayfaya gittik
        MyFunc.bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğun URL bilgisini verir.

        driver.navigate().back(); // tarayıcı history'sinden geri gelme.
        MyFunc.bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğun URL bilgisini verir.

        driver.navigate().forward();
        MyFunc.bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğun URL'yi verir.

        bekleKapat();
    }
}
