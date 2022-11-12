package Serialization_7.ObjectGraphInSerialization;

import java.io.*;
class AboutObjectGraphsInSerialization{
    /**
     --->whenever we are serializing objects the set of all objects which are reachable from that object will be serializable automatically
     --->this group of object is nothing but object graph.
     --->In Object Graph every Object should be serializable.
     --->If at least one object is not serializable then we will get runtime exception saying NotSerializableException.
     --->In the below program whenever we are serializing ClassObjectOne object automatically ClassObjectTwo & ClassObjectThree
         objects get serialized, Because they are part of object graph of ClassObjectOne.
     */
}
class ClassObjectOne implements Serializable {
    ClassObjectTwo c2 = new ClassObjectTwo();
}

class ClassObjectTwo implements Serializable {
    ClassObjectThree c3 = new ClassObjectThree();
}

class ClassObjectThree implements Serializable {
    int j = 20;
}

public class ObjectGraphsInSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassObjectOne coo = new ClassObjectOne();
        //Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("ObjectGraphsInSerialization.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(coo);

        //De-Serialization
        FileInputStream fileInputStream = new FileInputStream("ObjectGraphsInSerialization.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        ClassObjectOne coo2 = (ClassObjectOne) object;
        System.out.println(coo2.c2.c3.j);
    }
}
