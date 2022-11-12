package LambdaExpression;

@FunctionalInterface
interface WithParameterWithReturnTypeInterFace {
    //abstract method with return type and without return type
    int multiply(int a, int b);
}

public class WithParameterWithReturnType4 {
    public static void main(String[] args) {
        WithParameterWithReturnTypeInterFace value = (a, b) -> a * b;
        System.out.println(value.multiply(2, 5));
        System.out.println(value.multiply(2, 10));

    }
}
