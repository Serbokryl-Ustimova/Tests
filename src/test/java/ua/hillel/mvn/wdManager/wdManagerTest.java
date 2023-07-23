package ua.hillel.mvn.wdManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wdManagerTest {
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
//        driver.findElement(By.id("content")); //если не находит елемент выкидывает ошибку
//        driver.findElements(By.id("content")); //если не находит выкидывает пустой массив без ошибки
//        driver.findElements(By.name("content"));
//        driver.findElement(By.className("example")).findElement(By.tagName("div")).findElement(By.className("row"));
//        driver.findElements(By.partialLinkText("#delete")); // находит по тексту в кликабельной ссылке
//        driver.findElement(By.id("content")).findElement(By.tagName("h3"));
//        driver.findElement(By.cssSelector("#content")); // by id
//        driver.findElement(By.cssSelector("div#content")); // by tag+ id
//        driver.findElement(By.cssSelector(".foundation-mq-small")); // by class name
//        driver.findElement(By.cssSelector(".large-12.columns")); // by class names, только если есть пробелы в названии
//        driver.findElement(By.cssSelector("[name='viewport']")); //
//        driver.findElement(By.cssSelector("[class='foundation-mq-large']"));
//        driver.findElement(By.cssSelector("div[id='content']"));
//        driver.findElement(By.cssSelector("#Consequuntur5"));
//        driver.findElement(By.cssSelector("div.large-10> table> tbody>tr")); //спускаемся на уровень ниже через >
//        driver.findElement(By.cssSelector("div.large-10 td"));
//        driver.findElement(By.cssSelector("div.large-10.columns td:nth-child(6)"));
//        driver.findElement(By.cssSelector(".example h3"));
//        driver.findElement(By.cssSelector("#content .row"));
//        driver.findElement(By.cssSelector("table> tbody> tr:nth-child(4) > td:nth-child(5)"));
//        driver.findElement(By.xpath("//h3[text()='Challenging DOM']"));
//        driver.findElement(By.xpath("//a[contains(@class,'alert')]"));
        driver.findElement(By.xpath("//table//tbody/tr[4]/td[4]"));
        driver.quit();
    }
}
