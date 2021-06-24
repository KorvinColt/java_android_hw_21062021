package hw1;

public class Main {

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
    }

    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void type() {
        byte val1 = 127;
        short val2 = 32767;
        int val3 = 2147483647;
        long val4 = 9223372036854775807L;
        float val5 = 23.34f;
        double val6 = -234.234;
        char val7 = '*';
        boolean val8 = false;
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean task10and20(int x1, int x2) {
        return 10 <= x1 + x2 && x1 + x2 <= 20;
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("число пложительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greetings(String name) {
        System.out.println("Привет " + name + "!");
    }

    // 8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapOrNotLeap(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }
    }
}

