package FileClass_1;
import java.io.File;

public class CreatNewDirectory {
    public static void main(String[] args) //throws IOException
    {
        File file=new File("FILE HANDLE");
        System.out.println(file.exists());//false for first execution
        file.mkdir();//creates new directory
        System.out.println(file.exists());//true for first and n'th time
    }
}
