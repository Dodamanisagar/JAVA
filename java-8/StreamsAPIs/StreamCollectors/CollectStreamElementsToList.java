package StreamsAPIs.StreamCollectors;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class CollectStreamElementsToList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(33);
        list.add(40);
        list.add(55);
        list.add(60);

        Stream<Integer> stream=list.stream();//storing the list into the stream
        List<Integer> evenNumber=stream.filter(i->i%2==0).collect(Collectors.toList());//storing stream into a List
        System.out.println(evenNumber);
    }
}
