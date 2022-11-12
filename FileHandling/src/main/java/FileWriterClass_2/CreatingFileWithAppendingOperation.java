package FileWriterClass_2;

import java.io.FileWriter;
import java.io.IOException;

public class CreatingFileWithAppendingOperation {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("fileWriterWithOverriding.txt",true);//overrides
        fileWriter.write("S");
        fileWriter.write(97);
        fileWriter.write("gar");

        fileWriter.write('\n');//new line

        char[] characters={'a','b','c','d'};
        fileWriter.write(characters);//character array
        fileWriter.write('\n');
        fileWriter.flush();
        fileWriter.close();
    }
}
