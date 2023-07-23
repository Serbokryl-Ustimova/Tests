package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hover {
    private final WebDriver driver;
    private Actions actions;

    @FindBy(xpath = "//div[@class='example']/div[1]")
    private WebElement FirstHoverInput;

    @FindBy(xpath = "//div[@class='example']/div[2]")
    private WebElement SecondHoverInput;

    @FindBy(xpath = "//div[@class='example']/div[3]")
    private WebElement ThirdHoverInput;

    public Hover(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public Hover hoverAndShowTextFirstElement() {
        actions.moveToElement(FirstHoverInput).perform();
        System.out.println(FirstHoverInput.getText());
        return new Hover(driver);
    }

    public Hover hoverAndShowTextSecondElement() {
        actions.moveToElement(SecondHoverInput).perform();
        System.out.println(SecondHoverInput.getText());
        return new Hover(driver);
    }

    public Hover hoverAndShowTextThirdElement() {
        actions.moveToElement(ThirdHoverInput).perform();
        System.out.println(ThirdHoverInput.getText());
        return new Hover(driver);
    }
}
