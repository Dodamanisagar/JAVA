package ProgramsForPractice;

import java.io.*;

public class RemoveDublicateFromFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("sagar.txt"));
        PrintWriter printWriter=new PrintWriter("RemoveDublicate.txt");
        String lines=bufferedReader.readLine();
        while (lines!=null)
        {
            boolean availble=false;
            BufferedReader compare=new BufferedReader(new FileReader("RemoveDublicate.txt"));
            String compareLine=compare.readLine();
            while (compareLine!=null)
            {
                if(lines.equals(compareLine))
                {
                    availble=true;
                    break;
                }
                compareLine=compare.readLine();
            }
            if(availble==false)
            {
                printWriter.println(lines);
                printWriter.flush();

            }
            lines=bufferedReader.readLine();
        }



    }
}
