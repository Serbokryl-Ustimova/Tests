package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private final WebDriver driver;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationInput;

    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDOMInput;

    @FindBy(linkText = "Checkboxes")
    private WebElement checkboxesInput;

    @FindBy(linkText = "Drag and Drop")
    private WebElement dragAndDropInput;

    @FindBy(linkText = "Hovers")
    private WebElement hoverInput;

    @FindBy(linkText = "File Download")
    private WebElement downloadInput;

    @FindBy(linkText = "File Upload")
    private WebElement uploadInput;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage goToAuth() {
        formAuthenticationInput.click();
        return new LoginPage(driver);
    }

    public ChallengingDOM goToChallengingDOM() {
        challengingDOMInput.click();
        return new ChallengingDOM(driver);
    }

    public Checkboxes goToCheckboxes() {
        checkboxesInput.click();
        return new Checkboxes(driver);
    }

    public DragAndDrop goToDragAndDrop() {
        dragAndDropInput.click();
        return new DragAndDrop(driver);
    }

    public Hover goToHoverPage() {
        hoverInput.click();
        return new Hover(driver);
    }

    public DownloaderPage goToDownloadPage() {
        downloadInput.click();
        return new DownloaderPage(driver);
    }

    public UploaderPage goToUploadPage() {
        uploadInput.click();
        return new UploaderPage(driver);
    }


}
