package task6;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[numbers1.length + 1];
        for (int i = 0; i < numbers1.length; i++) {
            numbers2[i] = numbers1[i];
        }
        numbers2[numbers2.length - 1] = 0;
        System.out.println("Второй массив: ");
        for (int i : numbers2) {
            System.out.print(i + " ");
        }
    }
}


//
//Создать массив из 5 чисел и заполните этот массив вручную.
//Создайте второй массив с размерностью больше на 1 чем первый массив. Необходимо скопировать
//первый массив со всеми значениями во второй массив. Последний элемент во втором массиве
//пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.