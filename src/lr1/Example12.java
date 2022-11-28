package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите возраст");
        int a = in.nextInt();

        int b=2022-a;

        System.out.println(" Год рождения " + b );

    }
}