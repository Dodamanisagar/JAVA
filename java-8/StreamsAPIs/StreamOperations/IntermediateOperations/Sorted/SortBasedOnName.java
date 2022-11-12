package StreamsAPIs.StreamOperations.IntermediateOperations.Sorted;
import java.util.stream.*;
public class SortBasedOnName {
    public static void main(String[] args) {
        Stream vegStream=Stream.of("tomato","Green Chilli","Potot0","POTOTO","BEetRoot");
        Stream sortedStream=vegStream.sorted();
        sortedStream.forEach(name->System.out.println(name));
    }
}
