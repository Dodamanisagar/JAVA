package ProgramsForPractice;

import java.io.*;

public class MergingDataAlternativly {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter=new PrintWriter("AlternativeMerging.txt");
        BufferedReader file1=new BufferedReader(new FileReader("sagar.txt"));
        BufferedReader file2=new BufferedReader(new FileReader("BufferedWriter.txt"));
        String line1=file1.readLine();
        String line2=file2.readLine();
        while ((line1!=null)||(line2!=null))
        {
            if(line1!=null)
            {
                printWriter.println(line1);
                line1=file1.readLine();
            }
            if(line2!=null)
            {
                printWriter.println(line2);
                line2=file2.readLine();
            }
        }
        printWriter.flush();
        file2.close();
        file1.close();
        printWriter.close();

    }
}
