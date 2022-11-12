package StreamsAPIs.StreamOperations.IntermediateOperations.Peek;

import java.util.Arrays;
import java.util.List;

public class UsingPeekMethodWithoutTerminalOperation {
    public static void main(String[] args) {
        //As mentioned above, Stream.peek() without any terminal operation does nothing.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
                .peek( System.out::println );   //prints nothing
    }
}
