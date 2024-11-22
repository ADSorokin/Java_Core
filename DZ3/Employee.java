package Java_core;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public int compareDates(int year1, int month1, int day1,
                            int year2, int month2, int day2) {
        int result = Integer.compare(year1, year2);
        result = (result != 0) ? result : Integer.compare(month1, month2);
        return (result != 0) ? result : Integer.compare(day1, day2);
    }
}
