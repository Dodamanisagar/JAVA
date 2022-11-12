package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("banana");
        list.add("mango");
        list.add("orange");
        list.add("grapes");

        list.forEach((n)-> System.out.println(n));
    }
}
