package StreamsAPIs.StreamOperations.IntermediateOperations.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingStreamOfStringToStreamOfInteger {
    /**In this example, we will convert a Stream<String> to Stream<Integer>.
     *Here the mapper function Integer::valueOf() takes one string from the Stream at a time, and convert the String to an Integer
     * It then put the Integer into another stream which is then collected using Collectors.toList().*/
    public static void main(String[] args) {
        List<String> listOfString= Arrays.asList("1","2","3","4","5","6","7");
        List<Integer> listOfInteger=listOfString.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(listOfInteger);

    }
}
