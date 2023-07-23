package ua.hillel.mvn.wdManager.lesson26;

import org.testng.annotations.Test;
import pageObject.ChallengingDOM;
import ua.hillel.mvn.wdManager.BaseTest;

public class NewChallengingDOMTest extends BaseTest {
    @Test
    public void testOnChallengingDOMPage() {
        ChallengingDOM challengingDOM = openApp().goToChallengingDOM()
                .clickOnFirstButton()
                .clickOnSecondButton()
                .clickOnThirdButton()
                .getTextFromElementsInTable();
    }
}
