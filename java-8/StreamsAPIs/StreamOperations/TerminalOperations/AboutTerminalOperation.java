package StreamsAPIs.StreamOperations.TerminalOperations;

public class AboutTerminalOperation {
    /**
     * *Terminal operations return a result of a certain type after processing all the stream elements.
     * Once the terminal operation is invoked on a Stream, the iteration of the Stream and any of the chained streams will get started.
     * Once the iteration is done, the result of the terminal operation is returned.
     * 1. Stream.forEach():-The forEach() method helps in iterating over all elements of a stream and perform some operation on each of them.
                            The operation to be performed is passed as the lambda expression.
     * 2. Stream.collect():-The collect() method is used to receive elements from a steam and store them in a collection.
     * 3. Stream.match():-Various matching operations can be used to check whether a given predicate matches the stream elements.
                          All of these matching operations are terminal and return a boolean result.
     * 4. Stream.count():-The count() is a terminal operation returning the number of elements in the stream as a long value.
     * 5. Stream.reduce():-The reduce() method performs a reduction on the elements of the stream with the given function. The result is an Optional holding the reduced value.
     */
}
