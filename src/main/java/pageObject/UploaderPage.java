package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class UploaderPage {
    private final WebDriver driver;
    private Actions actions;

    @FindBy(id = "file-upload")
    private WebElement uploadInput;

    @FindBy(id = "file-submit")
    private WebElement buttonInput;

    public UploaderPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public UploaderPage uploadFile() {
        File file = new File("target/download/some-file.txt");
        actions.moveToElement(uploadInput).sendKeys(file.getAbsolutePath());
        buttonInput.click();
        return new UploaderPage(driver);
    }
}
