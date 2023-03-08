package day08;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

public class _01_ElemaninStatusu extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("tuesday.isDisplayed() = " + tuesday.isDisplayed());
        System.out.println("tuesday.isEnabled() = " + tuesday.isEnabled());
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());

        tuesday.click();
        MyFunc.bekle(2);
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());

        WebElement saturday = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));

        System.out.println("saturday.isDisplayed() = " + saturday.isDisplayed());
        System.out.println("saturday.isEnabled() = " + saturday.isEnabled());
        System.out.println("saturday.isSelected() = " + saturday.isSelected());

        bekleKapat();
    }
}
