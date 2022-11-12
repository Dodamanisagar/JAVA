package StreamsAPIs.StreamOperations.IntermediateOperations.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,11,16);
        list.stream().filter((p)->p%2==0).forEach(System.out::println);
    }
}
