package StreamsAPIs.CreatingStreams;
import java.util.stream.*;
public class StreamOfStringCharsOrTokens {
    public static void main(String[] args) {
        IntStream intStream="12345_abcdefg".chars();//getting ASCi values of each characters
        intStream.forEach(p-> System.out.println(p));//printing the ASCI values

    }
}
