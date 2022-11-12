package StreamsAPIs.StreamOperations.IntermediateOperations.Distinct;
import java.util.stream.*;
public class DistinctFruits {
    /**distinct():-Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.*/
    public static void main(String[] args) {
        Stream fruites=Stream.of("apple","apple","mango","banana","mango");
        Stream distinctFruits=fruites.distinct();
        distinctFruits.forEach(System.out::println);
    }
}
