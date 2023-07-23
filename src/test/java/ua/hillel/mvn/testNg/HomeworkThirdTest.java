package ua.hillel.mvn.testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class HomeworkThirdTest {
    @Parameters({"url", "browser"})
    public void showMessage(String url, String browser) {
        System.out.println(url);
        System.out.println(browser);

    }
}
