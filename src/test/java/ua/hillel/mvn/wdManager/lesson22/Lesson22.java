package ua.hillel.mvn.wdManager.lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lesson22 {
    @Test
    public void alertAccept() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("[onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        driver.quit();
    }

    @Test
    public void alertDismiss() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("[onclick='jsAlert()']")).click();
        driver.switchTo().alert().dismiss();
        driver.quit();
    }

    @Test
    public void alertInsert() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("[onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("bgk");
        driver.switchTo().alert().accept();
        driver.quit();
    }

    @Test
    public void basicAuth() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.quit();
    }

    @Test
    public void dropDownList() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.tagName("select")));
        select.selectByValue("1");
        select.selectByVisibleText("Option 2");
        driver.quit();
    }
}
