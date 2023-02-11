package Serialization_7.Introduction;

import java.io.*;

class SerializeDemo implements Serializable {
    int a = 10;
    int b = 20;
    transient int c = 30;
    transient int d = 40;
    transient static int e = 50;
    transient final int f = 60;
}

class FullName implements Serializable {
    String first_name = "sagar";
    String last_name = "dodamani";
}

class Demo2 implements Serializable {
    int age = 24;
    long phone_num = 7899123197l;
}

public class SerializingMultipleObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializationMethod(new SerializeDemo());
        de_serializationMethod();
        serializationMethod(new FullName());
        de_serializationMethod();
        serializationMethod(new Demo2());
        de_serializationMethod();
    }

    public static void serializationMethod(Object sd) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("MultipleObjectSerializeDemo.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sd);
        System.out.println("serialization successfully completed");
    }

    public static void de_serializationMethod() throws IOException, ClassNotFoundException {
        FileInputStream fileOutputStream = new FileInputStream("MultipleObjectSerializeDemo.ser");
        ObjectInputStream objectOutputStream = new ObjectInputStream(fileOutputStream);
        Object obj = objectOutputStream.readObject();//used when we don't know serialization order
        if (obj instanceof SerializeDemo) {
            SerializeDemo sd2 = (SerializeDemo) obj;
            System.out.println(sd2.a);
            System.out.println(sd2.b);
            System.out.println(sd2.c);
            System.out.println(sd2.d);
            System.out.println(sd2.e);
            System.out.println(sd2.f);
        }
        if (obj instanceof FullName) {
            FullName fn = (FullName) obj;
            System.out.println(fn.first_name);
            System.out.println(fn.last_name);
        }
        if (obj instanceof Demo2) {
            Demo2 d2 = (Demo2) obj;
            System.out.println(d2.age);
            System.out.println(d2.phone_num);
        }
        System.out.println("De-serialization successfully completed");
    }
}
