package hw2;

public class MainApp<i> {
    public static void main(String[] args) {
        System.out.println();
    }
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        public static void fillArray () {
            int[] arr = new int[8];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 3;
            }
        }

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        public static void changeArray () {
            int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < w.length; i++) {
                if (w[i] < 6) {
                    w[i] = w[i] * 2;
                }
            }

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

            public static void fillDiagonal () {
                int length = 4;
                int[][] arr = new int[length][length];
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        if (i == arr.length - 1 - j) {
                            arr[i][j] = 1;
                        }
                    }
                }
            }
        }
    }

