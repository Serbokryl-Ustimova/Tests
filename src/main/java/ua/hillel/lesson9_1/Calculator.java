package ua.hillel.lesson9_1;

public class Calculator {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
        simpleCalculator.getSum(6, 9);
        simpleCalculator.division(0, 5);
        simpleCalculator.getSubdstraction(30, 3);
        simpleCalculator.multiplication(7, 6);
        System.out.println();

        engineeringCalculator.getSomething("Hello", 35);
        engineeringCalculator.getRoot(5, 3.5);
        engineeringCalculator.multiplication(40, 5);
    }
}
