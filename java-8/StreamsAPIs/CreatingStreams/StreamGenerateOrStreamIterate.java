package StreamsAPIs.CreatingStreams;
import java.util.Random;
import java.util.stream.*;
public class StreamGenerateOrStreamIterate {
    public static void main(String[] args) {
        //we are creating a stream from generated elements.this will produce a stream of 20 random numbers.We have restricted the element count using limit() function.
    Stream<Integer> randomNumber=Stream.generate(()->(new Random()).nextInt(100));
    randomNumber.limit(20).forEach(System.out::println);
    }
}
