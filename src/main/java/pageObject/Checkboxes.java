package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Checkboxes {
    private final WebDriver driver;

    @FindBy(css = "[type='checkbox']")
    private List<WebElement> checkboxesElementsInput;

    public Checkboxes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Checkboxes clickOnEveryCheckbox() {
        for (WebElement el : checkboxesElementsInput) {
            el.click();
        }
        return new Checkboxes(driver);
    }
}
