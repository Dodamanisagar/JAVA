package StreamsAPIs.StreamOperations.IntermediateOperations.Limit;

public class AboutLimitMethod {
  /**Stream limit(n) is used to retrieve a number of elements from the Stream while the count must not be greater than n.
   *limit() method returns a new Stream consisting of the elements of the given stream, truncated to be no longer than maxSize in length.
   * Syntax:-Stream<T> limit(long maxSize)
            -Here maxSize the number of elements the stream should be limited to; and the method return value is a new Stream consisting of elements picked from the original stream.
   *Description:-Stream.limit() method is short-circuiting intermediate operation.
                -An intermediate operation is short-circuiting if, when presented with infinite input, it may produce a finite stream as a result.
                -Please note that a terminal operation is short-circuiting if, when presented with infinite input, it may terminate in finite time.
                -It returns a stream consisting of the maximum elements, no longer than given size in length, of current stream.
                -Generally, limit() is cheap operation but may sometimes be expensive if maxSize has a large value and stream is parallely processed.
                -Using an unordered stream source (such as generate(Supplier)) or removing the ordering constraint with BaseStream.unordered() may result in significant speedups of limit() in parallel pipelines.
                -limit() returns the first n elements in the encounter order.
   *Difference between skip() and limit():-The limit(N) method returns first N elements in the encounter order of the Stream.
                                          -The skip(N) discards the first N elements of the Stream.
   *Conclusion:-Java 8 Stream limit() method can be useful in certain cases where we need to get the elements from a stream and the count of elements will be determined at runtime.
               -The fact, that it returns the elements in encounter order, makes it very useful for normal business usecases as well.*/
}
