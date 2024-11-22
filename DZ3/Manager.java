package Java_core;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }


    public static void raiseSalaries(Employee[] employees, double increment) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() + increment);
            }
        }
    }
}
