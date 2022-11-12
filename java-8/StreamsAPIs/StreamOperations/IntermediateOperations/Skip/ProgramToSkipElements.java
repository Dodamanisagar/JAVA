package StreamsAPIs.StreamOperations.IntermediateOperations.Skip;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramToSkipElements {
    public static void main(String[] args) {
        Stream<Integer> evenNumberInfinitStream=Stream.iterate(0,n->n+2);
        List<Integer> newList=evenNumberInfinitStream.skip(5).limit(10).collect(Collectors.toList());
        System.out.println(newList);
    }
}
