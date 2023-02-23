package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _01_CssSelector extends BaseDriver {

    // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
    // 2-Butona tıklatınız
    // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement textBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        textBox.sendKeys("Merhaba Selenium");

        WebElement button= driver.findElement(By.cssSelector("[onclick='showInput();']"));
        button.click();

        WebElement message= driver.findElement(By.cssSelector("[id='display']"));

        if(message.getText().equals("Merhaba Selenium")){
            System.out.println("Test passed.");
        }else{
            System.out.println("Test failed");
        }

        bekleKapat();


    }
}
