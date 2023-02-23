package homework._22_02_2023_Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

public class Tests extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demoqa.com/text-box");

        String automation="Automation";
        WebElement fullName = driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullName.sendKeys("Automation");

        WebElement eMail = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        eMail.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector("[id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.cssSelector("[id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement submitButton= driver.findElement(By.cssSelector("[id='submit' ]"));
        MyFunc.bekle(2);
        submitButton.click();

        //Assert.assertTrue(fullName.getText().contains(automation));
        Assert.assertTrue(fullName.getAttribute("value").equals("Automation"));
        Assert.assertTrue(eMail.getAttribute("value").contains("Testing"));

        bekleKapat();

    }

    @Test
    public void Test2(){

        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("[id='username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id='password']"));
        password.sendKeys("techno123.");


        WebElement signInButton= driver.findElement(By.cssSelector("[id='log-in']"));
        MyFunc.bekle(2);
        signInButton.click();

        bekleKapat();
    }

    @Test
    public void Test3(){

        driver.get("https://www.snapdeal.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("[id='inputValEnter']"));
        searchBox.sendKeys("teddy bear");

        WebElement searchButton= driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        MyFunc.bekle(2);
        searchButton.click();
        MyFunc.bekle(2);

        bekleKapat();
    }

    @Test
    public void Test4(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculatorButton = driver.findElement(By.cssSelector("[id='calculatetest']"));
        MyFunc.bekle(2);
        calculatorButton.click();

        WebElement input1Box = driver.findElement(By.cssSelector("[id='number1']"));
        input1Box.sendKeys("7");

        WebElement input2Box = driver.findElement(By.cssSelector("[id='number2']"));
        input2Box.sendKeys("6");

        WebElement calculator2Button = driver.findElement(By.cssSelector("[id='calculate']"));
        MyFunc.bekle(2);
        calculator2Button.click();

        WebElement result= driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println(result.getText());

        bekleKapat();
    }

    @Test
    public void Test5(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertButton = driver.findElement(By.cssSelector("[id='fakealerttest']"));
        MyFunc.bekle(2);
        fakeAlertButton.click();


        WebElement showAlertButton = driver.findElement(By.cssSelector("[id='fakealert']"));
        MyFunc.bekle(2);
        showAlertButton.click();

        WebElement okButton = driver.findElement(By.cssSelector("[id='dialog-ok']"));
        MyFunc.bekle(2);
        okButton.click();

        bekleKapat();
    }

    @Test
    public void Test6(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertButton = driver.findElement(By.cssSelector("[id='fakealerttest']"));
        MyFunc.bekle(2);
        fakeAlertButton.click();


        WebElement showModalButton = driver.findElement(By.cssSelector("[id='modaldialog']"));
        MyFunc.bekle(2);
        showModalButton.click();

        WebElement okButton = driver.findElement(By.cssSelector("[id='dialog-ok']"));
        MyFunc.bekle(2);
        okButton.click();

        bekleKapat();
    }
}
