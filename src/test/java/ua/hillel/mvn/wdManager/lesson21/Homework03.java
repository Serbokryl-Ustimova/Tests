package ua.hillel.mvn.wdManager.lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Homework03 {
    @Test
    public void checkBoxes() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        List<WebElement> elems = driver.findElements(By.cssSelector("[type='checkbox']"));
        for (WebElement el : elems) {
            el.click();
        }
        driver.quit();
    }
}
