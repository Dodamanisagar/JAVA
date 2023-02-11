package FileWriterClass_2;

import java.io.FileWriter;
import java.io.IOException;

public class CreatIngFileWithOverridingOperation {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("fileWriterWithOverriding.txt");//overrides
        fileWriter.write(100);//single character(int)->d
        fileWriter.write("og lover");//string
        fileWriter.write('\n');//new line

        char[] characters={'a','b','c','d'};
        fileWriter.write(characters);//character array
        fileWriter.write('\n');
        fileWriter.flush();
        fileWriter.close();
    }
}
