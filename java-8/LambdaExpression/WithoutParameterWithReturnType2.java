package LambdaExpression;

@FunctionalInterface
interface WithoutParameterWithReturnTypeIntefcae {
    //abstract methos with return type and without parameters
    int add();
}

public class WithoutParameterWithReturnType2 {
    public static void main(String[] args) {
        WithoutParameterWithReturnTypeIntefcae instance1 = () -> {return 2 + 3;};
        WithoutParameterWithReturnTypeIntefcae instance2 = () -> 2 + 3;
        System.out.println(instance1.add());
        System.out.println(instance2.add());
    }
}
