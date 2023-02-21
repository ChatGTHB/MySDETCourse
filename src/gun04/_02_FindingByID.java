package gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

public class _02_FindingByID {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya git

        WebElement isimKutusu=driver.findElement(By.id("first_8")); // elemanı ID ile bul
        isimKutusu.sendKeys("Kerem"); // kutucuğa yazı gönder
        MyFunc.bekle(1);

        WebElement soyisimKutusu=driver.findElement(By.id("last_8"));
        soyisimKutusu.sendKeys("Yiğit");
        MyFunc.bekle(1);


//        isimKutusu.clear();
//        MyFunc.Bekle(1);
//        soyisimKutusu.clear();

        // Chrome ctrl+f ye basıldığında inspect bölümünde
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
