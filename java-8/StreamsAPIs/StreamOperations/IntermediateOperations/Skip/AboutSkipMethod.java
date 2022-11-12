package StreamsAPIs.StreamOperations.IntermediateOperations.Skip;

public class AboutSkipMethod {
    /**Stream skip(n) method is used to skip the first 'n' elements from the given Stream.
     *The skip() method returns a new Stream consisting of the remaining elements of the original Stream, after the specified n elements have been discarded in the encounter order.
     *Method Syntax:- Stream<T> skip(long n)
                    -The n is the number of leading elements to be discarded. It returns a new Stream consisting of elements picked from the original stream.
                    -The method may throw IllegalArgumentException if n is negative.
     *Description:-Stream skip() method is stateful intermediate operation.
                  -Stateful operations, such as distinct and sorted, may incorporate state from previously seen elements when processing new elements.
                  -Returns a stream consisting of the remaining elements of the stream after discarding the first n elements of the stream.
                  -If the stream contains fewer than n elements then an empty stream will be returned.
                  -Generally skip() is a cheap operation, it can be quite expensive on ordered parallel pipelines, especially for large values of n.
                  -Using an unordered stream source (such as generate(Supplier)) or removing the ordering constraint with BaseStream.unordered() may result in significant speedups of skip() in parallel pipelines.
                  -skip() skips the first n elements in the encounter order.
     * Conclusion:-The Stream skip() method can be useful in certain cases where we need to get the elements from a Stream but first, we need to skip a few elements from the Stream.
                  -The fact, that skip() returns the elements in the encounter order, makes it very useful for normal business usecases as well.*/
}
