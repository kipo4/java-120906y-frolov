package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите число ");
        int a = in.nextInt();

        System.out.println("Программа выполняется: " + (a/1000)%10);
        }
    }