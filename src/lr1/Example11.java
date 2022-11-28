package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите имя: ");
        String name = in.nextLine();

        System.out.println("Год рождения: ");
        int a = in.nextInt();

        int b=2022-a;

        System.out.println(name + " ваш возрост " + b );

    }
}