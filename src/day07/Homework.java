package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

import java.util.List;

public class Homework extends BaseDriver {
    @Test
    public void test1() {

        driver.get("https://www.saucedemo.com/");

        MyFunc.bekle(2);
        WebElement username = driver.findElement(By.xpath("//input[@class='input_error form_input' and @placeholder='Username']"));
        username.sendKeys("standard_user");

        MyFunc.bekle(2);
        WebElement password = driver.findElement(By.xpath("//input[@class='input_error form_input' and @placeholder='Password']"));
        password.sendKeys("secret_sauce");

        MyFunc.bekle(2);
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        loginButton.click();

        MyFunc.bekle(2);
        WebElement backpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        backpack.click();

        MyFunc.bekle(2);
        WebElement addBackpack = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addBackpack.click();

        MyFunc.bekle(2);
        WebElement backToProducts = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        backToProducts.click();

        MyFunc.bekle(2);
        WebElement boltTshirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirt.click();

        MyFunc.bekle(2);
        WebElement addboltTshirt = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addboltTshirt.click();

        MyFunc.bekle(2);
        WebElement goYourCart = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        goYourCart.click();

        MyFunc.bekle(2);
        WebElement checkout = driver.findElement(By.xpath("//button[text()='Checkout']"));
        checkout.click();

        MyFunc.bekle(2);
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Said");

        MyFunc.bekle(2);
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Mutlu");

        MyFunc.bekle(2);
        WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zipCode.sendKeys("23000");

        MyFunc.bekle(2);
        WebElement continue_ = driver.findElement(By.xpath("//input[@type='submit']"));
        continue_.click();

        MyFunc.bekle(2);
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='item_pricebar']"));

        double itemTotal = 0;
        for (WebElement item : items) {
            itemTotal += Double.parseDouble(item.getText().replace("$", ""));
        }

        WebElement itemTotal_WE = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double itemTotal_WE_Double = Double.parseDouble(itemTotal_WE.getText().replaceAll("[^0-9,.]",""));
        Assert.assertTrue(itemTotal==itemTotal_WE_Double);

        bekleKapat();
    }
}
/*
1- https://www.saucedemo.com/
2- Login işlemini yapınız.
( Accepted usernames are:
  standard_user
  locked_out_user
  problem_user
  performance_glitch_user

  Password for all users:
  secret_sauce)
3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
4- Sonra geri dönün (Back to products e tıklatın).
5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
6- Sepete tıklatın.
7- CheckOut a tıklatın.
8- Kullanıcı bilgilerini doldurup Continue ya tıklatın.
9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
   Item total e eşit olup olmadığını Assert ile test edin.

Bu soruda tamamen XPATH kullanılacaktır.
* */