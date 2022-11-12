package FileReaderClass_3;


import java.io.FileReader;
import java.io.IOException;

public class MethodRead {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("fileWriter.txt");
        int characters=fileReader.read();
        while(characters!=-1)
        {
            System.out.println((char)characters);//converting integers into characters
            characters=fileReader.read();
        }
        fileReader.close();
    }
}
