package FileReaderClass_3;

public class AboutFileReader {
    /**FileReader:-
     -->it is low level reader to read data(character/text) from file.

     *Constructor of FileReader:-
     1.FileReader refVariable=new FileReader(String fileName);
     2.FileReader refVariable=new FileReader(File refVariableFile);

     Methods of FileReader:-
     1.read():-
     -->return Type-->int
     -->It attempts to read next character from the file and return its unicode value.
     -->If there is no next character then we will get '-1'.
     -->As this method returns unicode value compulsory at the time of printing we should perform type casting.
     when to use-->If the Number of character exceeds int range even after casting then better to go with this method.

     2.read(char[] Variable):-
     -->It attempts to read enough character from the File into char[].
     -->And returns number of characters copied from the File into char[].

     3.close():-
     -->To close the reader.


     *Disadvantage of FileReader:-
     -->By using FileReader we can read data only by character by characters which is not convenient hence BufferReader is introduced

     */
}
