package StreamsAPIs.StreamOperations.IntermediateOperations.Filter;

import java.util.stream.Stream;

public class FilterElementWithUppercaseAtIndex1 {
    public static void main(String[] args) {
        Stream<String> stream1=Stream.of("SAGAR","ramesh","DodaManI","family","12raj");//stream 1
        stream1.filter(str->Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
        //stream1.filter(alpha->Character.isDigit(alpha.charAt(1))).forEach(System.out::println);//same stream cannot run 2nd time else we get Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

        Stream<String> stream2=Stream.of("SAGAR","ramesh","DodaManI","family","12raj");//stream 2
        stream2.filter(alpha->Character.isDigit(alpha.charAt(1))).forEach(System.out::println);

        Stream<String> stream3=Stream.of("SAGAR","ramesh","DodaManI","family","12raj");//stream 3
        stream3.filter(lowerCase->Character.isLowerCase(lowerCase.charAt(0))).forEach(System.out::println);


    }
}