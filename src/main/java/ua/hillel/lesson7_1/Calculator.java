package ua.hillel.lesson7_1;

public abstract class Calculator implements ComplexCalculations {
    public abstract void sum(int a, int b);

    public abstract void subtraction(int a, int b);

    public abstract void division(int c, int d);

    public abstract void multiplication(int c, int d);

    @Override
    public void rooting() {

    }

    @Override
    public void getPercentage() {

    }

    @Override
    public void getSin() {

    }

    @Override
    public void getCos() {

    }
}
