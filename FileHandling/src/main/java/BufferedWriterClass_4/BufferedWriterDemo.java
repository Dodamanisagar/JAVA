package BufferedWriterClass_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("BufferedWriter.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(100);//d
        bufferedWriter.newLine();
        char[] ch={'S','a','g','a','r'};
        bufferedWriter.write(ch);
        bufferedWriter.newLine();
        bufferedWriter.write("Dodamani");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();//whenever we are using BufferedWriter or BufferedReader it is not necessary to close writer or reader files
    }
}
