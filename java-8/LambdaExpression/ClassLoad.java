package LambdaExpression;

public class ClassLoad {
    public static void main(String[] args) {
        ClassLoad classLoad=new ClassLoad();

        int a=5;
        System.out.println(a);
        System.out.println(classLoad.a);
    }
    int a=10;

    ClassLoad(){
        System.out.println("this is constructor");
    }
    static {
        System.out.println("static block 2");
    }
    static{
        System.out.println("hello guys");
        System.out.println("yeah");
    }
    {
        System.out.println("non static block");
    }
    static
    {
        System.out.println("static block 3");
        //a=20;
    }
    {
        System.out.println("non static block 2");
        a=17;
    }


}
