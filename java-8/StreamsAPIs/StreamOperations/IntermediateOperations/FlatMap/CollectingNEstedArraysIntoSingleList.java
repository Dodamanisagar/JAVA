package StreamsAPIs.StreamOperations.IntermediateOperations.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingNEstedArraysIntoSingleList {
    public static void main(String[] args) {
        String[][] dataArray=new String[][]{{"a","b"},{"c","d"},{"e","f"},{"g","h"}};
        List<String> listOfAllChar= Arrays.stream(dataArray).flatMap(s->Arrays.stream(s)).collect(Collectors.toList());

        //List<String> listOfAllChar1= dataArray.flatMap(s->Arrays.stream(s)).collect(Collectors.toList());//Cannot resolve method 'flatMap' in 'String'
        System.out.println(listOfAllChar);
    }
}
