package ua.hillel.mvn.testNg;

import org.testng.annotations.Test;


public class TestLesson19 {
    @Test(description = "first test")
    public void method1() {
        System.out.println("method1");
    }

    @Test(dependsOnMethods = "method1", enabled = true)
    public void method2() {
        System.out.println("method2");
    }

    @Test(dependsOnMethods = "ua.hillel.mvn.Maven.JavaTest.testMvn")
    public void method3() {
        System.out.println("method3");
    }

    public void method4() {
        System.out.println("method4");
    }

    @Test(priority = 0)
    public void method5() {
        System.out.println("method5");
    }

    @Test(priority = 1)
    public void method6() {
        System.out.println("method6");
    }

}
