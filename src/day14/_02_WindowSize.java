package day14;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import utility.BaseDriver;
import utility.MyFunc;
import java.io.IOException;
public class _02_WindowSize extends BaseDriver {
    @Test
    public void test1() throws IOException {
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        MyFunc.bekle(4);

        Dimension dimension = new Dimension(516, 600);
        driver.manage().window().setSize(dimension);

        bekleKapat();
    }
}
