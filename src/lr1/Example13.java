package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите число a ");
        int a = in.nextInt();

        System.out.println("Ведите число b ");
        int b = in.nextInt();

        int c=a+b;

        System.out.println("Сумма чисел =" + c );
    }
}