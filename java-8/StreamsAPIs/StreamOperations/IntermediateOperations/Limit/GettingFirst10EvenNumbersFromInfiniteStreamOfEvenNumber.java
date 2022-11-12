package StreamsAPIs.StreamOperations.IntermediateOperations.Limit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GettingFirst10EvenNumbersFromInfiniteStreamOfEvenNumber {
    /**In the given below example, we are creating an infinite stream using iterate() method.
     * Then we are taking the first 10 even numbers using the method limit(10).
     * Finally, we are collecting the even numbers from the stream into a List using collect(Collectors.toList()) method.*/
    public static void main(String[] args) {
        Stream<Integer> evenNumInfiniteStream=Stream.iterate(0,n->n+2);
        List<Integer> newListLimit=evenNumInfiniteStream.limit(10).collect(Collectors.toList());
        System.out.println(newListLimit);

        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .skip(6)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
