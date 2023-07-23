package ua.hillel.mvn.wdManager.lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homework2 {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void dropDownTest() {

        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
        driver.manage().window().maximize();
        WebElement menu = driver.findElement(By.cssSelector("[class= 'dropdown-toggle']"));
        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        WebElement dropdown = driver.findElement(By.cssSelector("[class= 'secondary-dropdown']"));
        action.moveToElement(dropdown).perform();
        WebElement dropdownText = driver.findElement(By.cssSelector("[onclick= 'handleSecondaryAction()']"));
        Assert.assertEquals(dropdown.getText(), "Secondary Menu\n" +
                "Secondary Action");
    }

    @AfterClass
    public void closeWindow() {
        driver.quit();
    }
}
