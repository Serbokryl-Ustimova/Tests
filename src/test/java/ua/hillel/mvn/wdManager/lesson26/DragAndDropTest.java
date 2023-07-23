package ua.hillel.mvn.wdManager.lesson26;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObject.DragAndDrop;
import ua.hillel.mvn.wdManager.BaseTest;

public class DragAndDropTest extends BaseTest {
    private Actions actions;

    @Test
    public void dragAndDrop() {
        DragAndDrop dragAndDrop = openApp().goToDragAndDrop()
                .dragAndDrop();
    }

}
