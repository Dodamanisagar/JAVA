package FileReaderClass_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MethodReadCharString {
    public static void main(String[] args) throws IOException {
        File file=new File("fileWriter.txt");
        FileReader fileReader=new FileReader(file);
        char[] characters=new char[(int)file.length()];//casting is compulsory because character array doesn't allow long size
        fileReader.read(characters);
        for (char readChar:characters) {
            System.out.println(readChar);
        }
    }
}
