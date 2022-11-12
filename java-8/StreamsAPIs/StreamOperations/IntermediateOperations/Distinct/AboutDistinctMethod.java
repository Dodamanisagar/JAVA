package StreamsAPIs.StreamOperations.IntermediateOperations.Distinct;

public class AboutDistinctMethod {
    public static void main(String[] args) {
        /**The distict() method is one such stateful intermediate operation that uses the state from previously seen elements from the Stream while processing the new items.
         *Method Syntax:-Stream<T> distinct()
         *The distinct() method returns a new stream consisting of the distinct elements from the given stream.
         *For checking the equality of the stream elements, the equals() method is used.
         *The distinct() method guarantees the ordering for the streams backed by an ordered collection.
         *For ordered streams, the element appearing first in the encounter order is preserved.
         *For unordered streams, no stability guarantees are made. */
    }
}
