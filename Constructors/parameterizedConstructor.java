class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

        System.out.println(id + " " + name + " " + salary);

    }

}

public class parameterizedConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "radhika", 12);

    }
}
