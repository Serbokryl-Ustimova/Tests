package ua.hillel.mvn.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    @Test
    public void selenideTest(){
        Configuration.browser = "edge";
        Configuration.baseUrl= "https://the-internet.herokuapp.com/";
        Configuration.downloadsFolder = "target/download/";
        Configuration.screenshots= true;

        open("/challenging_dom");
        $(".button.alert"); //для поиска одного элемента
        $x("//*[@class ='button']").shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
//        $(By.className("success")).download(Long.parseLong(""));
//        $(By.className("success")).uploadFile("");
//        actions().moveToElement("").perform();

        $$("tbody > tr > td:nth-child(4"); //для поиска коллекции
        $$x("//*[@class ='button']");
        open("/drag_and_drop");
    }
}
