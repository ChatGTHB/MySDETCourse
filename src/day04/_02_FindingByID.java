package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

public class _02_FindingByID {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya git

        WebElement nameBox=driver.findElement(By.id("first_8")); // elemanı ID ile bul
        nameBox.sendKeys("Kerem"); // kutucuğa yazı gönder
        MyFunc.bekle(1);

        WebElement surnameBox=driver.findElement(By.id("last_8"));
        surnameBox.sendKeys("Yiğit");
        MyFunc.bekle(1);

//        nameBox.clear();
//        MyFunc.Bekle(1);
//        surnameBox.clear();

        // Chrome ctrl+f ye basıldığında (inceleme kısmı aktifken) inspect bölümünde
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelFirstName= driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName = " + labelFirstName.getText());

        WebElement labelLastName= driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName = " + labelLastName.getText());

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();

        MyFunc.bekle(3);
        driver.quit();
    }
}
