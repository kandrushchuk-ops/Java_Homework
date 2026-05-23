package by.homework.lesson1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Чётные числа:");
        if (num1 % 2 == 0) System.out.println(num1);
        if (num2 % 2 == 0) System.out.println(num2);
        if (num3 % 2 == 0) System.out.println(num3);
    }
}
