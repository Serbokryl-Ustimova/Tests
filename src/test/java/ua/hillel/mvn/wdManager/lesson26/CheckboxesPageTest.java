package ua.hillel.mvn.wdManager.lesson26;

import org.testng.annotations.Test;
import pageObject.Checkboxes;
import ua.hillel.mvn.wdManager.BaseTest;

public class CheckboxesPageTest extends BaseTest {
    @Test
    public void checkboxesPageTest() {
        Checkboxes checkboxes = openApp().goToCheckboxes()
                .clickOnEveryCheckbox();
    }
}
