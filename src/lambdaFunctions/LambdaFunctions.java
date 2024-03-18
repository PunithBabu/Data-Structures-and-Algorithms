package lambdaFunctions;

public class LambdaFunctions {
    public static void main(String[] args) {
        Operations add = (a, b) -> a + b;
        Operations prod = (a, b) -> a * b;
        Operations sub = (a, b) -> a - b;

        LambdaFunctions lambdaFunctions=new LambdaFunctions();
        System.out.println(lambdaFunctions.operate(5,3,prod));

    }
    public int operate(int a, int b, Operations op) {
        return op.operations(a, b);
    }
}

interface Operations{
    int operations(int a, int b);
}
