package StreamsAPIs.StreamOperations.IntermediateOperations.Map;

public class AboutMapMethod {
    /**
     * The Stream map() method has the syntax:-"<R> Stream<R> map(Function<? super T,? extends R> mapper)"
     *                                         - R represents the element type of the new stream.
                                               - mapper is a non-interfering, stateless function to apply to each element which produces a stream of new values.
                                               -The method returns a new stream of objects of type R.
     *Stream interface has three more similar methods which produce IntStream, LongStream and DoubleStream respectively after the map operation.
     * If the streams created after map() operations are given return types then consider using these functions directly.
                                               1)IntStream mapToInt(ToIntFunction<? super T> mapper)
                                               2)LongStream mapToLong(ToLongFunction<? super T> mapper)
                                               3)DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)
     *Description:-
     ->The map() is an intermediate operation. It returns a new Stream as return value.
     ->The map() operation takes a Function, which is called for each value in the input stream and produces one result value, which is sent to the output stream.
     ->The mapper function used for transformation is a stateless function (does not store the information of previously processed objects) and returns only a single value.
     ->The map() method is used when we want to convert a Stream of X to Stream of Y.
     ->The mapped stream is closed after its contents have been placed into the new output stream.
     ->map() operation does not flatten the stream as flatMap() operation does.
     */
}
