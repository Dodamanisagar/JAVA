package StreamsAPIs.StreamOperations.ShortCircuitOperation;

public class AboutShortCircuitOperation {
    /**
     * Though stream operations are performed on all elements inside a collection satisfying a Predicate,
       it is often desired to break the operation whenever a matching element is encountered during iteration.
     *In external iteration, we will do with the if-else block. In the internal iterations such as in streams, there are certain methods we can use for this purpose.
     * 1. Stream.anyMatch():-The anyMatch() will return true once a condition passed as predicate satisfies.
                             Once a matching value is found, no more elements will be processed in the stream.
                             In the given class StreamAnyMatch example, as soon as a String is found starting with the letter 'A', the stream will end and the result will be returned.
     * 2. Stream.findFirst();-The findFirst() method will return the first element from the stream and then it will not process any more elements.
     * */
}
