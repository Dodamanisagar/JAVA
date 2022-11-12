package Serialization_7.SerializationWithRespectToInheritance;

import java.io.*;

class Animal implements Serializable
{
    int i=20;
}
class Dog extends Animal
{
    int j=30;
}
public class Case_1_Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog=new Dog();
        System.out.println(dog.i+"-----"+ dog.j);
        FileOutputStream fileOutputStream = new FileOutputStream("InheritancInSerialiazationCase1.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dog);

        //De-Serialization
        FileInputStream fileInputStream = new FileInputStream("InheritancInSerialiazationCase1.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        Dog dog2 = (Dog) object;
        System.out.println(dog2.i+"---------"+dog2.j);
    }
}
