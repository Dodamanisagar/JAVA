package FileWriterClass_2;

public class AboutFileWriterClass {
    /**FileWriter:-
     -->We can use a FileWriter object to write Character data (text/data) to a file.

     *Contructors of FileWriter:-
     a)Constructors meant for Overrid the existing data :-
     1.FileWriter refVariable=new FileWriter(String fileName);
     2.FileWriter refVariable=new FileWriter(File refVariable);

     b)Constructors meant for append operation :-
     3.FileWriter refVariable=new FileWriter(String fileName,boolean append);
     4.FileWriter refVariable=new FileWriter(File refVariable,boolean append);

     *NOTE:-
     -->If specified file is not already available then all the above constructors will create that file.

     *Methods of FileWriter:-
     1.write(String text):-
     *Return Type:-void
     *Description:-It is used to write The string into the FileWriter.

     2.flush():-
     *Return Type:-void
     *Description:-It is used to flushes the data to FileWriter.

     3.close:-
     *Return Type:-void
     *Description:-It is used to close the FileWriter.

     *DisAdvantage of FileWriter:-
     -->We have to add line separator manually in FileWriter.
     -->Else we will get everything in a single line.
     -->In some system \n will not work as a line separator.


     */
}
