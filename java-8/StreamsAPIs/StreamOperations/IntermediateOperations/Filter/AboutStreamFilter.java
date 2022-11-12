package StreamsAPIs.StreamOperations.IntermediateOperations.Filter;

public class AboutStreamFilter {
    /**
     * Stream filter() Method syntax is as follows:-"Stream<T> filter(Predicate<? super T> condition)".
     * Predicate is a functional interface and represents the condition to filter out the non-matching elements from the Stream.
     * filter() is a intermediate Stream operation.
     * It returns a Stream consisting of the elements of the given stream that match the given predicate.
     * The filter() argument should be stateless predicate which is applied to each element in the stream to determine if it should be included or not.
     * Predicate is a functional interface. So, we can also pass lambda expression also.
     * It returns a new Stream so we can use other operations applicable to any stream.
     */
}
