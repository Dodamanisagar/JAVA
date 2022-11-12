package Serialization_7.CustomizedSerialization;

import java.io.*;

class Account implements Serializable
{
    String username="sagar";
    transient String password="123Password";

    private void writeObject(ObjectOutputStream obj) throws IOException {
        obj.defaultWriteObject();
        String encriptedPassword="lock"+password;
        obj.writeObject(encriptedPassword);
    }

    private void readObject(ObjectInputStream obj) throws IOException, ClassNotFoundException {
        obj.defaultReadObject();
        String encriptedPassword=(String) obj.readObject();
       password=encriptedPassword.substring(4);
    }

}
public class CustomizedSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account account=new Account();
        System.out.println("before serialization");
        System.out.println(account.password+"-------"+account.username+"\n");

        //serialization
        System.out.println("after serialization");
        FileOutputStream fileOutputStream=new FileOutputStream("customized.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(account);

        //de-serialization
        FileInputStream fileinputStream=new FileInputStream("customized.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileinputStream);
        Account a=(Account) objectInputStream.readObject();
        System.out.println(a.password+"------"+a.username);
    }
}
