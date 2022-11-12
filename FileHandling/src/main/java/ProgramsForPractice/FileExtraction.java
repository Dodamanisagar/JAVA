package ProgramsForPractice;

import java.io.*;

public class FileExtraction {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter=new PrintWriter("FileExtraction.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader("Printwriter.txt"));
        String line=bufferedReader.readLine();
        while(line!=null)
        {
            boolean avaible=false;
            BufferedReader targetFile=new BufferedReader(new FileReader("sagar.txt"));
            String targetLine=targetFile.readLine();
            while (targetLine!=null)
            {
                if(line.equals(targetLine))
                {
                    avaible=true;
                    break;
                }
                targetLine=targetFile.readLine();
            }
            if(avaible==false)
            {
                printWriter.println(line);

            }
            line=bufferedReader.readLine();
        }
        printWriter.flush();
    }
}
