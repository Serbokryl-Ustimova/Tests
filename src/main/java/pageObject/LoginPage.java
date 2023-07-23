package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver driver;

    @FindBy(css = "input[name='username']")
    private WebElement usernameInput;

    @FindBy(css = "input#password")
    private WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    private WebElement clickButtonInput;

    @FindBy(css = ".flash.error")
    private WebElement allertTextInput;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String username) {
        usernameInput.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public SecurePage clickButton() {
        clickButtonInput.click();
        return new SecurePage(driver);
    }

    public LoginPage clickButtonWithInvalidCredentials() {
        clickButtonInput.click();
        return new LoginPage(driver);
    }

    public String getAllertText() {
        return allertTextInput.getText();
    }

    public SecurePage logIn(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickButton();
    }
}
