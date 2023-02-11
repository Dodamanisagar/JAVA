package Serialization_7.Externalization;

public class AboutExternalization {
    /**Externalization:-
     --->In serialization everyThing takes care by JVM.
     --->Programmer doesn't have any control.
     --->Hence in serialization it is always possible to save total objects to the file.
     --->And it is not possible to save part of the Objects.
     --->Which may creates performance problem.
     --->To overcome these issues we should go for Externalization.

     *Advantages:-
     --->In Externalization everything takes care by programmer and JVM doesn't have any control.
     --->Based on our requirements we can save either total objects or part of the objects.
     --->which improves performance of the system.

     *Externalizable interface:-
     --->To provide Externalization ability for any java objects compulsory the corresponding class should implement Externalizable interface.
     --->It is a child interface of serializable.
     --->It contains 2 methods:-
        1)writeExternal()
        2)readExternal()

     *Methods of Externalization:-
     1)writeExternal():-
     --->Syntax:-"public void writeExternal(ObjectOutput obj) throws IOException{}".
     --->this method will be executed automatically at the time of serialization.
     --->Within this method we have to write code to save required variables to the file.

     2)readExternal():-
     --->Syntax:-"public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException{}".
     --->this method will be executed automatically at the time of de-serialization.
     --->Within this method we have to write code to read required variables from the file and assign to current Object.
     --->But Strictly speaking at the time of de-Serialization JVM will create a separate new object by executing public no-argument constructor.
     --->On that Object JVM will call readExternal().
     --->Hence every Externalizable implemented class should compulsory contain 'public no-argument constructor'.
     --->Other wise we will get Run time Exception saying 'InvalidClass Exception'.

     *NOTE:-
     --->In serialization transient keyword will play a role.
     --->But in Externalization transient keyword won't play any role.
     --->Of-course transient keyword not required in Externalization.

     *Difference between Serialization and Externalization:-
     1)Serialization:-
     --->It is default serialization.
     --->In this everyThing takes care by JVM.
     --->Not possible to save only part of the objects.
     --->Performance wise it is low.
     --->Best choice when we want to save total object.
     --->It is marker interface.
     --->In this it is not compulsory to have 'public no-argument constructor'.
     --->transient keyword is used for security purpose.

     2)Externalization:-
     --->It is custom serialization.
     --->In this everyThing takes care by programmer.
     --->Possible to save only part of the objects or complete object.
     --->High Performance .
     --->Best choice when we want to save part of the object.
     --->It is not marker interface,it contain 2 methods.
     --->In this it is compulsory to have 'public no-argument constructor'.
     --->transient keyword is not needed.
     * */
}
