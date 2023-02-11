package Serialization_7.Introduction;

public class AboutSerialization {
    /**SERIALIZATION:-
     --->The process of writting state of an Object into a file is called as Serialization.
     --->But strictly speaking it is the process of converting object from java supported form into either file supported form or network supported form.
     --->By using FileOutputStream and ObjectOutPutStream classes we can achieve Serialization.


     *DE-SERIALIZATION:-
     --->The process of reading state of an Object from the file is called De-Serialization.
     --->But Strictly speaking it is the process of converting an Object from either file supported form or network supported form into java supported form.
     --->By using FileInputStream and ObjectInputStream classes we can achieve De-serialization.

     *NotSerializableException:-
     --->This is RunTimeException.
     --->When we don't implement Serializable interface to the class which we want to
         serialize after executing the code will compile fine but during runtime we get this exception.
     --->Format of exception--->NotSerializableException:class name
     --->We can serialize only serializable objects.
     --->An object is said to be serializable if and only if the corresponding class implements serializable interface.
     --->Serializable interface present in java.io package.
     --->It doesn't contain any methods,it is a marker interface.

     *transient keyword:-
     --->Transient modifier applicable only for variables but not for methods and class.
     --->At the time of serialization if we don't want to save the value of a particular variable to meet security
         constraints then we should declare that variable as transient.
     --->While performing serialization JVM ignores the original values of transient variable and save default value to the file.
     --->Hence transient mean not to serialize

     *static v/s transient:-
     --->Static variable is a not part of object state and hence it won't participate in serialize.
     --->Due to this declaring static variable as transient there is no use
     ex:-transient static int e=50;

     *Final v/s transient:-
     --->Final variables will be participated in serialization directly by their value.
     --->Hence declaring final variable as transient there is no impact.
     ex:-transient final int f=60;

     NOTE:-
     ----->We can serialize any number of Objects to the File
     ----->But in which order we serialized in the same order only we have to deserialize
     ----->The order of Object is important in serialization.


     * */
}
