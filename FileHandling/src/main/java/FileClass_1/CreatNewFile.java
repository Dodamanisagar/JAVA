package FileClass_1;

import java.io.File;
import java.io.IOException;

public class CreatNewFile {
    public static void main(String[] args) throws IOException {
        File file=new File("sagar.txt");//this line won't create any physical file instead it just create java file object to represent the name sagar.txt
        System.out.println(file.exists());//false for first execution
        file.createNewFile();//this will create new file with the name sagar.txt
        System.out.println(file.exists());//true
    }
}
