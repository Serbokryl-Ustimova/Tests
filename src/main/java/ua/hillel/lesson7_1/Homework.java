package ua.hillel.lesson7_1;

public class Homework {
    public static void main(String[] args) {
        Calculator calculator = new ComplexCalculator();
        calculator.sum(10, 20);
        calculator.subtraction(30, 40);
        calculator.rooting();
        calculator.division(50, 11);
        System.out.println();

        Calculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.sum(6, 7);
        simpleCalculator.division(30, 2);
        simpleCalculator.subtraction(5, 7);
    }

}

