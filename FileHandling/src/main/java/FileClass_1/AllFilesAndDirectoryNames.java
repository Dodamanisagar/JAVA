package FileClass_1;
/**program to print the all file names and directory names present in C:\SAGAR*/
import java.io.File;
public class AllFilesAndDirectoryNames {
    public static void main(String[] args) {
        int count=0;
        File file=new File("C:\\SAGAR");
        String[] list=file.list();//storing all the name into String array
        for (String name:list) {
            count++;
            System.out.println(name);
        }
        System.out.println("total number of file and directories are = "+count);

    }
}
