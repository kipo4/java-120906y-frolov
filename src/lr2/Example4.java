package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите число ");
        int a = in.nextInt();

        if(a >= 5 && a <= 10){
            System.out.println("Программа выполняется");
        } else{
            System.out.println("Условие ошибочно");
        }
    }
}