package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите число ");
        int a = in.nextInt();

        if(a % 5==2 && a % 7==1){
            System.out.println("Программа выполняется");
        } else{
            System.out.println("Условие ошибочно");
        }
    }
}