package Serialization_7.Externalization;

import java.io.*;

public class ExternalizationDemo implements Externalizable {
    String name;
    int age;
    long phoneNumber;

    public ExternalizationDemo()
    {
        System.out.println("no-argument constructor");
    }

    public ExternalizationDemo(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(age);
    }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
     name=(String) in.readObject();
     age= (int) in.readObject();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExternalizationDemo demo=new ExternalizationDemo("sagar",24,7899123197l);
        System.out.println("before externalization");
        System.out.println(demo.name+"---------"+demo.age+"--------"+demo.phoneNumber);
        //Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("Externalization.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(demo);

        //De-Serialization
        System.out.println("after externalization");
        FileInputStream fileInputStream = new FileInputStream("Externalization.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        ExternalizationDemo demo1 = (ExternalizationDemo) object;
        System.out.println(demo1.name+"---------"+demo1.age+"-----"+demo1.phoneNumber);
    }
}
