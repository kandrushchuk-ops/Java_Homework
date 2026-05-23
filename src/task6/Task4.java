package task6;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 5};

        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}



//Создать массив (вручную). Отсортировать элементы массива в порядке
//возрастания. Вывести полученный массив. Выполнить с помощью цикла for