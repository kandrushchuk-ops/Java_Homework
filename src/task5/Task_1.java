package task5;

public class Task_1 {
    public static void main(String[] args) {
        for (int x = 1; x < 101; x++) {
            if (x % 7 == 0 || x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}
