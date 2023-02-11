package Serialization_7.SerializationWithRespectToInheritance;

import java.io.*;

class Brand {
    String name = "dell";

    Brand() {
        System.out.println("Brand constructor called");
    }
}

class Dell extends Brand implements Serializable {
    double Price = 100000;

    Dell() {
        System.out.println("Dell constructor called");
    }
}

public class Case_2_Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dell dell = new Dell();
        dell.name = "lenovo";
        dell.Price = 30000;

        //Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("InheritancInSerialiazationCase2.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dell);

        //De-Serialization
        FileInputStream fileInputStream = new FileInputStream("InheritancInSerialiazationCase2.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        Dell dell2 = (Dell) object;
        System.out.println(dell2.name + "---------" + dell2.Price);
    }
}
