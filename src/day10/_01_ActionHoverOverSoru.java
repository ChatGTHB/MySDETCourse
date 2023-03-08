package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

//     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.
public class _01_ActionHoverOverSoru extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://www.etsy.com/");

        WebElement jewelryAccessories = driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));
        WebElement necklaces = driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));
        WebElement bibNecklaces = driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(jewelryAccessories).build().perform();
        MyFunc.bekle(2);
        actions.moveToElement(necklaces).build().perform();
        MyFunc.bekle(2);
        actions.moveToElement(bibNecklaces).click().build().perform(); // bibNecklaces.click();
        MyFunc.bekle(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("bib-necklaces"));

        bekleKapat();
    }
}
