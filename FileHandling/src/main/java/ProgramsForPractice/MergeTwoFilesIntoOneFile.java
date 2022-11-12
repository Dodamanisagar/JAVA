package ProgramsForPractice;

import java.io.*;

public class MergeTwoFilesIntoOneFile {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter=new PrintWriter("MergedData.txt");
        BufferedReader files=new BufferedReader(new FileReader("sagar.txt"));
        String line=files.readLine();
        while (line!=null)
        {
            printWriter.println(line);
            line=files.readLine();
        }

        files=new BufferedReader(new FileReader("BufferedWriter.txt"));
        line=files.readLine();
        while (line!=null)
        {
            printWriter.println(line);
            line=files.readLine();
        }
        printWriter.flush();
        files.close();
        printWriter.close();
    }
}
