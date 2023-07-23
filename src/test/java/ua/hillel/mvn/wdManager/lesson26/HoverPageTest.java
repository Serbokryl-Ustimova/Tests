package ua.hillel.mvn.wdManager.lesson26;

import org.testng.annotations.Test;
import pageObject.Hover;
import ua.hillel.mvn.wdManager.BaseTest;

public class HoverPageTest extends BaseTest {
    @Test
    public void hoverPageTest() {
        Hover hover = openApp().goToHoverPage()
                .hoverAndShowTextFirstElement()
                .hoverAndShowTextSecondElement()
                .hoverAndShowTextThirdElement();
    }
}
