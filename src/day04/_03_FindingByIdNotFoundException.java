package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try {
            WebElement labelFirstName = driver.findElement(By.id("hataliLocator"));
            //System.out.println("labelFirstName = " + labelFirstName.getText());
        } catch (Exception e) {
            System.out.println("WebElement bulunamadı " + e.getMessage());
        }

        MyFunc.bekle(3);
        driver.quit();
    }
}
