package homework._28_02_2023_Selenium_DragAndDrop;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunc;

import java.util.List;

public class Tests extends BaseDriver {
    //    Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//    buradaki ülke ve şehirleri findElements ile topluca bularak
//    bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
//
//    Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//    buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
//
//    challenge sorusu
//    Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
//    buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
    @Test
    public void Test1() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> cities = driver.findElements(By.xpath("//div[starts-with(@id,'a') and @class='dragDropSmallBox']"));
        List<WebElement> blanks = driver.findElements(By.xpath("//div[starts-with(@id,'q') and @class='dragDropSmallBox']"));

        for (int i = 0; i < cities.size(); i++) {
            Actions actions = new Actions(driver);
            actions.clickAndHold(cities.get(i)).build().perform();
            MyFunc.bekle(1);
            for (WebElement blank : blanks) {
                if (cities.get(i).getAttribute("id").substring(1).equals(blank.getAttribute("id").substring(1))) {
                    actions.moveToElement(blank).release().build().perform();
                }
            }
        }
    }
    @Test
    public void Test2() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> students = driver.findElements(By.xpath("//ul[@id='allItems']"));
        for(WebElement student:students){
            System.out.println(student.getText());
        }
        System.out.println(students.size());


//        List<WebElement> blanks = driver.findElements(By.xpath("//div[starts-with(@id,'q') and @class='dragDropSmallBox']"));
//
//        for (int i = 0; i < cities.size(); i++) {
//            Actions actions = new Actions(driver);
//            actions.clickAndHold(cities.get(i)).build().perform();
//            MyFunc.bekle(1);
//            for (WebElement blank : blanks) {
//                if (cities.get(i).getAttribute("id").substring(1).equals(blank.getAttribute("id").substring(1))) {
//                    actions.moveToElement(blank).release().build().perform();
//                }
//            }
//        }
//        bekleKapat();
    }
}
