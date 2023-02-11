package PrintWriterClass_6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter=new PrintWriter("Printwriter.txt");
        printWriter.write(100);
        printWriter.println();
        printWriter.println(100);
        printWriter.print(true);
        printWriter.println();
        printWriter.println("sagar dodamani");
        printWriter.flush();
        printWriter.close();
    }
}
