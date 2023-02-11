package FileClass_1;
/**program to print file name directory name seperately*/
import java.io.File;

public class AllFilesOrDirectories {
    public static void main(String[] args) {
        int fileCount=0;
        int dirCount=0;
        File file=new File("C:\\SAGAR");
        String[] list=file.list();
        for (String name:list) {
            File fileOrDirectory=new File(file,name);
            if(fileOrDirectory.isDirectory())
            {
                fileCount++;
                System.out.println(name);
            }
            else if (fileOrDirectory.isFile()) {
                dirCount++;
                System.out.println(name);

            }
        }
        System.out.println("total number of files= "+fileCount);
        System.out.println("total number of dir= "+dirCount);
    }
}
