package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");
        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));

        //  <input autocomplete="off" name="keyword" type="text"
        //  class="col-xs-20 searchformInput keyword"
        //  id="inputValEnter" onkeypress="clickGo(event, this)" placeholder=""
        //  value="" data-ddg-inputtype="unknown">

        // Elemanın parametrelerine ulaşmak için getAttribute kullanılır.
        System.out.println("inputValEnter.getAttribute(\"class\") = " + inputValEnter.getAttribute("class"));

        // Class'ın karşılığı olan CSS-Şekillendirme değerlerini almak için getCssValue kullanılır.
        System.out.println("inputValEnter.getCssValue(\"color\") = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(\"font-size\") = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(\"background\") = " + inputValEnter.getCssValue("background"));

        bekleKapat();
    }
}
