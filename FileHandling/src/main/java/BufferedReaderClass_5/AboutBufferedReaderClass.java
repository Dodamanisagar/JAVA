package BufferedReaderClass_5;

public class AboutBufferedReaderClass {
    /**
     * BufferedReader:-
     --->We can use a BufferedReader to read character data(text data) from the file.
     --->The main advantage of BufferedReader over FileReader is we can read data line by line in addition to character by character, which is more convenient to the programmer.

     *BufferedReader Constructors:-
     1.BufferedReader refVariable=new BufferedReader(Reader refVariableOfReader);
     2.BufferedReader refVariable=new BufferedReader(Reader refVariableOfReader, int bufferedSize);

     *NOTE:-
     -->BufferedReader cant communicate directly with the file.
     -->It can communicate via some readers object only.

     *Methods of BufferedReader:-
     1.read():-
     -->return Type-->int
     -->It attempts to read next character from the file and return its unicode value.
     -->If there is no next character then we will get '-1'.
     -->As this method returns unicode value compulsory at the time of printing we should perform type casting.
     when to use-->If the Number of character exceeds int range even after casting then better to go with this method.

     2.read(char[] Variable):-
     -->return Type-->int
     -->It attempts to read enough character from the File into char[].
     -->And returns number of characters copied from the File into char[].

     3.close():-
     -->To close the reader.

     4.readLine():-
     -->return Type-->String.
     -->It attempts to read next line from the file and returns it, if the next line is not available then it returns null.

     Note:-
     --->Whenever we are closing BufferedReader automatically underlying FileReader will be closed, and we are not required to close explicitly.
     --->The most enhanced Reader to read character data from the file is BufferedReader.



     */
}
