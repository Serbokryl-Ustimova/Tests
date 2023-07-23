package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChallengingDOM {
    private final WebDriver driver;

    @FindBy(xpath = "//a[contains(@class,'button')]")
    private WebElement firstButtonInput;

    @FindBy(xpath = "//a[contains(@class,'alert')]")
    private WebElement secondButtonInput;

    @FindBy(xpath = "//a[contains(@class,'alert')]")
    private WebElement thirdButtonElementInput;

    @FindBy(xpath = "//table//tbody//td[4]")
    private List<WebElement> elementsInTable;

    public ChallengingDOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ChallengingDOM clickOnFirstButton() {
        firstButtonInput.click();
        return new ChallengingDOM(driver);
    }

    public ChallengingDOM clickOnSecondButton() {
        secondButtonInput.click();
        return new ChallengingDOM(driver);
    }

    public ChallengingDOM clickOnThirdButton() {
        thirdButtonElementInput.click();
        return new ChallengingDOM(driver);
    }

    public ChallengingDOM getTextFromElementsInTable() {
        for (WebElement ele : elementsInTable) {
            System.out.println(ele.getText());
        }
        return new ChallengingDOM(driver);
    }

}
