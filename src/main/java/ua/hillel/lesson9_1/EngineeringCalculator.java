package ua.hillel.lesson9_1;

public class EngineeringCalculator extends SimpleCalculator {
    @Override
    public void getSum(int a, int b) {
        super.getSum(a, b);
    }


    @Override
    public void getSubdstraction(int a, int b) {
        super.getSubdstraction(a, b);
    }

    @Override
    public void methodWithVarArgs(int... ints) {
        super.methodWithVarArgs(ints);
    }

    @Override
    public int division(int a, int b) {
        return super.division(a, b);
    }

    @Override
    public int multiplication(int a, int b) {
        return super.multiplication(a, b);
    }

    public void getRoot(double x, double v) {

    }

    public void getSomething(String value, int r) {
        System.out.println("method get something");

    }
}
