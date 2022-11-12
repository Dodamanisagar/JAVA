package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**without lambda expression
class MyComparator implements Comparator<Integer>
{

    @Override
    public int compare(Integer a, Integer b) {
        return (a<b)?-1:(a>b)?1:0 ;
    }
}
public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(12);
        l.add(30);
        l.add(49);
        l.add(13);
        System.out.println(l);
        Collections.sort(l,new MyComparator());
        System.out.println(l);
    }
}*/

//with lambda expression
public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(12);
        l.add(30);
        l.add(49);
        l.add(13);
        System.out.println(l);
        Comparator<Integer> c=(a,b)->(a<b)?-1:(a>b)?1:0 ;
        Collections.sort(l,c);
        System.out.println(l);
    }
}
