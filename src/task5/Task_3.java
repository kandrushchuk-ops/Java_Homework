package task5;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число не заканчивающееся на 0: ");
        int x = scanner.nextInt();
        if (x % 10 == 0) {
            System.out.println("Вы ввели число заканчивающееся на 0");
        } else {
            int reverse = 0;
            int temp = x;
            while (temp > 0) {
                int lastDigit = temp % 10;
                reverse = reverse * 10 + lastDigit;
                temp = temp / 10;
            }
            System.out.println("Обратное число: " + reverse);
            scanner.close();
        }
    }
    }


