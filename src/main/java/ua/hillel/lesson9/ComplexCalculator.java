package ua.hillel.lesson9;

public class ComplexCalculator extends Calculator implements ComplexCalculations {
    @Override
    public void sum(int a, int b) {
        int sumcal = a + b;
        System.out.println("sum for complex calculator " + sumcal);
    }


    @Override
    public void subtraction(int a, int b) {
        int sumsub = a - b;
        System.out.println("subtraction for complex calculator " + sumsub);

    }

    @Override
    public void division(int c, int d) {
        int div = c / d;
        System.out.println("division for complex calculator " + div);

    }

    @Override
    public void multiplication(int c, int d) {
        int sumMul = c * d;
        System.out.println("multiplication for complex calculator ");

    }

    @Override
    public void rooting() {
        System.out.println("rooting for complex calculator ");

    }

    @Override
    public void getPercentage() {
        System.out.println("getPercentage for complex calculator");

    }

    @Override
    public void getSin() {
        System.out.println("getSin for complex calculator");

    }

    @Override
    public void getCos() {
        System.out.println("getCos for complex calculator");

    }
}
