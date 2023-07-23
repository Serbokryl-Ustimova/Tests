package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop {
    private final WebDriver driver;
    private Actions actions;

    @FindBy(id = "column-a")
    private WebElement DraggableInput;

    @FindBy(id = "column-b")
    private WebElement DroppableInput;

    public DragAndDrop(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public DragAndDrop dragAndDrop() {
        actions.dragAndDrop(DraggableInput, DroppableInput).perform();
        return new DragAndDrop(driver);
    }
}
