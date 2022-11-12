package LambdaExpression;
@FunctionalInterface
interface Statement{
    public String greet();
}
public class WithoutParameterStringReturnType {
    public static void main(String[] args) {
        Statement s=()->{return "hello world, welcome to java 8 features";};
        System.out.println(s.greet());
    }
}
