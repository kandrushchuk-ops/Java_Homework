package task6;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers = {1, 234, 334, 44, 5, 655, 7, 8, 9, 9999};

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        numbers[maxIndex] = 1000;
        numbers[minIndex] = -1000;

        System.out.println("Массив после замены:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}













//
//3.* Создать массив вручную. Заменить максимальный и минимальный элемент
//массива. Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.