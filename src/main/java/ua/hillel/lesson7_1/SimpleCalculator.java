package ua.hillel.lesson7_1;

public class SimpleCalculator extends Calculator {
    @Override
    public void sum(int a, int b) {
        int sumcal = a + b;
        System.out.println("sum for simple calculator " + sumcal);

    }

    @Override
    public void subtraction(int a, int b) {
        int sumsub = a - b;
        System.out.println("subtraction for simple calculator " + sumsub);

    }

    @Override
    public void division(int c, int d) {
        int div = c / d;
        System.out.println("division for simple calculator " + div);

    }

    @Override
    public void multiplication(int c, int d) {
        int sumMul = c * d;
        System.out.println(" multiplication for simple calculator" + sumMul);

    }
}
