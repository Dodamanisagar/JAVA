package LambdaExpression;
/**without lambda expression
 @FunctionalInterface
interface InterF
{
    public int getLength(String s);
}
class Demo implements InterF{
    @Override
    public int getLength(String s) {
        return s.length();
    }
}
public class ToPrintLengthOfString {
    public static void main(String[] args) {
        InterF i=new Demo();
        System.out.println(i.getLength("sagar"));
        System.out.println(i.getLength("dodamani"));
    }
}*/

//with lambda expression
@FunctionalInterface
interface GettingLenght
{
    String getLength(String s);
}
public class ToPrintLengthOfString
{
    public static void main(String[] args) {
        //not mentioning return type
        GettingLenght gettingLenght1=s-> String.valueOf(s.length());
        System.out.println(gettingLenght1.getLength("anuja"));
        System.out.println(gettingLenght1.getLength("sagar"));

        //mentioning return type
        GettingLenght gettingLenght=s->{return String.valueOf(s.length());};
        System.out.println(gettingLenght.getLength("sagar"));
        System.out.println(gettingLenght.getLength("basavaraj"));
    }
}