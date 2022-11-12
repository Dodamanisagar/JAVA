package LambdaExpression;
@FunctionalInterface
interface InterFaceWithParameterWithoutReturnType
{
    //abstract method without return type with parameter
    void concatinate(String a,int b);
}
public class WithParameterWithoutReturnType3 {
    public static void main(String[] args) {

        InterFaceWithParameterWithoutReturnType newString=(a,b)-> System.out.println(a+b);
        newString.concatinate("sagar age is ",24);
        newString.concatinate("anuja age is ",23);
        newString.concatinate("basavaraj is in UAE since from ",2021);
    }
}
