package Java_core;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Вася", 50000);
        Employee emp2 = new Employee("Петя", 60000);
        Manager mgr = new Manager("Ваня", 80000);

        Employee[] employees = {emp1, emp2, mgr};

        System.out.println("Before raise:");
        for (Employee emp : employees) {
            System.out.println(emp.getSalary());
        }


        Manager.raiseSalaries(employees, 5000);

        System.out.println("\nAfter raise:");
        for (Employee emp : employees) {
            System.out.println(emp.getSalary());
        }
    }
}

