package task5;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 положительных числа: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Оба числа положительные");
        } else {
            System.out.println("Хотя бы одно из чисел отрицательное");
            return;
        }
        int start;
        int end;
        if (x <= y) {
            start = x;
            end = y;
        } else {
            start = y;
            end = x;
        }
        int sum = 0;
        int current = start;
        while (current <= end) {
            sum = sum + current;
            current++;
        }
        System.out.println("Cумма чисел от " + start + " до " + end + " равна " + sum);
        sc.close();
    }
}
