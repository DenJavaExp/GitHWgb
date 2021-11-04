package HW3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {

        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] array2 = new int[100];
        int[] array3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] array4 = new int[5][5];
        int[] array5 = new int[]{1, 20, -1, 64, -21, 15, 99, 11, 85, 2};
        int[] array6 = new int[]{2, 2, 2, 1, 2, 2, 10, 1};

        //int[] array7 = new int[]{1, 1, 1, 2, 1}; => массивы для тестирования  checkBalance();
        //int[] array8 = new int[]{1, 2, 4};

        replacement(array);
        hundred(array2);
        lessThanSix(array3);
        diagonally(array4);
        String atr = Arrays.toString(test(10, 1));
        minMax(array5);
        System.out.println(checkBalance(array6));
    }

    public static void replacement(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void hundred(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }

    public static void lessThanSix(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
            System.out.print(array3[i] + " ");
        }
        System.out.println();
    }

    public static void diagonally(int[][] array4) {
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if  (i == j || i + j == 4) {
                    array4[i][j] = 1;
                } else {
                    array4[i][j] = 0;
                }
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] test(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        for (int i : array) {
            System.out.print(i);
        } System.out.println();
        return array;
    }

    public static void minMax(int[] array) {
        int min = 0;
        int max = 0;
        for (int j : array) {
            if (j < min) {
                min = j;
            } else if (j > max) {
                max = j;
            }
        }
        System.out.print("Минимальное число = " + min + ", " + "Максимальное число = " + max);
        System.out.println();
    }

    public static boolean checkBalance(int[] array) {
        int sum = 0;
        int split = 0;
        for (int i : array) {
            sum = sum + i;
        }
        if (sum % 2 == 0) {
            for (int i : array) {
                split = split + i;
                if (split == sum / 2) {
                    return true;
                }
            }
        }
        return false;
    }

}


