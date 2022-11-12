package StreamsAPIs.StreamOperations.IntermediateOperations.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomOrderingUsingComparator {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,1,6,2,8,9,3,6,5,9);

        Comparator<Integer> reverseComparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        List<Integer> sortedList=list.stream().sorted(reverseComparator).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
