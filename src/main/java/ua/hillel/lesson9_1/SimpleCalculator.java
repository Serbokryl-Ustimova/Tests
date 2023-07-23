package ua.hillel.lesson9_1;

public class SimpleCalculator {
    public void getSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public void getSum(int a, int b, int... ints) {
//        for (int i=0; i< ints.length, i++)
//            int sum +=i;
    }

    public void getSubdstraction(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }

    public void getSubdstraction(double a, double b, double... ints) {
        System.out.println(" method getSubdstraction");

    }

    public int division(int a, int b) {
        int div = a / b;
//        if (a==0) {
//            return -1;
//        }
        System.out.println(div);
        return div;
    }


    public int multiplication(int a, int b) {
        int mult = a * b;
        System.out.println(mult);
        return mult;
    }

    public void methodWithVarArgs(int... ints) {

    }

}

