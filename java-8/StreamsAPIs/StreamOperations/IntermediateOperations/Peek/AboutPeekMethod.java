package StreamsAPIs.StreamOperations.IntermediateOperations.Peek;

public class AboutPeekMethod {
   /**Java Stream peek() method returns a new Stream consisting of all the elements from the original Stream after applying a given Consumer action.
    *Note that the peek() method is an intermediate Stream operation so, to process the Stream elements through peek(), we must use a terminal operation.
    *Using Stream.peek() without any terminal operation does nothing
    * Here action is a non-interfering action to perform on the elements as they are consumed from the Stream.
    * The result elements after performing the action are placed into the new Stream.
    *  Usage:- According to Java docs, the purpose of peek() method is to support debugging when we want to see the elements as they flow through the Stream processing pipeline.
             -We can call peek() method after every intermediate operation to see the effect of intermediate operation on the Stream elements.
    *Pseudo Code:-Stream<T> stream = createStream();
                  stream.operationOne()
     	                .peek()
     	                .operationTwo()
                        .peek()
                        .terminalOperation();
    *Method Syntax:-Stream<T> peek(Consumer<? super T> action)
    *Description:-Stream peek() method is an intermediate operation.
                 -It returns a Stream consisting of the elements of current stream.
                 -It additionally perform the provided action on each element as elements.
                 -For parallel stream pipelines, the action may be called at whatever time and in whatever thread the element is made available by the upstream operation.
                 -If the action modifies shared state, it is itself responsible for providing the required synchronization.
                 -peek() exists mainly to support debugging, where we want to see the elements as they flow past a certain point in a pipeline.
	*Conclusion:-Stream.peek() method can be useful in visualizing how the stream operations behave and understanding the implications and interactions of complex intermediate stream operations.
	            -Though it is entirely possible to alter the inner state of elements in the Stream, it is never recommended and shall be avoided.*/
}
