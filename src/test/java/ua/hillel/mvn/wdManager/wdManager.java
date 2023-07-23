package ua.hillel.mvn.wdManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wdManager {
    @Test
    public void wdTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com"); //перейти по указанному url
//        driver.manage(). //дает доступ к управлению запущенной сессии
        driver.manage().window().fullscreen(); //заходим в режим full screen
//        driver.navigate().refresh(); // через navigate навигируемся на странице
//        driver.manage().window().minimize(); //свернуть окно
        driver.manage().window().maximize(); // расскрыть на всю страницу
//        driver.navigate().to("https://jenkins.hsone.local");
//        driver.switchTo().alert().accept(); //чтобы переключаться по элементам


        //       driver.close(); // закрывает текущее открытое окно
        driver.quit(); //полностю закрывает текущюю сессию,выходит со страницы, закрывает бинарный браузер
    }
}
