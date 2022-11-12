package Serialization_7.CustomizedSerialization;

import java.io.*;

class AccountFullDetail implements Serializable
{
    String username="sagar";
    transient String password="123Password";
    transient int pin=1234;


    private void writeObject(ObjectOutputStream obj) throws IOException {
        obj.defaultWriteObject();
        String encriptedPassword="lock"+password;
        int encriptedpin=4444+1234;
        obj.writeObject(encriptedPassword);
        obj.writeObject(encriptedpin);
    }

    private void readObject(ObjectInputStream obj) throws IOException, ClassNotFoundException {
        obj.defaultReadObject();

        String encriptedPassword=(String) obj.readObject();
        password=encriptedPassword.substring(4);

        int encriptedpin= (int) obj.readObject();
        pin=encriptedpin-4444;
    }

}
public class CustomizedSerializationWithMultipleTransient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AccountFullDetail account=new AccountFullDetail();
        System.out.println("before serialization");
        System.out.println(account.password+"-------"+account.username+"-----"+account.pin+"\n");

        //serialization
        System.out.println("after serialization");
        FileOutputStream fileOutputStream=new FileOutputStream("customizedMultipleTransient.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(account);

        //de-serialization
        FileInputStream fileinputStream=new FileInputStream("customizedMultipleTransient.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileinputStream);
        AccountFullDetail a=(AccountFullDetail) objectInputStream.readObject();
        System.out.println(a.password+"------"+a.username+"-----"+a.pin);
    }
}
