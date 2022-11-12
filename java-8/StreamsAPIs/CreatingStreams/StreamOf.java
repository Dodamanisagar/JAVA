package StreamsAPIs.CreatingStreams;
import java.util.stream.*;
public class StreamOf {
    public static void main(String[] args) {
        Stream<Integer> integerStream=Stream.of(1,2,3,4,5,6,7,8,9);//creating a stream of a fixed number of integer
        integerStream.forEach(p-> System.out.println(p));
    }
}
