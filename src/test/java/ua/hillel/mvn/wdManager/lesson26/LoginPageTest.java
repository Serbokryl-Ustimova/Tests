package ua.hillel.mvn.wdManager.lesson26;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.SecurePage;
import ua.hillel.mvn.wdManager.BaseTest;

public class LoginPageTest extends BaseTest {
    @Test
    public void logInTestWithValidCredentials() {

        SecurePage securePage = openApp().goToAuth()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickButton();

        Assert.assertEquals(securePage.getTextSuccess(), "Secure Area");
        securePage.logOut();
    }

    @Test
    public void logInTestWithInvalidCredentials() {

        LoginPage loginPage = openApp().goToAuth()
                .setUsername("tomsmith6000")
                .setPassword("SuperSecretPassword!")
                .clickButtonWithInvalidCredentials();

        Assert.assertEquals(loginPage.getAllertText(), "Your username is invalid!\n" +
                "×");

    }

}
