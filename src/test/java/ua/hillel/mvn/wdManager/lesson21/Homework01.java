package ua.hillel.mvn.wdManager.lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Homework01 {
    @Test
    public void method() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(@class,'button')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'alert')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'success')]")).click();

        List<WebElement> elems = driver.findElements(By.xpath("//table//tbody//td[4]"));
        for (WebElement ele : elems) {
            System.out.println(ele.getText());
        }
        driver.quit();

    }
}
