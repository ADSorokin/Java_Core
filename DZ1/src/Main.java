package src;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
        System.out.println("Hello World");
    }

    /**
    // * Другой, очень полезный класс приложения. Здесь мы можем описать
    // * его основное назначение и способы взаимодействия с ним.
    // */
    public static class OtherClass {

        /**
         * Функция суммирования двух целых чисел
         *
         * @param a первое слагаемое
         * @param b второе слагаемое
         * @return сумма a и b, без проверки на переполнение переменной.
         */
        public static int add(int a, int b) {
            return a + b; // возврат без проверки переполнения
        }

        /**
         * Функция деления двух целых чисел
         *
         * @param a делимое
         * @param b делитель
         * @return частное a и b, без проверки на переполнение переменной.
         */
        public static int div(int a, int b) {
            return a / b; // возврат без проверки переполнения
        }

        /**
         * Функция умножения двух целых чисел
         *
         * @param a первый множитель
         * @param b второй множитель
         * @return произведение a и b, без проверки на переполнение переменной.
         */
        public static int mul(int a, int b) {
            return a * b; // возврат без проверки переполнения
        }

        /**
         * Функция вычитания двух целых чисел
         *
         * @param a уменьшаемое
         * @param b вычитаемое
         * @return разность a и b, без проверки на переполнение переменной.
         */
        public static int sub(int a, int b) {
            return a - b; // возврат без проверки переполнения
        }
    }

    /**
     * * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
     * Внешний вид важен, поэтому этот класс существует.
     */
    public static class Decorator {
        /**
         * Функция декорирования числа для вывода в консоль
         * в виде строки с преамбулой 'Вот Ваше число'
         *
         * @param a число, требующее декорации
         * @return Отформатированная строка.
         */
        public static String decorate(int a) {
            /**
             * Метод декорирует число, добавляя к нему строку
             * при помощи функции форматирования строк
             * */
            return String.format("Here is your number: %d.", a);
        }
    }
}




