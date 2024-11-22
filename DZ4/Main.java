public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Маша", 25, "1234567890", Customer.Gender.FEMALE),
                new Employee("Вася", 30, "0987654321", Customer.Gender.MALE),
                new Employee("Петя", 35, "1122334455", Customer.Gender.MALE),
                new Employee("Наташа", 28, "5566778899", Customer.Gender.FEMALE)
        };


        Holiday todayHoliday = HolidayManager.getTodayHoliday();

        System.out.println("Сегодня праздник:" + todayHoliday);
        HolidayManager.congratulateEmployees(employees, todayHoliday);
    }
}
