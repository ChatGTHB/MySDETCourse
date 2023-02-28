package homework._23_02_2023_Selenium_Xpath;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

public class Tests extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Automation");

        WebElement eMail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        eMail.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.xpath("//*[@placeholder='Current Address']"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        MyFunc.bekle(2);
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();

        Assert.assertTrue(fullName.getAttribute("value").contains("Automation"));
        Assert.assertTrue(eMail.getAttribute("value").contains("Testing"));
    }

    @Test
    public void Test2() {

        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123.");

        MyFunc.bekle(2);
        WebElement signInButton = driver.findElement(By.xpath("//a[text()='Sign in']"));
        signInButton.click();

        WebElement verificationMessage=driver.findElement(By.xpath("//h6[text()='Your nearest branch closes in: 30m 5s']"));
        Assert.assertTrue(verificationMessage.getText().equals("Your nearest branch closes in: 30m 5s"));
    }

    @Test
    public void Test3() {

        driver.get("https://www.snapdeal.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        searchBox.sendKeys("teddy bear");

        MyFunc.bekle(2);
        WebElement searchButton = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        searchButton.click();

        WebElement confirmation= driver.findElement(By.xpath("//div[@id='searchMessageContainer']"));

        Assert.assertTrue(confirmation.getText().contains("results for teddy bear"));
    }

    @Test
    public void Test4() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.bekle(2);
        WebElement calculatorButton = driver.findElement(By.xpath("//a[text()='Calculator']"));
        calculatorButton.click();

        WebElement input1Box = driver.findElement(By.xpath("//input[@id='number1']"));
        input1Box.sendKeys("7");

        WebElement input2Box = driver.findElement(By.xpath("//input[@id='number2']"));
        input2Box.sendKeys("6");

        MyFunc.bekle(2);
        WebElement calculator2Button = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculator2Button.click();

        WebElement result = driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println(result.getText());
    }

    @Test
    public void Test5() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.bekle(2);
        WebElement fakeAlertButton = driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        fakeAlertButton.click();

        MyFunc.bekle(2);
        WebElement showAlertButton = driver.findElement(By.xpath("//input[@id='fakealert']"));
        showAlertButton.click();

        MyFunc.bekle(2);
        WebElement okButton = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        okButton.click();
    }

    @Test
    public void Test6() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.bekle(2);
        WebElement fakeAlertButton = driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        fakeAlertButton.click();

        MyFunc.bekle(2);
        WebElement showModalButton = driver.findElement(By.xpath("//input[@id='modaldialog']"));
        showModalButton.click();

        MyFunc.bekle(2);
        WebElement okButton = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        okButton.click();

        bekleKapat();
    }
}
