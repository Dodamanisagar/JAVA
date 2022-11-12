package StreamsAPIs.StreamOperations.IntermediateOperations.Sorted;

public class AboutSortedMethod {
    public static void main(String[] args) {
        /**use Stream sorted() method to sort the elements in a List by their natural order and reverse order.
         *We can also apply for custom orders on the elements using the provided Comparator.
         * The Stream interface provides two methods for sorting the Stream elements.
          1)sorted() – Provides the default sorting
          2)sorted(Comparator) – Sorting based on the provided comparator.
         1. Stream sorted():-
                            -Syntax:-"Stream<T> sorted()"
                            -sorted() is a stateful intermediate operation that returns a new Stream.
                            -It returns a stream consisting of the elements of this stream, sorted according to the natural order.
                            -If the elements of this stream are not Comparable, a java.lang.ClassCastException may be thrown when the terminal operation is executed.
                            -For ordered streams, the sort is stable.
                            -For unordered streams, no stability guarantees are made.
         2. Stream sorted(comparator):-
                                      -Syntax:-Stream<T> sorted(Comparator<? super T> comparator)
                                      -This is a stateful intermediate operation that returns a new stream.
                                      -It returns a stream consisting of the elements of this stream, sorted according to the provided Comparator..
                                      -For ordered streams, the sort is stable.
                                      -For unordered streams, no stability guarantees are made.
         */

    }
}
