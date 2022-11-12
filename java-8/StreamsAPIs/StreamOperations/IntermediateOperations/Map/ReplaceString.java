package StreamsAPIs.StreamOperations.IntermediateOperations.Map;
import java.util.List;
import java.util.stream.*;
public class ReplaceString {
    public static void main(String[] args) {
        Stream strStream=Stream.of("sagar","suraj","ankita","raj");
        //replacing the suraj with anuja using stream
        Stream replaced=strStream.map(name->{
            if(name=="suraj")
            return "anuja";
            return name;
        });
        List  list= (java.util.List) replaced.collect(Collectors.toList());//casted to java.util.List
        System.out.println(list);
    }
}
