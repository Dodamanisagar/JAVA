package BufferedWriterClass_4;

public class AboutBufferedWriter {
    /**
     *Usage of FileWriter And FileReader is not recommended because:-
     --->While writing data by FileWriter we have to insert line separator manually.
     --->Which is varied from system to system.It is difficult to the programmer.
     --->While reading data by using FileReader we can read data character by characters which is not convenient to the programmer.
     --->To overcome these limitations we should go for BufferedReader and bufferedWriter.

     *BufferedWriter Constructors:-
     1.BufferedWriter refVariable=new BufferedWriter(Writer refVariableOfWriter);
     2.BufferedWriter refVariable=new BufferedWriter(Writer refVariableOfWriter,int bufferSize);

     *NOTE:-
     -->BufferedWriter cant communicate directly with the file.
     -->It can communicate via some writers object only.
     examples:-
     1.BufferedWriter refVariable=new BufferedWriter("sagar.txt");------------------------------------->invalid-->we cant pass directly file name
     2.BufferedWriter refVariable=new BufferedWriter(new File("sagar.txt"));--------------------------->invalid-->we cant pass File object
     3.BufferedWriter refVariable=new BufferedWriter(new FileWriter("sagar.txt"));--------------------->valid
     4.BufferedWriter refVariable=new BufferedWriter(new BufferedWriter(new FileWriter("sagar.txt")));-->valid

     *Methods of BufferedWriter:-
     1.write(char ch):-
     --->Return type-->void
     --->It is used to write a characters into the FileWriter.

     2.write(char[] ch):-
     --->return type-->void
     --->It is used to write a characters array into FileWriter.

     3.write(String s);-
     --->Return type-->void
     --->It is used to write a String into the FileWriter.

     4.flush():-
     --->Return type-->void
     --->It is used to flush the data into the FileWriter.

     5.close():-
     --->Return type-->void
     --->It is used to close the FileWriter.

     6.newLine():-extra method present in BufferedWriter
     --->Return type-->void
     --->It is used to Insert a line separator.

     Note:-
     --->Whenever we are closing BufferedWriter automatically underlying FileWriter will be closed, and we are not required to close explicitly.
     */
}
