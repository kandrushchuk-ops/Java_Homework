package task6;


public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("исходный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                numbers[i] = 0;
            }
        }
        System.out.println("измененный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}


//Создать массив из 10 элементов.
//Заполните массив числами и вывести их в консоль(выводите через цикл for each). Замените каждый
//элемент с нечётным индексом на ноль. Выведите полученный массив в
//консоль через цикл for each