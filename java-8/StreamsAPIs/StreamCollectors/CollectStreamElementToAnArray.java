package StreamsAPIs.StreamCollectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class CollectStreamElementToAnArray {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(33);
        list.add(40);
        list.add(55);
        list.add(60);

        Stream<Integer> stream=list.stream();//storing list into stream
        Integer[] evenNumber=stream.filter(i->i%2==0).toArray(Integer[]::new);//storing stream into array
        System.out.println(Arrays.toString(evenNumber));
        //There are plenty of other ways also to collect stream into a Set, Map or into multiple ways. Just go through Collectors class and try to keep them in mind.
    }
}
