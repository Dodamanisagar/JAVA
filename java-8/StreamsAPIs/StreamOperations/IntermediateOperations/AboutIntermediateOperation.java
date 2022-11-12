package StreamsAPIs.StreamOperations.IntermediateOperations;

public class AboutIntermediateOperation {
    /**
     * Intermediate operations return the stream itself so you can chain multiple methods calls in a row. Let’s learn important ones.
     * 1. Stream.filter():-The filter() method accepts a Predicate to filter all elements of the stream.
                           This operation is intermediate which enables us to call another stream operation (e.g. forEach()) on the result.
     * 2. Stream.map():-The map() intermediate operation converts each element in the stream into another object via the given function.
     * 3. Stream.sorted():->The sorted() method is an intermediate operation that returns a sorted view of the stream.
                           ->The elements in the stream are sorted in natural order unless we pass a custom Comparator.
                           ->Please note that the sorted() method only creates a sorted view of the stream without manipulating the ordering of the source Collection.
                           ->In StreamSorted class example, the ordering of string in the memberNames is untouched.
     */
}
