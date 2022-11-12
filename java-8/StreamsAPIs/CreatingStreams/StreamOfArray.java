package StreamsAPIs.CreatingStreams;

import java.util.stream.*;
public class StreamOfArray {
    public static void main(String[] args) {
        Stream<Integer> streamOfArray=Stream.of(new Integer[]{10,20,30,40,50,60,70,80,90,100});//we ara creating a stream from the array.the elements in the stream are taken from the array.
        streamOfArray.forEach(p-> System.out.println(p));
    }
}
