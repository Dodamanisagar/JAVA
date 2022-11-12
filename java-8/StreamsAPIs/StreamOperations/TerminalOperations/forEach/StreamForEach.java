package StreamsAPIs.StreamOperations.TerminalOperations.forEach;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class StreamForEach {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        //memberNames.forEach(System.out::println);
        Stream<String> stream=memberNames.stream();
        stream.forEach(System.out::println);
    }
}
