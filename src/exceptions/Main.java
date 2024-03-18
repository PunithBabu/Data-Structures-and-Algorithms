package exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        int a = 3, b = 0;
        divide(a,b);
    }

    static int divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("why to divide by zero");
        }
        return a / b;
    }
}
