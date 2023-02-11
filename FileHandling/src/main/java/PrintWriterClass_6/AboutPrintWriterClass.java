package PrintWriterClass_6;

public class AboutPrintWriterClass {
    /**
     * PrintWriter:-
     -->It is most enhanced writer to write character data to the file.
     -->The main advantage of PrintWriter is we can write any type of primitive data type directly to the file.

     *constructors og PrintWriter:-
     1.PrintWriter refVariable=new PrintWriter(String fileName);
     2.PrintWriter refVariable=new PrintWriter(File refVariableOfFile);
     3.PrintWriter refVariable=new PrintWriter(Writer refVariableOfWriter);

     NOTE:-
     --->PrintWriter can communicate either directly to the File or via some Writers object also.

     *Methods of PrintWriter:-
     1.Write methods:-
     a)write(int ch)-->takes integer value and prints respective character
     b)write(char[] ch)
     c)write(String s)
     d)flush()
     e)close()

     2.Print methods:-
     a)print(char ch)
     b)print(int a)
     c)print(double d)
     d)print(boolean b)
     e)print(String s)
         :
         :
      so on

     3.Println methods:-
     a)println(char ch)
     b)println(int a)
     c)println(double d)
     d)println(boolean b)
     e)println(String s)
     :
     :
     so on

     NOTE:-
     * refVariable.write(100);  --->in this case corresponding character 'd' will be added to the file.
     * refVariable.print(100);  --->in this case int value 100 will be added to the file.


     *TYPES OF DATA:-
     1.CHARACTER DATA(TEXT DATA)---------------------------------------->handled by------->Reader/writer
     2.BINARY DATA(VIDEO FILES,AUDIO FILES,IMAGE FILES)----------------->handled by------->Streams----->1.to read binary data------------->InputStream
                                                                                                  ----->2.to write binary data to file---->OutputStream
     *CONCLUSION 1:-
     --->The most enhanced writer to write character data to the file is PrintWriter.
     --->And the most enhanced reader to read character data from the file is bufferedReader.

     *CONCLUSION 2:-
     --->In general we can use readers and writers to handle character data(text data).
     --->Where as we can use Streams to handle Binary data.
     --->We can use FileInputStream to read binary data from the file, and we can use FileOutputStream to write binary data to the file.


     *HIERARCHY:-
     *Object<-----------1.Writer(abstract class)<----(extends)-----1.OutputStreamWriter<----(extends)----FileWriter
                                                <-----(extends)----2.BufferedWriter
                                                <-----(extends)----3.PrintWriter
            <-----------2.Reader(abstract class)<-----(extends)----1.In putStreamReader<-----(extends)---FileReader
                                                <-----(extends)----2.BufferedReader
     */
}
