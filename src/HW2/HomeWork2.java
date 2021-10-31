package HW2;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Введите год: ");
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        System.out.println("Result method leapYear: " + leapYear(year));
        System.out.println("*********************************");
        System.out.println("Result method sum: " + sum(5, -10));
        System.out.println("*********************************");
        System.out.println("Result method positiveNegative: ");
        positiveNegative(0);
        System.out.println("*********************************");
        System.out.println("Result method evenOdd: " + negativePositive(10));
        System.out.println("*********************************");
        System.out.println("Result method print: ");
        numberOfWords("Привет", 10);
    }

    public static boolean sum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void positiveNegative(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean negativePositive(int a) {
        return a < 0;
    }

    public static void numberOfWords(String c, int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println(c);
        }
    }

    public static boolean leapYear(int year) {
        return year % 4 == 0 && year % 400 == 0 || year % 100 != 0;

    }
}

