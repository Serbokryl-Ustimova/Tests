package ua.hillel.mvn.testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeworkLogIn {
    @Test(dataProvider = "parameters", priority = 0)
    public void logIn(String name, String password, String role) {
        System.out.println("Name: " + name + ", Password: " + password + ", Role: " + role);
    }

    @Test(priority = 1)
    public void logIn() {
        System.out.println("You've jogged in successfully!");
    }

    @DataProvider(name = "parameters")
    public Object[][] getParams() {
        Object[][] output = {
                {"Anna", "qwer", "admin"},
                {"Oleg", "hgjf", "provider"},
                {"Sveta", "umdfj5", "secretary"},
        };
        return output;
    }
}
