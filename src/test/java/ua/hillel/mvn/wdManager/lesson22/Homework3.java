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


public class Homework3 {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void hoverTest() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement avatar1 = driver.findElement(By.xpath("//div[@class='example']/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(avatar1).perform();
        System.out.println(avatar1.getText());

        WebElement avatar2 = driver.findElement(By.xpath("//div[@class='example']/div[2]"));
        action.moveToElement(avatar2).perform();
        System.out.println(avatar2.getText());

        WebElement avatar3 = driver.findElement(By.xpath("//div[@class='example']/div[3]"));
        action.moveToElement(avatar3).perform();
        System.out.println(avatar3.getText());
    }

    @AfterClass
    public void closeWindow() {
        driver.quit();
    }
}
