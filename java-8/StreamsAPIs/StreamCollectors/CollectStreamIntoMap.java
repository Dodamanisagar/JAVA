package StreamsAPIs.StreamCollectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectStreamIntoMap {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>(Arrays.asList(
                new Employee(1,"A",100),
                new Employee(2,"a",200),
                new Employee(3,"b",300),
                new Employee(4,"b",400),
                new Employee(5,"c",500)));

       /**collect a list of Employee objects to Map in where employee ids are unique fields and used as keys to the Map entries.*/
        Map<Integer,Employee> employeeMap=employeeList.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        System.out.println(employeeMap);

    }
}
class Employee
{
    public int id;
    public String name;
    public long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    Employee(int id, String name, long salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
