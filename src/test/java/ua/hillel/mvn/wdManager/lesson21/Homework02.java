package ua.hillel.mvn.wdManager.lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework02 {
    @Test
    public void validLogging() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        WebElement ele = driver.findElement(By.cssSelector("div[class='flash success']"));
        Assert.assertEquals(ele.getText(), "You logged into a secure area!\n" +
                "×");
        driver.quit();
    }

    @Test
    public void invalidLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("//input[@id='username']"));
        driver.findElement(By.xpath("//input[@id='password']"));
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        WebElement ele1 = driver.findElement(By.xpath("//div[contains(@class,'flash error')]"));
        Assert.assertEquals(ele1.getText(), "Your username is invalid!\n" +
                "×");
        driver.quit();
    }
}
