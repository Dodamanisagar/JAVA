package StreamsAPIs.StreamOperations.IntermediateOperations.Distinct;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class FindingDistinctStringOrPrimitives {
    /**It is easy finding distinct items from a list of simple types such as String and wrapper classes.
     * These classes implement the required equals() method, which compares the value stored in it.
     * In the given example, we have List of strings and we want to find all distinct strings from the List.
     * We will use Stream to iterate over all the String elements and collect the distinct String elements into another List using Stream.collect() terminal operation.*/
    public static void main(String[] args) {
        Collection<String> list= Arrays.asList("a","a","b","b","c","c","d","d","e");
        List<String> distinctElements=list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctElements);
    }
}
