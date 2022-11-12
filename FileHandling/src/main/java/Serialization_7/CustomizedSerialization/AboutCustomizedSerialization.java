package Serialization_7.CustomizedSerialization;

public class AboutCustomizedSerialization {
    /**CustomizedSerialization:-
     --->During default serialization there may ba a chance of lose of information because of transient keyword.
     --->To overcome This we should go for customized serialization.
     --->We can implement customized serialization by using the following 2 methods.
     1)private void writeObject(ObjectOutputStream obj) throws Exception
          --->This method will be executed automatically at the time of serialization.
          --->Hence at the time of serialization if we want to perform any activity we have to define that in this method only.
     2)Private void readObject(ObjectInputStream obj) throws Exception
          --->This method will be executed automatically at the time of de-serialization.
          --->Hence at the time of de-serialization if we want to perform any activity we have to define that in this method only.

     *Callback methods:-
     --->The above methods are callback methods.
     --->Because these are executed automatically by the JVM.
     --->While performing specific class object serialization if we required to do extra work,then in that class we have to define above methods.
     --->Programmer cant call private methods directly from the outside the class.
     --->But JVM can call private methods directly from outside the class.
     */
}
