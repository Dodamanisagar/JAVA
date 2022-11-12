package StreamsAPIs.StreamOperations.IntermediateOperations.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingDistinctSalaries {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "sagar", 100),
                new Employee(2, "sagar", 100),
                new Employee(2, "ramesh", 200),
                new Employee(2, "suraj", 200),
                new Employee(2, "ramesh", 300),
                new Employee(2, "parth", 300),
                new Employee(2, "anuja", 200));
        //distinct salary
        List<Long> distinctSalaries = employeeList.stream().map(a -> a.getSalary()).distinct().collect(Collectors.toList());
        System.out.println(distinctSalaries);

        //distinct names
        List<String> distinctNames = employeeList.stream().map(a -> a.getName()).distinct().collect(Collectors.toList());
        System.out.println(distinctNames);

        //distinct Id
        List<Integer> distinctId = employeeList.stream().map(s -> s.getId()).distinct().collect(Collectors.toList());
        System.out.println(distinctId);
    }
}

class Employee {
    int id;
    String name;
    long salary;

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
