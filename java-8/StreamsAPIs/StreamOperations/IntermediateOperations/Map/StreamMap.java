package StreamsAPIs.StreamOperations.IntermediateOperations.Map;
import java.util.ArrayList;
import java.util.List;

public class StreamMap {
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
        /**The map() intermediate operation converts each element in the stream into another object via the given function.
         The following example converts each string into an UPPERCASE string. But we can use map() to transform an object into another type as well*/
        memberNames.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);//printing the names which are started with "A" and converting to upper case
    }
}
