package StreamsAPIs.StreamOperations.IntermediateOperations.Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInNaturalOrder {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,1,6,2,8,9,3,6,5,9);
        List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
