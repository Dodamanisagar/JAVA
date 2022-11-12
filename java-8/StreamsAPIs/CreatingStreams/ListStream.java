package StreamsAPIs.CreatingStreams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class ListStream {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 100; i <1100 ; i=i+100) {
            list.add(i);
        }
        Stream<Integer> listStream=list.stream();//we are creating stream of List.
        listStream.forEach(p-> System.out.println(p));
    }
}
