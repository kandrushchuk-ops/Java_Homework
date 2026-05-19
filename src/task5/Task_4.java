package task5;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число не заканчивающееся на 0:");
        int x = scanner.nextInt();
        if (x % 10 == 0) {
            System.out.println("Вы ввели число заканчивающееся на 0");
            scanner.close();
            return;
        }
        int temp = x;
        System.out.println("Чётные и нечётные цифры числа " + x + ":");
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                System.out.println(digit + " четное");
            } else {
                System.out.println(digit + " нечетное");
            }
            temp = temp / 10;
        }
        scanner.close();
    }
}






