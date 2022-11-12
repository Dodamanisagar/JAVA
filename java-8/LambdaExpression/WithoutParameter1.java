package LambdaExpression;

@FunctionalInterface
interface WithoutParameterInterF {
    //abstract method without return Type and without parameters
    public void methodWithoutParameter();
}

public class WithoutParameter1 {
    public static void main(String[] args) {

        WithoutParameterInterF para = () -> System.out.println("hello java 8 new features");
        para.methodWithoutParameter();
    }
}
