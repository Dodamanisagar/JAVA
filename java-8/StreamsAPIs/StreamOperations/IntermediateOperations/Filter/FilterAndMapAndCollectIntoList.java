package StreamsAPIs.StreamOperations.IntermediateOperations.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapAndCollectIntoList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //printing square of even numbers
        List<Integer> squareOfEvenNumbers=list.stream().filter((p)->p%2==0).map(p->p*p).collect(Collectors.toList());
        System.out.println("square of even numbers are;-"+squareOfEvenNumbers);

        //printing square of odd numbers
        List<Integer> squareOfOddNumbers=list.stream().filter(m->m%2!=0).map(m->m*m).collect(Collectors.toList());
        System.out.println("square of odd numbers are;-"+squareOfOddNumbers);

    }
}
