package FileClass_1;

public class AboutFileClass {
    /**File:-
     -->This Class Allows us to work with files.
     -->To use the files class creat an object of the class and specify the file name or Directory name
     Ex:-import java.io.File;
          File obj=new File("FileName.txt");

     *Methods Present in File Class:-
     1.canRead():-
     *Return Type-->boolean
     *Description-->Tests whether the file is readable or not.

     2.canWrite():-
     *Return Type-->boolean
     *Description-->Tests whether the file is writable or not.

     3.creatNewFile():-
     *Return Type-->boolean
     *Description-->Creates an empty file,if physical file is not present.

     4.delet():-
     *Return Type-->boolean
     *Description-->Delet the file.

     5.exists():-
     *Return Type-->boolean
     *Description-->Tests whether the File is exists or not.

     6.getName():-
     *Return Type-->String
     *Description-->Returns the name of the File.

     7.getAbsolutePath():-
     *Return Type-->String
     *Description-->Returns the absolute path of the file.

     8.lenght():-
     *Return Type-->long
     *Description-->Returns the size of the file in bytes.

     9.list():-
     *Return Type-->String[]
     *Description-->Returns an array of the files in the directory.

     10.mkdir():-
     *Return Type-->boolean
     *Description-->Creates a directory.

     11.isFile():-
     *Return Type-->boolean
     *Description-->Returns true if the file object pointing to physical file.

     12.isDirectory():-
     *Return Type-->boolean
     *Description-->Returns true if the file object represents Directory.


     NOTE:-
     -->Java file IO concepts is implemented based on UNIX operating system & in UNIX everything is threated as a File.
     -->Hence we can use java file object to represent both file and Directories


     */
}
