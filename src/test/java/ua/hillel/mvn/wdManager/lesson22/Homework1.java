package ua.hillel.mvn.wdManager.lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homework1 {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void dragAndDrop() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        WebElement picture = driver.findElement(By.id("draggable"));
        WebElement picture1 = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(picture, picture1).perform();
        driver.findElement(By.xpath("//div/p"));
    }

    @AfterClass
    public void closeWindow() {
        driver.quit();
    }
}
