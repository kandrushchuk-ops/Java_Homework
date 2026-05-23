package by.homework.lesson1;

import java.util.Scanner;

public class Task_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число x:");
        int x = scanner.nextInt();

        double result = 15.0 / x; // Приведение к double для точного результата

        switch ((int) result) { // Приводим result к int для switch
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу: " + result);
                break;
        }
    }
}
