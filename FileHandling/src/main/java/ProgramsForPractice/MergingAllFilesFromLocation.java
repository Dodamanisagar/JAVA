package ProgramsForPractice;

import java.io.*;

public class MergingAllFilesFromLocation {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter=new PrintWriter("MergingAllFiles.txt");
        File file=new File("C:\\mergingfiles");
        String[] lines= file.list();
        for (String files:lines) {
            BufferedReader bufferedReade=new BufferedReader(new FileReader(new File(file,files)));
            String newLines=bufferedReade.readLine();
            while (newLines!=null)
            {
                printWriter.println(newLines);
                newLines=bufferedReade.readLine();
            }


        }
        printWriter.flush();
    }
}
