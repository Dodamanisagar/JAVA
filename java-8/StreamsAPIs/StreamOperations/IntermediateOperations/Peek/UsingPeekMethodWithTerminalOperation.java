package StreamsAPIs.StreamOperations.IntermediateOperations.Peek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Java program to use peek() API to debug the Stream operations and log Stream elements as they are processed.
public class UsingPeekMethodWithTerminalOperation {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> newList=list.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println(newList);
    }
}
