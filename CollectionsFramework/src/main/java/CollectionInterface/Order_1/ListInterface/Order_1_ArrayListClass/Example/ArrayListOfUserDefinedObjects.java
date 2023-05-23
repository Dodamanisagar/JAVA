package CollectionInterface.Order_1.ListInterface.Order_1_ArrayListClass.Example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfUserDefinedObjects {
    /**Since ArrayList supports generics, you can create an ArrayList of any type.
     * It can be of simple types like Integer, String, Double or complex types like an ArrayList of ArrayLists, or an ArrayList of HashMaps or an ArrayList of any user defined objects.*/
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Rajeev", 25));
        users.add(new User("John", 34));
        users.add(new User("Steve", 29));

        users.forEach(user -> {
            System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
        });
    }
}
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
