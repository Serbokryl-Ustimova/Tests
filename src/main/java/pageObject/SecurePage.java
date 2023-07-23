package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private final WebDriver driver;

    public SecurePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextSuccess() {
        return driver.findElement(By.tagName("h2")).getText();

    }
    public LoginPage logOut() {
        driver.findElement(By.cssSelector("a.button.secondary.radius")).click();
        return new LoginPage(driver);
    }
}
