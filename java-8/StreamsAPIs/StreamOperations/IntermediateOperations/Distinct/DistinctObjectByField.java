package StreamsAPIs.StreamOperations.IntermediateOperations.Distinct;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DistinctObjectByField {
    /**In real-world applications, we will be dealing with a stream of custom classes or complex types (representing some system entity).
     *By default, all Java objects inherit the equals() method from Object class.
     *The default equals() method compares the references for checking the equality of two instances.
     *So, it is highly recommended to override the equals() method and define custom logic for object equality.
     *If we do not override the equals() method in our custom type, then we may see strange behavior while finding the distinct elements from a Stream. */
    public static void main(String[] args) {

        Person person1=new Person(1,"sagar","dodamani");
        Person person2=new Person(1,"raj","dodamani");
        Person person3=new Person(2,"ram","dodamani");
        Person person4=new Person(2,"anuja","dodamani");
        Person person5=new Person(3,"prappulla","dodamani");
        Person person6=new Person(3,"suraj","chougala");
        Person person7=new Person(4,"sita","gupta");

        Collection<Person> list= Arrays.asList(person1,person2,person3,person4,person5,person6,person7);

        List<Person> distinctElements=list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctElements);

    }
}
class Person{
    int id;
    String name;
    String SirName;

    public Person(int id, String name, String sirName) {
        this.id = id;
        this.name = name;
        SirName = sirName;
    }
    @Override
    public boolean equals(Object obj)
    {if (this == obj) {
        return true;
    }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return Objects.equals(id, other.id);
    }
}


