package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите первое целое число");
        int x = id.nextInt(); // Запись в переменную x
        System.out.println("Ввведите второе целое число");
        int y = id.nextInt();
        if (x > y) {
            for (int y1 = y; y1 <= x; y1++) {
                System.out.printf("%d\n", y1);
            }
        }
        else { // если y > x
            for (int x1 = x; x1 <= y; x1++) {
                System.out.printf("%d\n", x1);
            }
        }
    }
}