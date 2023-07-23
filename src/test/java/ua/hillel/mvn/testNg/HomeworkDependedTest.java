package ua.hillel.mvn.testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeworkDependedTest {
    @Test(dataProvider = "parameters", dependsOnMethods = "ua.hillel.mvn.TestNg.HomeworkLogIn.logIn")
    public void noName(String name, String password, String role) {
        System.out.println("test worked");

    }

    @DataProvider(name = "parameters")
    public Object[][] getParams() {
        Object[][] output = {
                {"Anna", "qwer", "admin"},
                {"Oleg", "hgjf", "provider"},
                {"Sveta", "umdfj5", "secretary"},
//                {"Kostya", "frfrk56"}
        };
        return output;
    }
}
