package StreamsAPIs.StreamOperations.IntermediateOperations.FlatMap;

public class AboutFlatMap {
    public static void main(String[] args) {
        /**The Stream flatMap() method is used to flatten a Stream of collections to a Stream of objects.
         * The objects are combined from all the collections in the original Stream.
         *The flatMap() operation has the effect of applying a one-to-many transformation to the elements of the Stream and then flattening the resulting elements into a new Stream.
         * Stream.flatMap() helps in converting Stream<Collection<T>> to Stream<T>.
                                                     flatMap() = Flattening + map()
         *What is Flattening?:-flattening is referred to as merging multiple collections/arrays into one.
                              -Consider the following example.In this example, we have an array of 3 arrays. After the flattening effect,
                                we will have one result array with all the items from the 3 arrays.
                               Ex:-Before flattening 	: [[1, 2, 3], [4, 5], [6, 7, 8]]
                                   After flattening 	: [1, 2, 3, 4, 5, 6, 7, 8]
         *Method Syntax:-The stream flatMap() method has the following syntax:-"<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)"
                        -R represents the element type of the new stream.
                        -mapper is a non-interfering, stateless function to apply to each element which produces a stream of new values.
                        -The method returns a new stream of objects of type R.
         *Other Methods Of flatmap:-Stream interface has three more similar methods which produce IntStream, LongStream and DoubleStream respectively after the flatMap() operation.
                                   -If the streams created after flatMap() operations return above given types then consider using these functions directly.
                                    1)IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
                                    2)LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
                                    3)DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)
         * Description:-flatMap() is an intermediate operation and return a new Stream.
                       -It returns a Stream consisting of the results of replacing each element of the given stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
                       -The mapper function used for transformation in flatMap() is a stateless function and returns only a stream of new values.
                       -Each mapped Stream is closed after its contents have been placed into new Stream.
                       -flatMap() operation flattens the stream; opposite to map() operation which does not apply flattening.
                             */

    }
}
