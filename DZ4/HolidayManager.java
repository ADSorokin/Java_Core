import java.util.Calendar;

public class HolidayManager {

    public static Holiday getTodayHoliday() {
        Calendar today = Calendar.getInstance();
        int month = today.get(Calendar.MONTH) + 1;
        int day = today.get(Calendar.DAY_OF_MONTH);

        if (month == 1 && day == 1) {
            return Holiday.NEW_YEAR;
        } else if (month == 3 && day == 8) {
            return Holiday.WOMEN_DAY;
        } else if (month == 2 && day == 23) {
            return Holiday.MEN_DAY;
        } else {
            return Holiday.NONE;
        }
    }

    public static void congratulateEmployees(Employee[] employees, Holiday holiday) {
        switch (holiday) {
            case NEW_YEAR:
                for (Employee employee : employees) {
                    System.out.println("C Новым Годом!, " + employee.getName() + "!");
                }
                break;

            case WOMEN_DAY:
                for (Employee employee : employees) {
                    if (employee.getGender() == Customer.Gender.FEMALE) {
                        System.out.println("С Днем 8 Марта,! " + employee.getName() + "!");
                    }
                }
                break;

            case MEN_DAY:
                for (Employee employee : employees) {
                    if (employee.getGender() == Customer.Gender.MALE) {
                        System.out.println("Парни ,Поздравляю с 23 !, " + employee.getName() + "!");
                    }
                }
                break;

            case NONE:
            default:
                System.out.println("Нет сегодня праздника(.");
        }
    }
}
