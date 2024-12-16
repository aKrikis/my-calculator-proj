package gr.aueb.cf.ch3;

public class MullCalculator {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int result = 0;

        result = mul(a, b);

        System.out.println("Result: "+ result);
    }

    public static int mul(int a, int b) {
        return a*b;
    }
}
