package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloaderPage {
    private final WebDriver driver;
    private Actions actions;

    @FindBy(linkText = "some-file.txt")
    private WebElement downloadInput;

    public DownloaderPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public DownloaderPage downloadFile() {
        downloadInput.click();
        return new DownloaderPage(driver);
    }

    public DownloaderPage waitForDownloadFile() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
        }
        return new DownloaderPage(driver);
    }


}
